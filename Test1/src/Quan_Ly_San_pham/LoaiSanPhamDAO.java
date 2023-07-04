//class nay de add id name vao cambobox
//ta se tao mot List tu class LoaiSanPham;
//tao List de add id va name vao list 
package Quan_Ly_San_pham;
import java.util.ArrayList;
import java.util.List;
public class LoaiSanPhamDAO {
    List<LoaiSanPham> lsLSP = new ArrayList<>();
    public LoaiSanPhamDAO(){
        lsLSP.add(new LoaiSanPham("1", "SamSung"));
        lsLSP.add(new LoaiSanPham("2","Apple"));
        lsLSP.add(new LoaiSanPham("3","Sony"));
        lsLSP.add(new LoaiSanPham("4","BPhone"));
    }
    public int add(LoaiSanPham sp)
    {
        lsLSP.add(sp);
        return 1;
    }
    public List<LoaiSanPham> getAllLoaiSP(){
        return lsLSP;
    }
}
