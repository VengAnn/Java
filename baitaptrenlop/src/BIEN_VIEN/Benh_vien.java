package BIEN_VIEN;
public class Benh_vien {
    private String MaBn;
    private String TenBn;
    private String Gt;
    private String ngaySinh;
    private String DiaChi;
    private String DienThoai;
    private String BaoHYT;

    public Benh_vien(String MaBn, String TenBn, String Gt, String ngaySinh, String DiaChi, String DienThoai, String BaoHYT) {
        this.MaBn = MaBn;
        this.TenBn = TenBn;
        this.Gt = Gt;
        this.ngaySinh = ngaySinh;
        this.DiaChi = DiaChi;
        this.DienThoai = DienThoai;
        this.BaoHYT = BaoHYT;
    }
    
    public void setMaBn(String MaBn)
    {
        this.MaBn = MaBn;
    }
    public String getMaBn()
    {
        return MaBn;
    }
    public void setTenBn(String T)
    {
        this.TenBn = T;
    }
    public String getTenBn()
    {
        return TenBn;
    }
    public void setGt(String Gt)
    {
        this.Gt = Gt;
    }
    public String getGt()
    {
        return Gt;
    }
    public void setNgaySinh(String ns)
    {
        this.ngaySinh = ns;
    }
    public String getNgaySinh()
    {
        return ngaySinh;
    }
    public void setDiaChi(String DC)
    {
        this.DiaChi = DC ;
    }
    public String getDiaChi()
    {
        return DiaChi;
    }
    public void setDienThoai(String DT)
    {
        this.DienThoai = DT;
    }
    public String getDienthoai()
    {
        return DienThoai ;
    }
    public void setBaoHYT(String BYT)
    {
        this.BaoHYT = BYT;
    }
    public String getBYT()
    {
        return BaoHYT;
    }
}
