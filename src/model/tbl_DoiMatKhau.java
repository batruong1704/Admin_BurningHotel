package model;


public class tbl_DoiMatKhau {
    String Email, MatKhauCu, MatKhauMoi;
    public String getEmail;
    public tbl_DoiMatKhau(){}

    public tbl_DoiMatKhau(String Email, String MatKhauCu, String MatKhauMoi) {
        this.Email = Email;
        this.MatKhauCu = MatKhauCu;
        this.MatKhauMoi = MatKhauMoi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMatKhauCu() {
        return MatKhauCu;
    }

    public void setMatKhauCu(String MatKhauCu) {
        this.MatKhauCu = MatKhauCu;
    }

    public String getMatKhauMoi() {
        return MatKhauMoi;
    }

    public void setMatKhauMoi(String MatKhauMoi) {
        this.MatKhauMoi = MatKhauMoi;
    }

 

    
 
}