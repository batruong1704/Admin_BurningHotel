package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Hotel_Manager;
import model.tbl_PhieuDatMon;
import model.tbl_PhieuDatMon;

public class DatMonController {
    private static Connection conn = null;
    private static String sql;
    
    public static ArrayList<tbl_PhieuDatMon> NguonPhong(String sDieuKien) throws SQLException  {
        ArrayList<tbl_PhieuDatMon> arrPhieuDatMon = new ArrayList<>();
        Statement state = null;
        try {
            conn = (Connection) DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = "Select *  From khachhang kh, hoadon hd, phong p, phieudatphong dp, chitietdatphong ct "
                    + "where dp.MaPDP = hd.MaPDP and dp.MaKhachHang = kh.ID and dp.MaPDP = ct.MaPDP and p.MaPhong = ct.MaPhong"
                    + "and p.TrangThai = 'Đầy'";
            if (sDieuKien != null && !sDieuKien.equals("")) {
                sql = sql + sDieuKien;
            }
            state = conn.createStatement();
            ResultSet rs = state.executeQuery(sql);
            while (rs.next()) {
                // String maphong, makh, tenkh, email, ngayden, ngaydi, tongtien, con;
//                tbl_PhieuDatMon bp = new tbl_PhieuDatMon();
//                bp.setMaphong(rs.getString("ct.MaPhong"));
//                bp.setMakh(rs.getString("kh.ID"));
//                bp.setTenkh(rs.getString("kh.HoTen"));
//                bp.setEmail(rs.getString("kh.Email"));
//                bp.setNgayden(rs.getString("ct.NgayDen"));
//                bp.setNgaydi(rs.getString("ct.NgayDi"));
//                bp.setTongtien(rs.getString("hd.TongTien"));
//                bp.setCon(rs.getString("dp.ThanhToanTruoc"));
//                arrPhieuDatMon.add(bp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
        return arrPhieuDatMon;
    }
}
