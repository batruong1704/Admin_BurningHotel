package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.Hotel_Manager;
import model.tbl_PhieuTraPhong;

public class HoaDonController {
    private static Connection conn = null;
    private static String sql;
    
    public static ArrayList<tbl_PhieuTraPhong> NguonPhong(String sDieuKien) throws SQLException  {
        ArrayList<tbl_PhieuTraPhong> arrPhieuTra = new ArrayList<>();
        Statement state = null;
        try {
            conn = (Connection) DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = """
                  SELECT
                      hd.MaHoaDon,
                      kh.ID,
                      kh.HoTen,
                      ctdp.MaPhong,
                      ctdp.NgayDen,
                      ctdp.NgayDi,
                      pdp.MaNhanVien,
                      pdp.ThanhToanTruoc,
                      DATEDIFF(ctdp.NgayDi, ctdp.NgayDen) AS SoNgayLuuTru,
                      hd.TongTien as tt,
                      CASE
                          WHEN pdp.TongTien - pdp.ThanhToanTruoc = 0 THEN 'Hoàn Thành'
                          WHEN hd.TinhTrang= 'Đã thanh toán' THEN 'Hoàn Thành'
                          ELSE CAST(pdp.TongTien - pdp.ThanhToanTruoc AS VARCHAR(255))
                      END AS ConThieu
                  FROM hoadon hd 
                  JOIN phieudatphong pdp ON hd.MaPDP = pdp.MaPDP
                  JOIN khachhang kh ON kh.ID = pdp.MaKhachHang
                  JOIN chitietdatphong ctdp ON ctdp.MaPDP = pdp.MaPDP           
                  """;
            if (sDieuKien != null && !sDieuKien.equals("")) {
                sql = sql + sDieuKien;
            }
            state = conn.createStatement();
            ResultSet rs = state.executeQuery(sql);
            while (rs.next()) {
                tbl_PhieuTraPhong bp = new tbl_PhieuTraPhong();
                bp.setMahoadon(rs.getString("MaHoaDon"));
                bp.setMakhachhang(rs.getString("ID"));
                bp.setPhong(rs.getString("MaPhong"));
                bp.setNgayden(rs.getString("NgayDen"));
                bp.setNgaydi(rs.getString("NgayDi"));
                bp.setSongayolai(rs.getString("SoNgayLuuTru"));
                bp.setTongthanhtoan(rs.getString("tt"));
                bp.setConthieu(rs.getString("ConThieu"));
                arrPhieuTra.add(bp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
        return arrPhieuTra;
    }
    // TODO: fix
    public static void CapNhatTinhTrang(String tTruong, String tCotUpdate, String gTriUpdate, String tCotDK, String gTriDK) throws SQLException{
        conn = null;
        PreparedStatement state = null;
        conn = DriverManager.getConnection(Hotel_Manager.dbURL);
        sql = "UPDATE "+ tTruong +" SET "+ tCotUpdate +" = "+ gTriUpdate +" WHERE "+ tCotDK + " = '" + gTriDK + "'";
        state = conn.prepareStatement(sql);
        state.execute();
        state.close();
        conn.close();
    }
      public static void CapNhatPDP(String mahoadon, Double tientt) throws SQLException {
      Connection conn = null;
      PreparedStatement state = null;
        try {
        conn = DriverManager.getConnection(Hotel_Manager.dbURL);
        sql = "UPDATE phieudatphong pdp " +
             "SET pdp.ThanhToanTruoc = pdp.ThanhToanTruoc + ? " +
             "WHERE pdp.MaPDP IN (SELECT hd.MaPDP FROM hoadon hd WHERE hd.MaHoaDon = ?)";
                state = conn.prepareStatement(sql);
                state.setDouble(1, tientt);
                state.setString(2, mahoadon);
                state.executeUpdate();

        } finally {
            if (state != null) {
                state.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
}

    public static void CapNhatHoaDon(String mahoadon) throws SQLException{
        conn = null;
        PreparedStatement state = null;
        conn = DriverManager.getConnection(Hotel_Manager.dbURL);
        sql = "UPDATE hoadon SET TinhTrang = 'Đã thanh toán' WHERE MaHoaDon = '" + mahoadon + "'";
        state = conn.prepareStatement(sql);
        state.execute();
        state.close();
        conn.close();
    }
    
    public static void CapNhatPhong(String maphong, String ngaydi) throws SQLException {
        Connection conn = null;
        PreparedStatement state = null;

        try {
            conn = DriverManager.getConnection(Hotel_Manager.dbURL);

            Date ngayhientai = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String ngayht = dateFormat.format(ngayhientai);

            if (ngayht.equals(ngaydi)) {
                String sql = "UPDATE phong SET TrangThai = 'Trống' WHERE MaPhong = ?";
                state = conn.prepareStatement(sql);
                state.setString(1, maphong);
                state.executeUpdate();
            } else {
                System.out.println("Ngày hiện tại không trùng với ngày đi.");
            }
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
}
    
    public static ArrayList<tbl_PhieuTraPhong> NguonPhongBonus(String maKT) throws SQLException  {
        ArrayList<tbl_PhieuTraPhong> arrPhieuTra = new ArrayList<>();
        Statement state = null;
        try {
            conn = (Connection) DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = """
                    SELECT DATEDIFF(ctdp.NgayDi, ctdp.NgayDen) * p.GiaPhong AS ThanhTienP,
                           kh.HoTen,
                           COALESCE(pdv.TongTienDV, 0) AS TongTienDV,
                           COALESCE(pma.TongTienMA, 0) AS TongTienMA
                    FROM hoadon hd
                    JOIN phieudatphong pdp ON hd.MaPDP = pdp.MaPDP
                    JOIN chitietdatphong ctdp ON pdp.MaPDP = ctdp.MaPDP
                    JOIN phong p ON ctdp.MaPhong = p.MaPhong
                    LEFT JOIN phieumonan pma ON pma.MaHoaDon = hd.MaHoaDon
                    LEFT JOIN phieudichvu pdv ON pdp.MaPDP = pdv.MaPDP
                    JOIN khachhang kh ON kh.ID = pdp.MaKhachHang
                    WHERE hd.MaHoaDon = '""" + maKT + "'";
            
            state = conn.createStatement();
            ResultSet rs = state.executeQuery(sql);
            while (rs.next()) {
                tbl_PhieuTraPhong bp = new tbl_PhieuTraPhong();
                bp.setTenkhachhang(rs.getString("HoTen"));
                bp.setGiaphong(rs.getString("ThanhTienP"));
                bp.setGiadichvu(rs.getString("TongTienDV"));
                bp.setGiamonan(rs.getString("TongTienMA"));
                arrPhieuTra.add(bp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
        return arrPhieuTra;
    }
}
