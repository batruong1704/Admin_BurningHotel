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
                      kh.HoTen,
                      kh.Email,
                      kh.SDT,
                      ctdp.MaPhong,
                      ctdp.NgayDen,
                      ctdp.NgayDi,
                      pdp.MaNhanVien,
                      DATEDIFF(ctdp.NgayDi, ctdp.NgayDen) AS SoNgayLuTru,
                      pdp.TongTien,
                      pdv.TongTienDV,
                      DATEDIFF(ctdp.NgayDi, ctdp.NgayDen) * p.GiaPhong AS ThanhTienP,
                      CASE
                          WHEN pdp.TongTien - pdp.ThanhToanTruoc = 0 THEN 'Hoàn Thành'
                          ELSE CAST(pdp.TongTien - pdp.ThanhToanTruoc AS VARCHAR(255))
                      END AS ConThieu
                      
                  FROM hoadon hd
                  JOIN phieudatphong pdp ON hd.MaPDP = pdp.MaPDP
                  JOIN khachhang kh ON kh.ID = pdp.MaKhachHang
                  JOIN chitietdatphong ctdp ON ctdp.MaPDP = pdp.MaPDP
                  JOIN phong p ON p.MaPhong = ctdp.MaPhong
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
                bp.setTenkhachhang(rs.getString("HoTen"));
                bp.setEmailkhachhang(rs.getString("Email"));
                bp.setSdt(rs.getString("SDT"));
                bp.setPhong(rs.getString("MaPhong"));
                bp.setNgayden(rs.getString("NgayDen"));
                bp.setNgaydi(rs.getString("NgayDi"));
                bp.setSongayolai(rs.getString("SoNgayLuTru"));
                bp.setGiaphong(rs.getString("ThanhTienP"));
                bp.setGiadichvu(rs.getString("TongTienDV"));
                bp.setTongthanhtoan(rs.getString("TongTien"));
                bp.setTiencoc(rs.getString("ConThieu"));
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
    
    public static void CapNhatHoaDon(String mahoadon, double thanhtoan) throws SQLException{
        conn = null;
        PreparedStatement state = null;
        conn = DriverManager.getConnection(Hotel_Manager.dbURL);
        sql = "UPDATE hoadon SET tiencoc = " + thanhtoan + " WHERE MaHoaDon = '" + mahoadon + "'";
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
            sql = "UPDATE phong SET tinhtrang = 0 WHERE maphong = '" + maphong + "'";
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
                  SELECT dp.ThanhTienP, sp.TongTien as TongTienSP, dv.TongTien TongTienDV, kh.TenKhachHang, hd.TienCoc
                  FROM hoadon hd, phieudatphong dp, phieusanpham sp, phieudichvu dv, khachhang kh
                  WHERE hd.MaPhieuDatPhong = dp.MaPhieuDatPhong AND hd.MaPhieuDichVu = dv.MaPhieuDichVu AND hd.MaPhieuSanPham=sp.MaPhieuSanPham
                  and kh.MaKhachHang = dp.MaKhachHang
                  and hd.MaHoaDon = '""" + maKT +"'";
            
            state = conn.createStatement();
            ResultSet rs = state.executeQuery(sql);
            while (rs.next()) {
                tbl_PhieuTraPhong bp = new tbl_PhieuTraPhong();
                bp.setTenkhachhang(rs.getString("TenKhachHang"));
                bp.setGiaphong(rs.getString("ThanhTienP"));
                bp.setGiadichvu(rs.getString("TongTienDV"));
                bp.setTiencoc(rs.getString("TienCoc"));
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