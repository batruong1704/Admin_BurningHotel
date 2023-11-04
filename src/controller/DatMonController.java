package controller;

import java.io.IOException;
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
import model.tbl_PhieuTraPhong;
import java.sql.PreparedStatement;

public class DatMonController {

    private static Connection conn = null;
    private static String sql;

    public static ArrayList<tbl_PhieuDatMon> NguonPhong(String sDieuKien) throws SQLException {
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
        PreparedStatement preparedStatement = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = "SELECT * FROM doan";

            // Kiểm tra xem có điều kiện tìm kiếm không
            if (!Category.isEmpty() && !Content.isEmpty()) {
                sql += " WHERE " + Category + " LIKE ?";
            }

            preparedStatement = conn.prepareStatement(sql);

            if (!Category.isEmpty() && !Content.isEmpty()) {
                preparedStatement.setString(1, "%" + Content + "%");
            }

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                tbl_MonAn bp = new tbl_MonAn();
                bp.setID(rs.getString("ID"));
                bp.setTenMon(rs.getString("TenMon"));
                bp.setPhanLoai(rs.getString("PhanLoai"));
                bp.setThoiGianNau(rs.getString("ThoiGianNau"));
                bp.setDoKho(rs.getString("DoKho"));
                bp.setThanhPhan(rs.getString("ThanhPhan"));
                bp.setHamLuongKalo(rs.getString("HamLuongcalo"));
                bp.setThanhTien(rs.getString("ThanhTien"));
                bp.setMoTa(rs.getString("MoTa"));
                bp.setSoLuongDaBan(rs.getString("SoLuongDaBan"));
                arrMonAn.add(bp);
            }

            rs.close();
            preparedStatement.close();
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

    public static ArrayList<tbl_PhieuTraPhong> NguonBonus(String maKT) throws SQLException {
        ArrayList<tbl_PhieuTraPhong> arrPhieuTra = new ArrayList<>();
        Statement state = null;
        try {
            conn = (Connection) DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = """
                  SELECT pdp.MaKhachHang, hd.MaHoaDon, php.TongTien
                  FROM hoadon hd, phieudatphong pdp
                  WHERE hd.MaPhieuDatPhong = pdp.MaPhieuDatPhong
                  and hd.MaHoaDon = '""" + maKT + "'";

            state = conn.createStatement();
            ResultSet rs = state.executeQuery(sql);
            while (rs.next()) {
                tbl_PhieuTraPhong bp = new tbl_PhieuTraPhong();
                bp.setMakhachhang(rs.getString("MaKhachHang"));
                bp.setMahoadon(rs.getString("MaHoaDon"));
                bp.setGiaphong(rs.getString("TongTien"));
                arrPhieuTra.add(bp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
        return arrPhieuTra;
    }

    public static String NguonTruyVanDuLieu(String sTenCotGT) throws IOException {
        String ketqua = "";
        Statement state = null;
        try {
            conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            // Thực hiện truy vấn và lấy kết quả trả về
            sql = "Select " + sTenCotGT + " from phieudatphong pdp, hoadon hd, chitietdatphong ctdp where pdp.MaPDP = hd.MaPDP and hd.MaPDP = ctdp.MaPDP";
            state = conn.createStatement();
            ResultSet rs = state.executeQuery(sql);
            // Xử lý kết quả trả về
            while (rs.next()) {
                ketqua = rs.getString(sTenCotGT);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ketqua;
    }
}
