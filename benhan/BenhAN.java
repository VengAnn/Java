/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sv.benhan;
import java.util.Date;
import java.util.Scanner;
import static sv.benhan.BenhVien.sl;

public class BenhAN {
   private String MaBA ,TenBA , Khoa,Phong;
   
  private int NgayVao , ThangVao , NamVao , NgayRa , ThangRa  , NamRa;

  
public String GetMaBA()
{
    return MaBA;
}

public String GetKhoa()
{
    return Khoa;
}

public String GetTenBA()
{
    return TenBA;
}

public int GetNgayVao()        
{
    return NgayVao;
}
public int GetThangVao()        
{
    return ThangVao;
}
public int GetNamVao()        
{
    return NamVao;
}

public int GetNgayRa()        
{
    return NgayRa;
}
public int GetThangRa()        
{
    return ThangRa;
}
public int GetNamRa()        
{
    return NamRa;
}
        

public void NhapBA()
{
    Scanner sc = new Scanner(System.in);
 
    System.out.print("\tNhap ma so Benh AN : ");
    sc.nextLine();
    System.out.print("\tNhap ten Benh AN : ");
    sc.nextLine();
    System.out.print("\tNhap Khoa : ");
    sc.nextLine();
    System.out.print("\tNhap Phong : ");
    sc.nextLine();
    System.out.print("\tNhap Ngay vao  : " );
    NgayVao = sc.nextInt();
    System.out.print("\tNhap Thang vao : ");
    ThangVao = sc.nextInt();
    System.out.print("\tNhap Nam vao : ");
    NamVao = sc.nextInt();
    System.out.print("\tNhap Ngay ra : ");
    NgayRa = sc.nextInt();
    System.out.print("\tNhap Thang ra : ");
    ThangRa = sc.nextInt();
    System.out.print("\tNhap Nam ra : ");
    NamRa = sc.nextInt();
 
}
    public void Print(){
        System.out.printf("%-20s%-20s%-20s%-20s\n",
    this.MaBA,this.TenBA,this.Khoa,this.Phong);             
}
    
                      

}
    


