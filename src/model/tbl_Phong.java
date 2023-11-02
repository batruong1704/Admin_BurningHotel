package model;

public class tbl_Phong {

    String MaPhong, LoaiPhong,KieuPhong,SLMax, LoaiGiuong, GiaPhong, IMG, DienTich, TamNhin,MoTa, TinhTrang,LuotDat, TongDoanhThuPhong,tang;

    public tbl_Phong(){}

    public tbl_Phong(String MaPhong, String LoaiPhong, String KieuPhong, String SLMax, String LoaiGiuong, String GiaPhong, String IMG, String DienTich, String TamNhin, String MoTa, String TinhTrang) {
        this.MaPhong = MaPhong;
        this.LoaiPhong = LoaiPhong;
        this.KieuPhong = KieuPhong;
        this.SLMax = SLMax;
        this.LoaiGiuong = LoaiGiuong;
        this.GiaPhong = GiaPhong;
        this.IMG = IMG;
        this.DienTich = DienTich;
        this.TamNhin = TamNhin;
        this.MoTa = MoTa;
        this.TinhTrang = TinhTrang;
    }

   
    
    public tbl_Phong(String MaPhong, String LoaiPhong, String KieuPhong, String SLMax, String LoaiGiuong, String GiaPhong, String IMG, String DienTich, String TamNhin, String MoTa, String TinhTrang, String LuotDat, String TongDoanhThuPhong, String tang) {
        this.MaPhong = MaPhong;
        this.LoaiPhong = LoaiPhong;
        this.KieuPhong = KieuPhong;
        this.SLMax = SLMax;
        this.LoaiGiuong = LoaiGiuong;
        this.GiaPhong = GiaPhong;
        this.IMG = IMG;
        this.DienTich = DienTich;
        this.TamNhin = TamNhin;
        this.MoTa = MoTa;
        this.TinhTrang = TinhTrang;
        this.LuotDat = LuotDat;
        this.TongDoanhThuPhong = TongDoanhThuPhong;
        this.tang = tang;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getLoaiPhong() {
        return LoaiPhong;
    }

    public void setLoaiPhong(String LoaiPhong) {
        this.LoaiPhong = LoaiPhong;
    }

    public String getKieuPhong() {
        return KieuPhong;
    }

    public void setKieuPhong(String KieuPhong) {
        this.KieuPhong = KieuPhong;
    }

    public String getSLMax() {
        return SLMax;
    }

    public void setSLMax(String SLMax) {
        this.SLMax = SLMax;
    }

    public String getLoaiGiuong() {
        return LoaiGiuong;
    }

    public void setLoaiGiuong(String LoaiGiuong) {
        this.LoaiGiuong = LoaiGiuong;
    }

    public String getGiaPhong() {
        return GiaPhong;
    }

    public void setGiaPhong(String GiaPhong) {
        this.GiaPhong = GiaPhong;
    }

    public String getIMG() {
        return IMG;
    }

    public void setIMG(String IMG) {
        this.IMG = IMG;
    }

    public String getDienTich() {
        return DienTich;
    }

    public void setDienTich(String DienTich) {
        this.DienTich = DienTich;
    }

    public String getTamNhin() {
        return TamNhin;
    }

    public void setTamNhin(String TamNhin) {
        this.TamNhin = TamNhin;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public String getLuotDat() {
        return LuotDat;
    }

    public void setLuotDat(String LuotDat) {
        this.LuotDat = LuotDat;
    }

    public String getTongDoanhThuPhong() {
        return TongDoanhThuPhong;
    }

    public void setTongDoanhThuPhong(String TongDoanhThuPhong) {
        this.TongDoanhThuPhong = TongDoanhThuPhong;
    }

    public String getTang() {
        return tang;
    }

    public void setTang(String tang) {
        this.tang = tang;
    }

    
   
}