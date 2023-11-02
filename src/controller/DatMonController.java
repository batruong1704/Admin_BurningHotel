package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Hotel_Manager;
import model.tbl_PhieuTraPhong;

public class DatMonController {
    private static Connection conn = null;
    private static String sql;
    
    public static void NguonPhong(String sDieuKien) {
        Statement state = null;
        try {
            conn = (Connection) DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = "";
            if (sDieuKien != null && !sDieuKien.equals("")) {
                sql = sql + sDieuKien;
            }
            state = conn.createStatement();
            ResultSet rs = state.executeQuery(sql);
            while (rs.next()) {
                tbl_PhieuTraPhong bp = new tbl_PhieuTraPhong();
                bp.setMahoadon(rs.getString("MaHoaDon"));
                bp.setMakhachhang(rs.getString("MaKhachHang"));
                bp.setTenkhachhang(rs.getString("TenKhachHang"));
                bp.setPhong(rs.getString("MaPhong"));
                bp.setNgayden(rs.getString("NgayDen"));
                bp.setNgaydi(rs.getString("NgayDi"));
                bp.setSongayolai(rs.getString("SoNgayLuTru"));
                bp.setGiaphong(rs.getString("ThanhTienP"));
                bp.setGiadichvu(rs.getString("GiaDichVu"));
                bp.setGiasanpham(rs.getString("GiaSanPham"));
                bp.setTongthanhtoan(rs.getString("TongTien"));
                bp.setTiencoc(rs.getString("ConThieu"));
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
    }
    
    
}
