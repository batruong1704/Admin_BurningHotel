/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Dung Nguyen
 */
public class tbl_NhanVien {
    String id,tennv,macv,gioitinh,ngaysinh,sdt,diachi,tendn,passwword,email;

    public tbl_NhanVien(String id, String tennv, String macv, String gioitinh, String ngaysinh, String sdt, String diachi, String tendn, String passwword, String email) {
        this.id = id;
        this.tennv = tennv;
        this.macv = macv;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.sdt = sdt;
        this.diachi = diachi;
        this.tendn = tendn;
        this.passwword = passwword;        this.email = email;

    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
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

    public String getTendn() {
        return tendn;
    }

    public void setTendn(String tendn) {
        this.tendn = tendn;
    }

    public String getPasswword() {
        return passwword;
    }

    public void setPasswword(String passwword) {
        this.passwword = passwword;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
