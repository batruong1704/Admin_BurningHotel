package model;


public class tbl_MaGiamGia {
    String magiamgia, tenmagiamgia, chietkhau, tinhtrang;
    public tbl_MaGiamGia() {}

    public tbl_MaGiamGia(String magiamgia, String tenmagiamgia, String chietkhau, String tinhtrang) {
        this.magiamgia = magiamgia;
        this.tenmagiamgia = tenmagiamgia;
        this.chietkhau = chietkhau;
        this.tinhtrang = tinhtrang;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public String getMagiamgia() {
        return magiamgia;
    }

    public void setMagiamgia(String magiamgia) {
        this.magiamgia = magiamgia;
    }

    public String getTenmagiamgia() {
        return tenmagiamgia;
    }

    public void setTenmagiamgia(String tenmagiamgia) {
        this.tenmagiamgia = tenmagiamgia;
    }

    public String getChietkhau() {
        return chietkhau;
    }

    public void setChietkhau(String chietkhau) {
        this.chietkhau = chietkhau;
    }
    
}
