package model;

public class tbl_DauBep {
    String id, hoten, gioitinh, ngaysinh, chucvu, sonamkn, email, sdt, diachi, mota, hinhanh;
    
    public tbl_DauBep(){}
    public tbl_DauBep(String id, String hoten, String gioitinh, String ngaysinh, String chucvu, String sonamkn, String email, String sdt, String diachi, String mota, String hinhanh) {
        this.id = id;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.chucvu = chucvu;
        this.sonamkn = sonamkn;
        this.email = email;
        this.sdt = sdt;
        this.diachi = diachi;
        this.mota = mota;
        this.hinhanh = hinhanh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
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

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getSonamkn() {
        return sonamkn;
    }

    public void setSonamkn(String sonamkn) {
        this.sonamkn = sonamkn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }
    
}
