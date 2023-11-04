/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dung Nguyen
 */
public class tbl_ChiTietMonAn {
   
    String MaCTMA, MaMonAn,  ThanhTien;
    int  MaPMA, SoLuong;

    public tbl_ChiTietMonAn(String MaCTMA, String MaMonAn, String ThanhTien, int MaPMA, int SoLuong) {
        this.MaCTMA = MaCTMA;
        this.MaMonAn = MaMonAn;
        this.ThanhTien = ThanhTien;
        this.MaPMA = MaPMA;
        this.SoLuong = SoLuong;
    }

    public String getMaCTMA() {
        return MaCTMA;
    }

    public void setMaCTMA(String MaCTMA) {
        this.MaCTMA = MaCTMA;
    }

    public String getMaMonAn() {
        return MaMonAn;
    }

    public void setMaMonAn(String MaMonAn) {
        this.MaMonAn = MaMonAn;
    }

    public String getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(String ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public int getMaPMA() {
        return MaPMA;
    }

    public void setMaPMA(int MaPMA) {
        this.MaPMA = MaPMA;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
   
}
