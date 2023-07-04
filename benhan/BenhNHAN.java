/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.benhan;
import java.util.Scanner;
import java.util.Date;



public class BenhNHAN {
    private String MaBN ,TenBN , DiaChi,GioiTinh , BHYT;
    private int DienThoai;
    private int  NgaySinh , ThangSinh , NamSinh;
  
public String GetMaBN()
{
    return MaBN;
}

public String GetTenBN()
{
    return MaBN;
}

public String GetBHYT()
{
    return BHYT;
}
public int GetNgaySinh()
{
    return NgaySinh;
}
public int GetThangSinh()
{
    return ThangSinh;
}
public int GetNamSinh()
{
    return NamSinh;
}
public void NhapBN()
{
    Scanner sc = new Scanner(System.in);
   
    System.out.print("\tNhap ma so Benh Nhan : ");
    MaBN = sc.nextLine(); 
    System.out.print("\tNhap ten Benh Nhan : ");
    TenBN = sc.nextLine();
    System.out.print("\tNhap dia chi Benh Nhan : ");
    DiaChi = sc.nextLine();
    System.out.print("\tNhap Gioi tinh Benh Nhan : ");
    GioiTinh = sc.nextLine();
    System.out.print("\tNhap BHYT Benh Nhan: ");
    BHYT = sc.nextLine();
    System.out.print("\tNhap Dien Thoai Benh Nhan : ");
    DienThoai = sc.nextInt(); 
    System.out.print("\tNhap Ngay sinh Benh Nhan: ");
    NgaySinh = sc.nextInt();
    System.out.print("\tNhap Thang sinh Benh Nhan: ");
    ThangSinh = sc.nextInt();  
    System.out.print("\tNhap Nam sinh Benh Nhan: ");
    NamSinh = sc.nextInt();

}
    public void Print(){
        System.out.printf("%-10s%-20s%-20s%-10s%-10s%-10s",this.MaBN,
    this.TenBN,this.DiaChi,this.GioiTinh,this.BHYT,this.DienThoai ,this.NamSinh);             
}  
}
