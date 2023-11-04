package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
                      ctdp.MaPhong,
                      ctdp.NgayDen,
                      ctdp.NgayDi,
                      pdp.MaNhanVien,
                      DATEDIFF(ctdp.NgayDi, ctdp.NgayDen) AS SoNgayLuTru,
                      hd.TongTien,
                      CASE
                          WHEN pdp.TongTien - pdp.ThanhToanTruoc = 0 THEN 'Hoàn Thành'
                          WHEN hd.TinhTrang= 'Đã thanh toán' THEN 'Hoàn Thành'
                          ELSE CAST(pdp.TongTien - pdp.ThanhToanTruoc AS VARCHAR(255))
                      END AS ConThieu
                  FROM hoadon hd
                  JOIN phieudatphong pdp ON hd.MaPDP = pdp.MaPDP
                  JOIN khachhang kh ON kh.ID = pdp.MaKhachHang
                  JOIN chitietdatphong ctdp ON ctdp.MaPDP = pdp.MaPDP
                  LEFT JOIN phieudichvu pdv ON pdv.MaPDP = pdp.MaPDP;
                
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
                bp.setSongayolai(rs.getString("SoNgayLuTru"));
                bp.setTongthanhtoan(rs.getString("TongTien"));
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
    
    public static void CapNhatPhong(String maphong) throws SQLException{
        conn = null;
        PreparedStatement state = null;
        conn = DriverManager.getConnection(Hotel_Manager.dbURL);
        try {
            sql = "UPDATE phong SET TrangThai = 'Trống' WHERE maphong = '" + maphong + "'";
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
        state = conn.prepareStatement(sql);
        state.execute();
        state.close();
        conn.close();
    }
    
    public static ArrayList<tbl_PhieuTraPhong> NguonPhongBonus(String maKT) throws SQLException  {
        ArrayList<tbl_PhieuTraPhong> arrPhieuTra = new ArrayList<>();
        Statement state = null;
        try {
            conn = (Connection) DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = """
                    SELECT DATEDIFF(ctdp.NgayDi, ctdp.NgayDen) * p.GiaPhong AS ThanhTienP,
                           pdv.TongTienDV AS TongTienDV,
                           pma.TongTienMA AS TongTienMA,
                           kh.HoTen,
                           COALESCE(pdv.TongTienDV, 0) AS TongTienDV,
                           COALESCE(pma.TongTienMA, 0) AS TongTienMA,
                           (pdp.ThanhToanTruoc + COALESCE(pma.TongTienMA, 0)) AS DaCoc 
                    FROM hoadon hd
                    JOIN phieudatphong pdp ON hd.MaPDP = pdp.MaPDP
                    JOIN chitietdatphong ctdp ON pdp.MaPDP = ctdp.MaPDP
                    JOIN phong p ON ctdp.MaPhong = p.MaPhong
                    LEFT JOIN phieumonan pma ON hd.MaHoaDon = pma.MaHoaDon
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
                bp.setTiencoc(rs.getString("DaCoc"));
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
