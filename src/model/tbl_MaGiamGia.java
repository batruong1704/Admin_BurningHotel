package model;


public class tbl_MaGiamGia {
    String magiamgia, tenmagiamgia, chietkhau;
    public tbl_MaGiamGia() {}

    public tbl_MaGiamGia(String magiamgia, String tenmagiamgia, String chietkhau) {
        this.magiamgia = magiamgia;
        this.tenmagiamgia = tenmagiamgia;
        this.chietkhau = chietkhau;
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
