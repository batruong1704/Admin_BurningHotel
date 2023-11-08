package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Hotel_Manager;
import model.tbl_ChucVu;
import model.tbl_DauBep;
import model.tbl_DichVu;
import model.tbl_KhachHang;
import model.tbl_MaGiamGia;
import model.tbl_NhanVien;
import model.tbl_Phong;

import model.tbl_Nhaphanphoi;

public class QuanLyController {
    private static Connection conn = null;
    private static String sql,sql2;
    
    public static ArrayList<tbl_ChucVu> NguonChucVu(String where, String search) throws IOException {
    ArrayList<tbl_ChucVu> arrBoPhan = new ArrayList<>();
    try {
        java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
        sql = "Select * From chucvu " + where;
        if(search != null && !search.equals("") && where != null && !where.equals("")){
                sql = sql + " Where " + where + " Like '%" + search + "%'";
            }
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        // Xử lý kết quả trả về
        while (rs.next()) {
            tbl_ChucVu bp = new tbl_ChucVu();
            bp.setMaChucVu(rs.getString("MaChucVu"));
            bp.setTenChucVu(rs.getString("TenChucVu"));
            bp.setLuongTheoNgay(rs.getString("LuongTheoNgay"));
            arrBoPhan.add(bp);
        }
        ps.close();
        conn.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    } 
    return arrBoPhan;
}
    
    public static ArrayList<tbl_ChucVu> ChucVu() throws IOException {
    ArrayList<tbl_ChucVu> arrBoPhan = new ArrayList<>();
    try {
        java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
        sql = "Select * From ChucVu " ;
        
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        // Xử lý kết quả trả về
        while (rs.next()) {
            tbl_ChucVu bp = new tbl_ChucVu();
            bp.setMaChucVu(rs.getString("MaChucVu"));
            bp.setTenChucVu(rs.getString("TenChucVu"));
            bp.setLuongTheoNgay(rs.getString("LuongTheoNgay"));
            arrBoPhan.add(bp);
        }
        ps.close();
        conn.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    } 
    return arrBoPhan;
}

    public static void ThemBoPhan(tbl_ChucVu bp) {
        conn = null;
        PreparedStatement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = "INSERT INTO ChucVu (MaChucVu, TenChucVu, LuongTheoNgay) VALUES (?, ?, ?)";
            state = conn.prepareStatement(sql);
            state.setString(1, bp.getMaChucVu());
            state.setString(2, bp.getTenChucVu());
            state.setString(3, bp.getLuongTheoNgay());
            state.execute();
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }

    public static void CapNhapBoPhan(tbl_ChucVu bp, String mabophan) {
        conn = null;
        PreparedStatement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = "UPDATE ChucVu SET MaChucVu = ?, TenChucVu = ?, LuongTheoNgay = ? WHERE MaChucVu = ?";
            state = conn.prepareStatement(sql);
            state.setString(1, bp.getMaChucVu());
            state.setString(2, bp.getTenChucVu());
            state.setString(3, bp.getLuongTheoNgay());
            state.setString(4, mabophan);
            state.execute();
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    public static void XoaNganh( String mabophan) {
        conn = null;
        PreparedStatement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = "DELETE FROM ChucVu WHERE MaChucVu = ?";
            state = conn.prepareStatement(sql);
            state.setString(1, mabophan);
            state.execute();
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    
    public static ArrayList<tbl_Phong> NguonPhong() throws IOException {
        ArrayList<tbl_Phong> arrPhong = new ArrayList<>();
        Statement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            // Thực hiện truy vấn và lấy kết quả trả về
            sql = "Select * From Phong Order by MaPhong";
            state = conn.createStatement();
            ResultSet rs = state.executeQuery(sql);
            // Xử lý kết quả trả về
            while (rs.next()) {
                tbl_Phong bp = new tbl_Phong();
                bp.setMaPhong(rs.getString("MaPhong"));
                bp.setLoaiPhong(rs.getString("LoaiPhong"));
                bp.setKieuPhong(rs.getString("KieuPhong"));
                bp.setSLMax(rs.getString("SLMax"));
                bp.setLoaiGiuong(rs.getString("LoaiGiuong"));
                bp.setGiaPhong(rs.getString("GiaPhong"));

//                bp.setIMG(rs.getString("IMG"));
                bp.setDienTich(rs.getString("DienTich"));
                bp.setTamNhin(rs.getString("TamNhin"));
                bp.setMoTa(rs.getString("MoTa"));
                if(rs.getString("TrangThai").equals("Trống")){
                    bp.setTinhTrang("Trống");

                } else {
                    bp.setTinhTrang("Đầy");
                }
                arrPhong.add(bp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return arrPhong;
    }
    
  
        public static ArrayList<String> LoaiPhong() throws SQLException {
            ArrayList<String> arrLoaiPhong = new ArrayList<>();
            Statement state = null;

            try {
                java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
                // Thực hiện truy vấn và lấy kết quả trả về
                String sql = "SELECT DISTINCT LoaiPhong FROM Phong"; 
                state = conn.createStatement();
                ResultSet rs = state.executeQuery(sql);

                // Xử lý kết quả trả về
                while (rs.next()) {
                    String loaiPhong = rs.getString("LoaiPhong");
                    arrLoaiPhong.add(loaiPhong);
                }

                state.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            return arrLoaiPhong;
        }


    
    public static void ThemPhong(tbl_Phong bp) {
        conn = null;
        PreparedStatement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = "INSERT INTO Phong VALUES(?, ?, ?, ?, ?, ?, ?,?,?,?,?)";
            state = conn.prepareStatement(sql);
            state.setString(1, bp.getMaPhong());
            state.setString(2, bp.getLoaiPhong());
            state.setString(3, bp.getKieuPhong());
            state.setString(4, bp.getSLMax());
            state.setString(5, bp.getLoaiGiuong());
            state.setString(6, bp.getGiaPhong());
            state.setString(7, bp.getIMG());
            state.setString(8, bp.getDienTich());
            state.setString(9, bp.getTamNhin());
            state.setString(10, bp.getMoTa());
            state.setString(11, bp.getTinhTrang());
            

            state.execute();
        } catch (SQLException ex) {
        } 
    }
    public static void CapNhatPhong(tbl_Phong bp, String maphong) {
        conn = null;
        PreparedStatement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);

            sql = "UPDATE phong SET MaPhong = ?, LoaiPhong = ?,KieuPhong = ?, SLMax = ?, LoaiGiuong=?, GiaPhong = ?, IMG=?, DienTich=?, TamNhin=?,MoTa = ?, TrangThai = ? WHERE MaPhong = ?";

            state = conn.prepareStatement(sql);
            state.setString(1, bp.getMaPhong());
            state.setString(2, bp.getLoaiPhong());
            state.setString(3, bp.getKieuPhong());
            state.setString(4, bp.getSLMax());
            state.setString(5, bp.getLoaiGiuong());
            state.setString(6, bp.getGiaPhong());
            state.setString(7, bp.getIMG());
            state.setString(8, bp.getDienTich());
            state.setString(9, bp.getTamNhin());
            state.setString(10, bp.getMoTa());
            state.setString(11, bp.getTinhTrang());
            state.setString(12, maphong);

            state.execute();
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    public static void XoaPhong( String maphong) {
        conn = null;
        PreparedStatement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = "DELETE FROM Phong WHERE MaPhong = ?";
            state = conn.prepareStatement(sql);
            state.setString(1, maphong);
            state.execute();
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    
    public static List<tbl_KhachHang> NguonKhachHang(String sMaKT) throws IOException {
        List<tbl_KhachHang> arrKhachHang = new ArrayList<>();
        Statement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            // Thực hiện truy vấn và lấy kết quả trả về
            sql = "Select * From khachhang";
            if(sMaKT != null && !sMaKT.equals("")){
                sql = sql + " Where ID ='" + sMaKT + "'";
            }
            sql = sql + " order by ID";
            state = conn.createStatement();
            ResultSet rs = state.executeQuery(sql);
            // Xử lý kết quả trả về
            while (rs.next()) {
                tbl_KhachHang bp = new tbl_KhachHang();
                bp.setMakh(rs.getString("ID"));
                bp.setTenkh(rs.getString("HoTen"));
                bp.setSdt(rs.getString("SDT"));
                bp.setEmail(rs.getString("Email"));
                bp.setCmnd(rs.getString("CMND"));
                bp.setDiachi(rs.getString("DiaChi"));
                if(rs.getString("GioiTinh").equals("1")){
                    bp.setGioitinh("Nam");

                } else {
                    bp.setGioitinh("Nữ");
                }
                arrKhachHang.add(bp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        return arrKhachHang;
    }
    
    public static void ThemKhachHang(tbl_KhachHang bp) {
        conn = null;
        PreparedStatement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = "INSERT INTO khachhang (ID, HoTen, SDT, Email, CMND, DiaChi, GioiTinh, PassWord, AccessToken) VALUES(?, ?, ?, ?, ?, ?,?,NULL,NULL)";
            state = conn.prepareStatement(sql);
            state.setString(1, bp.getMakh());
            state.setString(2, bp.getTenkh());
            state.setString(3, bp.getSdt());
            state.setString(4, bp.getEmail());
            state.setString(5, bp.getCmnd());
            state.setString(6, bp.getDiachi());
            state.setString(7, bp.getGioitinh());
            state.execute();
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void CapNhapKhachHang(tbl_KhachHang bp, String macu) {
        conn = null;
        PreparedStatement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = "UPDATE khachhang SET ID = ?, HoTen = ?, SDT = ?,Email=?,CMND = ?,DiaChi = ?, GioiTinh = ?   WHERE ID = ?";
            state = conn.prepareStatement(sql);
            state.setString(1, bp.getMakh());
            state.setString(2, bp.getTenkh());
            state.setString(3, bp.getSdt());
            state.setString(4, bp.getEmail());
            state.setString(5, bp.getCmnd());
            state.setString(6, bp.getDiachi());
            state.setString(7, bp.getGioitinh());
            state.setString(8, macu);
            state.execute();
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }

    public static void XoaKhachHang(String makh) {
        conn = null;
        PreparedStatement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = "DELETE FROM khachhang WHERE ID = ?";
            state = conn.prepareStatement(sql);
            state.setString(1, makh);
            state.execute();
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    
    public static List<tbl_DichVu> NguonDichVu() throws IOException {
        List<tbl_DichVu> arrDichVu = new ArrayList<>();
        Statement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            // Thực hiện truy vấn và lấy kết quả trả về
            sql = "Select * From DichVu Order by MaDichVu";
            state = conn.createStatement();
            ResultSet rs = state.executeQuery(sql);
            // Xử lý kết quả trả về
            while (rs.next()) {
                tbl_DichVu bp = new tbl_DichVu();
                bp.setMadichvu(rs.getString("MaDichVu"));
                bp.setTendichvu(rs.getString("TenDichVu"));
                bp.setGiadichvu(rs.getString("DonGia"));
                arrDichVu.add(bp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return arrDichVu;
    }
    
    public static void ThemDichVu(tbl_DichVu bp) {
        conn = null;
        PreparedStatement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = "INSERT INTO DichVu (MaDichVu, TenDichVu, DonGia) VALUES(?, ?, ?)";
            state = conn.prepareStatement(sql);
            state.setString(1, bp.getMadichvu());
            state.setString(2, bp.getTendichvu());
            state.setString(3, bp.getGiadichvu());
            state.execute();
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void CapNhapDichVu(tbl_DichVu bp, String macu) {
        conn = null;
        PreparedStatement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = "UPDATE DichVu SET MaDichVu = ?, TenDichVu = ?, DonGia = ? WHERE MaDichVu = ?";
            state = conn.prepareStatement(sql);
            state.setString(1, bp.getMadichvu());
            state.setString(2, bp.getTendichvu());
            state.setString(3, bp.getGiadichvu());
            state.setString(4, macu);
            state.execute();
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void XoaDichVu( String macu) {
        conn = null;
        PreparedStatement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = "DELETE FROM DichVu WHERE MaDichVu = ?";
            state = conn.prepareStatement(sql);
            state.setString(1, macu);
            state.execute();
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static  List<tbl_Nhaphanphoi> LoadDataToArrayNhaCungCap(String kt){
        List<tbl_Nhaphanphoi> arrncc = new ArrayList<>();
        try{
            conn=DriverManager.getConnection(Hotel_Manager.dbURL);
            Statement st=conn.createStatement();
            String sql="select * from nhacungcap";
           if (kt != null && !kt.equals("")) {
                sql = sql + " where MaCongTy like N'%" + kt + "%'";
               
            }
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                String macty=rs.getString("MaCongTy");
                String tencty=rs.getString("TenCongTy");
                String diachi=rs.getString("DiaChi");
                String email=rs.getString("Email");
                String sdt=rs.getString("DienThoai");
                
                tbl_Nhaphanphoi ncc= new tbl_Nhaphanphoi(macty, tencty, diachi, email, sdt);
                arrncc.add(ncc);
            }
            conn.close();
            st.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }     
        return arrncc;
    }
    
         public static void XoaNhaCungCap( String macty) {
         conn = null;
        PreparedStatement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
             sql = "DELETE FROM nhacungcap WHERE MaCongTy = ?";
           
            state = conn.prepareStatement(sql);
            state.setString(1, macty);
            state.execute();
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    
    public static void ThemNhaCungCap(tbl_Nhaphanphoi ncc){
        conn = null;
        PreparedStatement pst = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = "insert into  nhacungcap (MaCongTy,TenCongty,DiaChi,Email,DienThoai) values (?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, ncc.getMact());
            pst.setString(2, ncc.getTenct());
            pst.setString(3,ncc.getDiachi());
            pst.setString(4, ncc.getEmail());
            pst.setString(5,ncc.getDienthoai());
            pst.execute();
            pst.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    
    public static void CapNhapNhaCungCap(tbl_Nhaphanphoi ncc, String mabophan) {
        conn = null;
        PreparedStatement pst = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = "UPDATE nhacungcap SET MaCongTy = ?, TenCongTy = ?, DiaChi = ?, Email = ?, DienThoai = ?  WHERE MaCongTy = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, ncc.getMact());
            pst.setString(2, ncc.getTenct());
            pst.setString(3,ncc.getDiachi());
            pst.setString(4, ncc.getEmail());
            pst.setString(5, ncc.getDienthoai());
            pst.setString(6, mabophan);
            pst.execute();
            pst.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    public static List<tbl_DauBep> NguonDauBep(String sMaKT,String tCot) throws IOException {
        List<tbl_DauBep> arrDauBep = new ArrayList<>();
        Statement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            // Thực hiện truy vấn và lấy kết quả trả về
            sql = "Select * From daubep";
            if(sMaKT != null && !sMaKT.equals("")){
                if (sMaKT != null && !sMaKT.equals("")) {
                   sql = sql + " WHERE " + tCot + " LIKE '%" + sMaKT + "%'";
                }
            }
            sql = sql + " order by ID";
            state = conn.createStatement();
            ResultSet rs = state.executeQuery(sql);
            // Xử lý kết quả trả về
            while (rs.next()) {
                tbl_DauBep db = new tbl_DauBep();
                db.setId(rs.getString("ID"));
                db.setHoten(rs.getString("HoTen"));
                db.setGioitinh(rs.getString("GioiTinh"));
                db.setNgaysinh(rs.getString("NgaySinh"));
                db.setChucvu(rs.getString("MaChucVu"));
                db.setSonamkn(rs.getString("SoNamKinhNghiem"));
                db.setEmail(rs.getString("Email"));
                db.setSdt(rs.getString("SoDienThoai"));
                db.setDiachi(rs.getString("DiaChi"));
                db.setMota(rs.getString("MoTa"));
                db.setHinhanh(rs.getString("HinhAnh"));
                arrDauBep.add(db);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        return arrDauBep;
    }
    public static List<String> NguonCBBDauBep() throws SQLException{
        List<String> fields = new ArrayList<>();
        Statement state = null;
        java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            // Thực hiện truy vấn và lấy kết quả trả về
            sql = "SHOW COLUMNS FROM daubep";
            state = conn.createStatement();
            ResultSet rs = state.executeQuery(sql);
             while (rs.next()) {
            // Lấy tên trường và thêm vào danh sách
            String fieldName = rs.getString("Field");
            fields.add(fieldName);
        }
        return fields;
    } 
    public static void ThemDauBep(tbl_DauBep db) {
        conn = null;
        PreparedStatement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = "INSERT INTO DauBep (ID, HoTen, GioiTinh, NgaySinh, MaChucVu, SoNamKinhNghiem, Email, SoDienThoai, DiaChi, MoTa, HinhAnh) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            state = conn.prepareStatement(sql);
            state.setString(1, db.getId());
            state.setString(2, db.getHoten());
            state.setString(3, db.getGioitinh());
            state.setString(4, db.getNgaysinh());
            state.setString(5, db.getChucvu());
            state.setString(6, db.getSonamkn());
            state.setString(7, db.getEmail());
            state.setString(8, db.getSdt());
            state.setString(9, db.getDiachi());
            state.setString(10, db.getMota());
            state.setString(11, db.getHinhanh());
            state.execute();
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void CapNhapDauBep(tbl_DauBep db, String macu) {
        conn = null;
        PreparedStatement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = "UPDATE DauBep SET ID = ?, HoTen = ?, GioiTinh= ?, NgaySinh= ?, MaChucVu = ?, SoNamKinhNghiem = ?, Email = ?, SoDienThoai = ?, DiaChi = ?, MoTa = ?, HinhAnh = ?  WHERE ID = ?";
            state = conn.prepareStatement(sql);
            state.setString(1, db.getId());
            state.setString(2, db.getHoten());
            state.setString(3, db.getGioitinh());
            state.setString(4, db.getNgaysinh());
            state.setString(5, db.getChucvu());
            state.setString(6, db.getSonamkn());
            state.setString(7, db.getEmail());
            state.setString(8, db.getSdt());
            state.setString(9, db.getDiachi());
            state.setString(10, db.getMota());
            state.setString(11, db.getHinhanh());
            state.setString(12, macu);
            state.execute();
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }

    public static void XoaDauBep(String id) {
        conn = null;
        PreparedStatement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = "DELETE FROM DauBep WHERE ID = ?";
            state = conn.prepareStatement(sql);
            state.setString(1, id);
            state.execute();
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    
    public static List<tbl_MaGiamGia> NguonMaGiamGia(String sMaKT) throws IOException {
        List<tbl_MaGiamGia> arrMaGiamGia = new ArrayList<>();
        Statement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            // Thực hiện truy vấn và lấy kết quả trả về
            sql = "Select * From PhieuGiamGia";
            if(sMaKT != null && !sMaKT.equals("")){
                sql = sql + " Where MaGiamGia ='" + sMaKT + "'";
            }
            sql = sql + " order by MaGiamGia";
            state = conn.createStatement();
            ResultSet rs = state.executeQuery(sql);
            // Xử lý kết quả trả về
            while (rs.next()) {
                tbl_MaGiamGia mgg = new tbl_MaGiamGia();
                mgg.setMagiamgia(rs.getString("MaGiamGia"));
                mgg.setTenmagiamgia(rs.getString("TenMaGiamGia"));
                mgg.setChietkhau(rs.getString("ChietKhau"));
                if(rs.getString("TinhTrang").equals("1")){
                    mgg.setTinhtrang("Còn Hạn Sử Dụng");
                } else {
                    mgg.setTinhtrang("Hết Hạn Sử Dụng");
                }
                arrMaGiamGia.add(mgg);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        return arrMaGiamGia;
    }
    
    public static void ThemMaGiamGia(tbl_MaGiamGia mgg) {
        conn = null;
        PreparedStatement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = "INSERT INTO PhieuGiamGia (MaGiamGia, TenMaGiamGia, ChietKhau, TinhTrang) VALUES(?, ?, ?, ?)";
            state = conn.prepareStatement(sql);
            state.setString(1, mgg.getMagiamgia());
            state.setString(2, mgg.getTenmagiamgia());
            state.setString(3, mgg.getChietkhau());
            state.setString(4, mgg.getTinhtrang());
            state.execute();
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void CapNhapMaGiamGia(tbl_MaGiamGia mgg, String macu) {
        conn = null;
        PreparedStatement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = "UPDATE PhieuGiamGia SET MaGiamGia = ?, TenMaGiamGia = ?, ChietKhau = ?, TinhTrang = ? WHERE MaGiamGia = ?";
            state = conn.prepareStatement(sql);
            state.setString(1, mgg.getMagiamgia());
            state.setString(2, mgg.getTenmagiamgia());
            state.setString(3, mgg.getChietkhau());
            state.setString(4, mgg.getTinhtrang());
            state.setString(5, macu);
            state.execute();
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }

    public static void XoaMaGiamGia(String magiamgia) {
        conn = null;
        PreparedStatement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = "DELETE FROM PhieuGiamGia WHERE MaGiamGia = ?";
            state = conn.prepareStatement(sql);
            state.setString(1, magiamgia);
            state.execute();
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    
    
        public static List<tbl_NhanVien> NguonNhanVien(String sMaKT) throws IOException {
        List<tbl_NhanVien> arrNhanVien = new ArrayList<>();
        Statement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            // Thực hiện truy vấn và lấy kết quả trả về
            sql = "Select * From NhanVien";
            if(sMaKT != null && !sMaKT.equals("")){
                sql = sql + " Where MaNhanVien ='" + sMaKT + "'";
            }
            sql = sql + " order by MaNhanVien";
            state = conn.createStatement();
            ResultSet rs = state.executeQuery(sql);
            // Xử lý kết quả trả về
            while (rs.next()) {
                tbl_NhanVien bp = new tbl_NhanVien();
                bp.setid(rs.getString("MaNhanVien"));
                bp.setHoten(rs.getString("HoTen"));
                bp.setMacv(rs.getString("MaChucVu"));
                bp.setNgaysinh(rs.getString("NgaySinh"));
                if(rs.getString("GioiTinh").equals("1")){
                    bp.setGioitinh("Nam");

                } else {
                    bp.setGioitinh("Nữ");
                }
                bp.setDiachi(rs.getString("DiaChi"));
                bp.setEmail(rs.getString("Email"));
                bp.setSdt(rs.getString("SoDienThoai"));
                bp.setMatkhau(rs.getString("MatKhau"));
                arrNhanVien.add(bp);
            }
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        return arrNhanVien;
    }
    
    public static void ThemNhanVien(tbl_NhanVien bp) {
        conn = null;
        PreparedStatement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = "INSERT INTO NhanVien (MaNhanVien, HoTen, MaChucVu, NgaySinh, GioiTinh, DiaChi, Email, SoDienThoai, MatKhau) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            state = conn.prepareStatement(sql);
            state.setString(1, bp.getid());
            state.setString(2, bp.getHoten());
            state.setString(3, bp.getMacv());
            state.setString(4, bp.getNgaysinh());
            state.setString(5, bp.getGioitinh());
            state.setString(6, bp.getDiachi());
            state.setString(7, bp.getEmail());
            state.setString(8, bp.getSdt());
            state.setString(9, bp.getMatkhau());
            state.execute();
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void CapNhatNhanVien(tbl_NhanVien bp, String macu) {
        conn = null;
        PreparedStatement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = "UPDATE NhanVien SET MaNhanVien = ?, HoTen = ?, MaChucVu = ?,  NgaySinh = ?, GioiTinh = ?, DiaChi = ?, Email = ?, SoDienThoai = ?, MatKhau = ? WHERE MaNhanVien = ?";
            state = conn.prepareStatement(sql);
            state.setString(1, bp.getid());
            state.setString(2, bp.getHoten());
            state.setString(3, bp.getMacv());
            state.setString(4, bp.getNgaysinh());
            state.setString(5, bp.getGioitinh());
            state.setString(6, bp.getDiachi());
            state.setString(7, bp.getEmail());
            state.setString(8, bp.getSdt());
            state.setString(9, bp.getMatkhau());
            state.setString(10, macu);
            state.execute();
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }

    public static void XoaNhanVien(String manv) {
        conn = null;
        PreparedStatement state = null;
        try {
            java.sql.Connection conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = "DELETE FROM NhanVien WHERE MaNhanVien = ?";
            state = conn.prepareStatement(sql);
            state.setString(1, manv);
            state.execute();
            state.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    
    public static String NguonTruyVanDuLieuDauBep(String sTenCotGT, String sMaKT) throws IOException {
        String ketqua = "";
        Statement state = null;
        try {
            conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            // Thực hiện truy vấn và lấy kết quả trả về
            sql = "Select " + sTenCotGT + " from daubep where ID = '" + sMaKT + "'";
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
    public static String NguonTruyVanDuLieuPhong(String sTenCotGT, String sMaKT) throws IOException {
        String ketqua = "";
        Statement state = null;
        try {
            conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            // Thực hiện truy vấn và lấy kết quả trả về
            sql = "Select " + sTenCotGT + " from phong where MaPhong = '" + sMaKT + "'";
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