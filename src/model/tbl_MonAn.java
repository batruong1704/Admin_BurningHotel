/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 05032002
 */
public class tbl_MonAn {
    String ID, TenMon, PhanLoai, ThoiGianNau, DoKho, ThanhPhan, HamLuongKalo, ThanhTien, MoTa, SoLuongDaBan;

    public tbl_MonAn() {
    }

    public tbl_MonAn(String ID, String TenMon, String PhanLoai, String ThoiGianNau, String DoKho, String ThanhPhan, String HamLuongKalo, String ThanhTien, String MoTa, String SoLuongDaBan) {
        this.ID = ID;
        this.TenMon = TenMon;
        this.PhanLoai = PhanLoai;
        this.ThoiGianNau = ThoiGianNau;
        this.DoKho = DoKho;
        this.ThanhPhan = ThanhPhan;
        this.HamLuongKalo = HamLuongKalo;
        this.ThanhTien = ThanhTien;
        this.MoTa = MoTa;
        this.SoLuongDaBan = SoLuongDaBan;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public String getPhanLoai() {
        return PhanLoai;
    }

    public void setPhanLoai(String PhanLoai) {
        this.PhanLoai = PhanLoai;
    }

    public String getThoiGianNau() {
        return ThoiGianNau;
    }

    public void setThoiGianNau(String ThoiGianNau) {
        this.ThoiGianNau = ThoiGianNau;
    }

    public String getDoKho() {
        return DoKho;
    }

    public void setDoKho(String DoKho) {
        this.DoKho = DoKho;
    }

    public String getThanhPhan() {
        return ThanhPhan;
    }

    public void setThanhPhan(String ThanhPhan) {
        this.ThanhPhan = ThanhPhan;
    }

    public String getHamLuongKalo() {
        return HamLuongKalo;
    }

    public void setHamLuongKalo(String HamLuongKalo) {
        this.HamLuongKalo = HamLuongKalo;
    }

    public String getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(String ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public String getSoLuongDaBan() {
        return SoLuongDaBan;
    }

    public void setSoLuongDaBan(String SoLuongDaBan) {
        this.SoLuongDaBan = SoLuongDaBan;
    }
    
}
