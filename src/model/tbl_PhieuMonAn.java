/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dung Nguyen
 */

public class tbl_PhieuMonAn {
    String MaPMA, MaHD, TongTien;

    public tbl_PhieuMonAn(String MaPMA, String MaHD, String TongTien) {
        this.MaPMA = MaPMA;
        this.MaHD = MaHD;
        this.TongTien = TongTien;
    }

    public String getMaPMA() {
        return MaPMA;
    }

    public void setMaPMA(String MaPMA) {
        this.MaPMA = MaPMA;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getTongTien() {
        return TongTien;
    }

    public void setTongTien(String TongTien) {
        this.TongTien = TongTien;
    }
    
}
