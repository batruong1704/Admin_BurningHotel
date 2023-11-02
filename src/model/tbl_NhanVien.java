/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dung Nguyen
 */
public class tbl_NhanVien {
    String id, hoten, macv, ngaysinh, gioitinh, diachi, email, sdt, matkhau;

    public tbl_NhanVien() {}
    
    public tbl_NhanVien(String id, String hoten, String macv, String ngaysinh, String gioitinh, String diachi, String email, String sdt, String matkhau) {
        this.id = id;
        this.hoten = hoten;
        this.macv = macv;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.email = email;
        this.sdt = sdt;
        this.matkhau = matkhau;
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getMacv() {
        return macv;
    }

    public void setMacv(String macv) {
        this.macv = macv;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }
    
}
