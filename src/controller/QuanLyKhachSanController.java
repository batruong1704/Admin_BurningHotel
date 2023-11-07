package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.tbl_NhanVien;
import model.Hotel_Manager;
import static model.Hotel_Manager.dbURL;

public class QuanLyKhachSanController {

    private static Connection conn = null;
    private static String sql, sql2;

    // kiem tra trung ma
    public static boolean KiemTraTrungMa(String tenbang, String tentruong, String manhap, boolean ktThem, String macu) {
        conn = null;
        Statement state = null;
        boolean kq = false;
        try {
            conn = (Connection) DriverManager.getConnection(Hotel_Manager.dbURL);
            if (ktThem == true) {
                sql = "Select * From " + tenbang + " Where " + tentruong + " = '" + manhap + "'";
            } else {
                sql = "Select * From " + tenbang + " Where " + tentruong + " = '" + manhap + "' and " + tentruong + " <> '" + macu + "'";
            }
            state = conn.createStatement();
            ResultSet rs = state.executeQuery(sql);
            if (rs.next()) {
                state.close();
                conn.close();
                kq = true;
            } else {
                state.close();
                conn.close();
                kq = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyKhachSanController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
    
    
   
    public static boolean DoiMatKhau(String mkm, String email, String mkc) {
       
        conn = null;
        PreparedStatement state = null;
        boolean updateSuccess = false;
         try {
        java.sql.Connection conn = DriverManager.getConnection(dbURL);
        sql = "UPDATE nhanvien SET MatKhau = ? WHERE Email = ? AND MatKhau = ?";
        state = conn.prepareStatement(sql);
        state.setString(1, mkm);
        state.setString(2, email);
        state.setString(3, mkc);

        int rowsUpdated = state.executeUpdate();

        if (rowsUpdated > 0) {
            updateSuccess = true;
        } else {
             updateSuccess = false;
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    } 
         return updateSuccess;
    }

    public static void QuenMatKhau(String pw, String sdt, String email) {
        Connection conn = null;
        PreparedStatement state = null;
        try {
            conn = DriverManager.getConnection(Hotel_Manager.dbURL);
            String sql = "UPDATE nhanvien SET MatKhau = ? WHERE SoDienThoai = ? AND Email = ?";
            state = conn.prepareStatement(sql);
            state.setString(1, pw);
            state.setString(2, sdt);
            state.setString(3, email);
            state.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static boolean KiemTraDatLaiMatKhau(String email, String sdt) {
        conn = null;
        Statement state = null;
        boolean kq = false;
        try {
            conn = (Connection) DriverManager.getConnection(Hotel_Manager.dbURL);
            sql = "Select * from nhanvien where Email= '" + email + "' and SoDienThoai='" + sdt + "'";
            state = conn.createStatement();
            ResultSet rs = state.executeQuery(sql);
            if (rs.next()) {
                state.close();
                conn.close();
                kq = true;
            } else {
                state.close();
                conn.close();
                kq = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyKhachSanController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
}
