package model;

public class tbl_KhachHang {
    String makh, tenkh, diachi, gioitinh, cmnd, sodt, password, email;

    public tbl_KhachHang() {
    }

    public tbl_KhachHang(String makh, String tenkh, String diachi, String gioitinh, String cmnd, String sodt, String password, String email) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.cmnd = cmnd;
        this.sodt = sodt;
        this.password = password;
        this.email = email;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

}
