package BTL;
import java.time.LocalDate;
class HoaDon {
    private String MaHoadon;
    private String tenHang;
    private String Tenkhach;
    private String Diachi;
    private LocalDate NgayLap;
    private String DonviTinh;
    private int SoLuong;
    private double DonGia;
    private double ThanhTien;
    private double TongTien;

    public HoaDon()
    {
        
    }
    public HoaDon(String MaHoadon,String Diahchi,LocalDate ngaylap, String tenHang, String Tenkhach, String DonviTinh, int SoLuong, double DonGia, double ThanhTien, double TongTien) {
        this.MaHoadon = MaHoadon;
        this.tenHang = tenHang;
        this.Diachi = Diahchi;
        this.NgayLap = ngaylap;
        this.Tenkhach = Tenkhach;
        this.DonviTinh = DonviTinh;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.ThanhTien = ThanhTien;
        this.TongTien = TongTien;
    }

    public void setMaHoadon(String MaHoadon) {
        this.MaHoadon = MaHoadon;
    }

    public String getMaHoadon() {
        return MaHoadon;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public void setTenkhach(String Tenkhach) {
        this.Tenkhach = Tenkhach;
    }

    public String getTenkhach() {
        return Tenkhach;
    }

    public void setDonviTinh(String DonviTinh) {
        this.DonviTinh = DonviTinh;
    }

    public String getDonviTinh() {
        return DonviTinh;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setThanhTien(double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setNgayLap(LocalDate NgayLap) {
        this.NgayLap = NgayLap;
    }

    public LocalDate getNgayLap() {
        return NgayLap;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "MaHoadon=" + MaHoadon + ", tenHang=" + tenHang + ", Tenkhach=" + Tenkhach + ", Diachi=" + Diachi + ", NgayLap=" + NgayLap + ", DonviTinh=" + DonviTinh + ", SoLuong=" + SoLuong + ", DonGia=" + DonGia + ", ThanhTien=" + ThanhTien + ", TongTien=" + TongTien + '}';
    }
}

