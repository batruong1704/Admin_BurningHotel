package model;


public class tbl_PhieuTraPhong {

    String mahoadon, makhachhang, tenkhachhang, phong, ngayden, ngaydi, songayolai, giaphong, giadichvu, giamonan, tongthanhtoan,conthieu, tiencoc;


    public tbl_PhieuTraPhong() {
    }

    public tbl_PhieuTraPhong(String mahoadon, String makhachhang, String phong, String ngayden, String ngaydi, String songayolai, String tongthanhtoan, String conthieu) {

        this.mahoadon = mahoadon;
        this.makhachhang = makhachhang;
        this.phong = phong;
        this.ngayden = ngayden;
        this.ngaydi = ngaydi;
        this.songayolai = songayolai;
        this.tongthanhtoan = tongthanhtoan;
        this.conthieu = conthieu;
    }


    public String getConthieu() {
        return conthieu;
    }

    public void setConthieu(String conthieu) {
        this.conthieu = conthieu;
    }

   
    public tbl_PhieuTraPhong(String tenkhachhang, String giaphong, String giadichvu, String giamonan) {
        this.tenkhachhang = tenkhachhang;
        this.giaphong = giaphong;
        this.giadichvu = giadichvu;
        this.giamonan = giamonan;
        
    }
    
    
    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }
    
    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public String getPhong() {
        return phong;
    }

    public void setPhong(String phong) {
        this.phong = phong;
    }

    public String getNgayden() {
        return ngayden;
    }

    public void setNgayden(String ngayden) {
        this.ngayden = ngayden;
    }

    public String getNgaydi() {
        return ngaydi;
    }

    public void setNgaydi(String ngaydi) {
        this.ngaydi = ngaydi;
    }

    public String getSongayolai() {
        return songayolai;
    }

    public void setSongayolai(String songayolai) {
        this.songayolai = songayolai;
    }

    public String getGiaphong() {
        return giaphong;
    }

    public void setGiaphong(String giaphong) {
        this.giaphong = giaphong;
    }

    public String getGiadichvu() {
        return giadichvu;
    }

    public void setGiadichvu(String giadichvu) {
        this.giadichvu = giadichvu;
    }

    public String getGiamonan() {
        return giamonan;
    }

    public void setGiamonan(String giamonan) {
        this.giamonan = giamonan;
    }

    public String getTongthanhtoan() {
        return tongthanhtoan;
    }

    public void setTongthanhtoan(String tongthanhtoan) {
        this.tongthanhtoan = tongthanhtoan;
    }

    public String getTiencoc() {
        return tiencoc;
    }

    public void setTiencoc(String tiencoc) {
        this.tiencoc = tiencoc;
    }

    
    
}
