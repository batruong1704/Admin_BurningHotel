package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Hotel_Manager;
import model.tbl_MonAn;
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
    
    
    public static List<tbl_MonAn> NguonMonAn(String Category, String Content) {
        List<tbl_MonAn> arrMonAn = new ArrayList<>();
        Statement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            // Thực hiện truy vấn và lấy kết quả trả về
            sql = "Select * From doan ";
            if (Category != null && !Category.equals("")) {
                sql = sql + " Where " + Category + " Like '%" + Content + "%'";
            }
            sql = sql + " Order by ID";
            state = conn.createStatement();
            ResultSet rs = state.executeQuery(sql);
            // Xử lý kết quả trả về
            while (rs.next()) {
                tbl_MonAn bp = new tbl_MonAn();
                bp.setID(rs.getString("ID"));
                bp.setTenMon(rs.getString("TenMon"));
                bp.setPhanLoai(rs.getString("PhanLoai"));
                bp.setThoiGianNau(rs.getString("ThoiGianNau"));
                bp.setDoKho(rs.getString("DoKho"));
                bp.setThanhPhan(rs.getString("ThanhPhan"));
                bp.setHamLuongKalo(rs.getString("HamLuongKalo"));
                bp.setThanhTien(rs.getString("ThanhTien"));
                bp.setMoTa(rs.getString("MoTa"));
                bp.setSoLuongDaBan(rs.getString("SoLuongDaBan"));
                arrMonAn.add(bp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return arrMonAn;
    }
    
    public static ArrayList<String> layDanhSachPhanLoai() {
        ArrayList<String> danhSachPhanLoai = new ArrayList<>();
        
        try {
            try (java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL)) {
                sql = "SELECT DISTINCT PhanLoai FROM doan";
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
                
                while (resultSet.next()) {
                    String phanLoai = resultSet.getString("PhanLoai");
                    danhSachPhanLoai.add(phanLoai);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return danhSachPhanLoai;
    }
}
