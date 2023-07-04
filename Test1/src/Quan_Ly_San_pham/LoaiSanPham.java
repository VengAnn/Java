
package Quan_Ly_San_pham;
//class nay de xu Ly cambobox trong Quan ly San pham 
public class LoaiSanPham {
    private String id;
    private String name;
    
    public LoaiSanPham()
    {    
    }
    public LoaiSanPham(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    public String getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
}
