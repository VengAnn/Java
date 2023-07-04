
package Quan_Ly_San_pham;

import java.util.ArrayList;
import java.util.List;
public class SanPhamDAO {
    List<SanPham> lsSP = new ArrayList<>();
    public int add(SanPham sp)
    {
        lsSP.add(sp);
        return 1;
    }
    public int count()
    {
        return lsSP.size();
    }
    public List<SanPham> getAllSanPham()
    {
        return lsSP;
    }
    //find by ID MaSP
    public SanPham findByID(String id)
    {
        for(SanPham sp : lsSP)
        {
            if(sp.getMaSP().equalsIgnoreCase(id))
            {
                return sp;
            }
        }
        return null;
    }
    //btn delete;
    public int del(String id)
    {
        SanPham sp = findByID(id);
        if(sp!=null)
        {
            lsSP.remove(sp);
            return 1;
        }
        return -1;
    }
    
    public SanPham getSanPhamAtPoint(int position)
    {
        return lsSP.get(position);
    }
    public int edit(SanPham spNew)
    {
        for(SanPham sp : lsSP)
        {
            if(sp.getMaSP().equalsIgnoreCase(spNew.getMaSP()))
            {
                sp.setTenSP(spNew.getTenSP());
                sp.setNgayNhap(spNew.getNgayNhap());
                sp.setGia(spNew.getGia());
                sp.setSoLuong(spNew.getSoLuong());
                sp.setLoaiSP(spNew.getLoaiSP());
                return 1;
            }
        }
        return -1;
    }
}
