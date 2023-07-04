
package BTL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class HoaDonDoiTuong {
    List<HoaDon> hd = new ArrayList<>();
        
    public int add(HoaDon H)
    {
        hd.add(H);
        return 1;
    }
    public int count()
    {
        return hd.size();
    }
    public List<HoaDon> getAll()
    {
        return hd;
    }
    //find by MaHD
    public HoaDon findByID(String id)
    {
        for(HoaDon hD : hd)
        {
            if(hD.getMaHoadon().equalsIgnoreCase(id))
            {
                return hD;
            }
        }
        return null;
    }
    
    public HoaDon findByTenHang(String tenHang) {
    for (HoaDon hD : hd) {
        if (hD.getTenHang().equalsIgnoreCase(tenHang)) {
            return hD;
        }
    }
    return null;
    }

    public int delele(String id)
    {
        HoaDon hD = findByID(id);
        if(hD!=null)
        {
            hd.remove(hD);
            return 1;
        }
        return -1;
    }
    
    public int edit(HoaDon HdNew)
    {
        for(HoaDon hD : hd)
        {
            if(hD.getMaHoadon().equalsIgnoreCase(HdNew.getMaHoadon()))
            {
                hD.setMaHoadon(HdNew.getMaHoadon());
                hD.setTenHang(HdNew.getTenHang());
                hD.setTenkhach(HdNew.getTenkhach());
                hD.setNgayLap(HdNew.getNgayLap());
                hD.setSoLuong(HdNew.getSoLuong());
                hD.setDiachi(HdNew.getDiachi());
                hD.setDonGia(HdNew.getDonGia());
                hD.setThanhTien(HdNew.getThanhTien());
                return 1;
            }
        }
        return -1;
    }
       
    public HoaDon getHoaDonAtPointtt(int index) {
    if (index >= 0 && index < hd.size()) {
        return hd.get(index);
    }
    return null;
    }
    
    
    public HoaDon GETgetHoaDonAtPointtt(int index, JTable table) //để point trong table show đoi tuong trong text filed gi đầy?
    {
        if (index >= 0 && index < table.getRowCount()) 
        {
            int modelRow = table.convertRowIndexToModel(index);
            String tenHang = (String) table.getValueAt(modelRow, 1); // Giả sử tên hàng ở cột thứ 1
            return findByTenHang(tenHang);
        }
        return null;
    }  
}
