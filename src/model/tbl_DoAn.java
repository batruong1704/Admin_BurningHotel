package model;

public class tbl_DoAn {
    String id, tenmon, phanloai, thoigiannau, dokho, thanhphan, hamluongcalo, thanhtien, mota, soluongban, img;
    
    public tbl_DoAn(){}

    public tbl_DoAn(String id, String tenmon, String phanloai, String thoigiannau, String dokho, String thanhphan, String hamluongcalo, String thanhtien, String mota, String soluongban, String img) {
        this.id = id;
        this.tenmon = tenmon;
        this.phanloai = phanloai;
        this.thoigiannau = thoigiannau;
        this.dokho = dokho;
        this.thanhphan = thanhphan;
        this.hamluongcalo = hamluongcalo;
        this.thanhtien = thanhtien;
        this.mota = mota;
        this.soluongban = soluongban;
        this.img = img;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public String getPhanloai() {
        return phanloai;
    }

    public void setPhanloai(String phanloai) {
        this.phanloai = phanloai;
    }

    public String getThoigiannau() {
        return thoigiannau;
    }

    public void setThoigiannau(String thoigiannau) {
        this.thoigiannau = thoigiannau;
    }

    public String getDokho() {
        return dokho;
    }

    public void setDokho(String dokho) {
        this.dokho = dokho;
    }

    public String getThanhphan() {
        return thanhphan;
    }

    public void setThanhphan(String thanhphan) {
        this.thanhphan = thanhphan;
    }

    public String getHamluongcalo() {
        return hamluongcalo;
    }

    public void setHamluongcalo(String hamluongcalo) {
        this.hamluongcalo = hamluongcalo;
    }

    public String getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(String thanhtien) {
        this.thanhtien = thanhtien;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getSoluongban() {
        return soluongban;
    }

    public void setSoluongban(String soluongban) {
        this.soluongban = soluongban;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
}
