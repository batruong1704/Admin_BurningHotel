package model;

public class tbl_QuanLiTienIch {
    String maphieudatphong, mahoadon, makhachhang, tenkhachhang, emailkhachhang, sdt, phong, ngayden, ngaydi, songayolai, tongthanhtoan;

    public tbl_QuanLiTienIch() {
    }

    public tbl_QuanLiTienIch(String maphieudatphong, String mahoadon, String makhachhang, String tenkhachhang, String emailkhachhang, String sdt, String phong, String ngayden, String ngaydi, String songayolai,String tongthanhtoan) {
        this.maphieudatphong = maphieudatphong;
        this.mahoadon = mahoadon;
        this.makhachhang = makhachhang;
        this.tenkhachhang = tenkhachhang;
        this.emailkhachhang = emailkhachhang;
        this.sdt = sdt;
        this.phong = phong;
        this.ngayden = ngayden;
        this.ngaydi = ngaydi;
        this.songayolai = songayolai;
        this.tongthanhtoan = tongthanhtoan;
    }

    public String getMaphieudatphong() {
        return maphieudatphong;
    }

    public void setMaphieudatphong(String maphieudatphong) {
        this.maphieudatphong = maphieudatphong;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmailkhachhang() {
        return emailkhachhang;
    }

    public void setEmailkhachhang(String emailkhachhang) {
        this.emailkhachhang = emailkhachhang;
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

    public String getTongthanhtoan() {
        return tongthanhtoan;
    }

    public void setTongthanhtoan(String tongthanhtoan) {
        this.tongthanhtoan = tongthanhtoan;
    }
    
}
