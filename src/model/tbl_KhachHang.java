package model;

public class tbl_KhachHang {

    String makh, tenkh,sdt,email,cmnd ,diachi, gioitinh;



    public tbl_KhachHang(){}

    public tbl_KhachHang(String makh, String tenkh, String sdt, String email, String cmnd, String diachi, String gioitinh) {

        this.makh = makh;
        this.tenkh = tenkh;
        this.sdt = sdt;
        this.email = email;
        this.cmnd = cmnd;
        this.diachi = diachi;
        this.gioitinh = gioitinh;


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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
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


    

}
