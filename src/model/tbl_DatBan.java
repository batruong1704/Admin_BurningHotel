/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class tbl_DatBan {
    String ID, MaKhachHang, SoLuong,ThoiGian,NgayDat, NgayDen, TinhTrang,MaNhanVien;
    
    public tbl_DatBan(){}
    
    public tbl_DatBan(String ID, String MaKhachHang, String SoLuong, String ThoiGian, String NgayDat, String NgayDen, String TinhTrang, String MaNhanVien) {
        this.ID = ID;
        this.MaKhachHang = MaKhachHang;
        this.SoLuong = SoLuong;
        this.ThoiGian = ThoiGian;
        this.NgayDat = NgayDat;
        this.NgayDen = NgayDen;
        this.TinhTrang = TinhTrang;
        this.MaNhanVien = MaNhanVien;
    }
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(String ThoiGian) {
        this.ThoiGian = ThoiGian;
    }

    public String getNgayDat() {
        return NgayDat;
    }

    public void setNgayDat(String NgayDat) {
        this.NgayDat = NgayDat;
    }

    public String getNgayDen() {
        return NgayDen;
    }

    public void setNgayDen(String NgayDen) {
        this.NgayDen = NgayDen;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }
}
