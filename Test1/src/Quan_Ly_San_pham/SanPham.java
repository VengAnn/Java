
package Quan_Ly_San_pham;
import java.util.Date;

public class SanPham {
    private String maSP;
    private String tenSP;
    private Date NgayNhap;
    private int soLuong;
    private double gia;
    private LoaiSanPham loaiSP;
    
    //defaul constructor
    public SanPham() {
    }
    //constructor of Class SanPham
    public SanPham(String maSP, String tenSP, Date NgayNhap, int soLuong, double gia, LoaiSanPham loaiSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.NgayNhap = NgayNhap;
        this.soLuong = soLuong;
        this.gia = gia;
        this.loaiSP = loaiSP;
    }


    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setLoaiSP(LoaiSanPham loaiSP) {
        this.loaiSP = loaiSP;
    }

    public LoaiSanPham getLoaiSP() {
        return loaiSP;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public double getGia() {
        return gia;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setNgayNhap(Date NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public Date getNgayNhap() {
        return NgayNhap;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSP=" + maSP + ", tenSP=" + tenSP + ", NgayNhap=" + NgayNhap + ", soLuong=" + soLuong + ", gia=" + gia + ", loaiSP=" + loaiSP + '}';
    }
    
}
