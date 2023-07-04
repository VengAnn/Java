/*
II. Xây dựng class có tên là SINHVIEN
Thuộc Tính: masv, tensv diachi khoa,gt
diem1 diem2 diem3;
1. Tính điểm TB cho danh sách sih viên
2. in ra màn hình danh sách sv học lại
3. Sinh viên có điểm TB cao nhất khoa điện tử
4. In ra màn hình danh sách những sinh vien đạt học bổng ( TB > 7.5 và điểm TP >5)

*/
package baitap;
import java.util.Scanner;
import java.util.ArrayList;
public class Quan_Ly_SinhVien {

    private String MaSv;
    private String TenSv;
    private String DiaChi,Khoa,Gt;
    private double Diem1,Diem2,Diem3;
    public Quan_Ly_SinhVien(String MaSv,String TenSv,String DiaChi,String Khoa,String Gt,double Diem1,double Diem2,double Diem3)
    {
        this.MaSv = MaSv;
        this.TenSv = TenSv;
        this.DiaChi = DiaChi;
        this.Khoa = Khoa;
        this.Gt = Gt;
        this.Diem1 = Diem1;
        this.Diem2 = Diem2;
        this.Diem3 = Diem3;
    }
    public String getMaSv()
    {
        return MaSv;
    }
    public String getTenSv()
    {
        return TenSv;
    }
    public String getDiachi()
    {
        return DiaChi;
    }
    public String getKhoa()
    {
        return Khoa;
    }
    public String getGt()
    {
        return Gt;
    }
    public double getDiem1()
    {
        return Diem1;
    }
    public double getDiem2()
    {
        return Diem2;
    }
    public double getDiem3()
    {
        return Diem3;
    }
    public double TinhDiemTB()
    {
        double tinhDTB;
        tinhDTB = (Diem1+Diem2+Diem3)/3;
        return tinhDTB;
    }
    public double GetDiemTB()
    {
        return TinhDiemTB();
    }
    public boolean HocLai()
    {
        if(Diem1 < 4 || Diem2 < 4 || Diem3 < 4)
        {
            return true;
            //System.out.println("Sinh Vien Phai Hoc Lai nhe!!");
        }
        return false;       
    }
    public boolean datHocBong()
    {
        if(GetDiemTB() > 7.5 && (getDiem1() > 5 || getDiem2() >5 || getDiem3() > 5))
        {
            return true;
        }
        else return false;
    }
    public void show()
    {
        System.out.println("Masv:"+getMaSv()+"\tTen SV:"+getTenSv()+"\tGioi Tinh:"+getGt()+"\tDiachi:"+getDiachi());
        System.out.println("Khoa:"+getKhoa()+"\tDiem1:"+getDiem1()+"\tDiem2:"+getDiem2()+"\tDiem3:"+getDiem3());
    }
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Nhap So Luong Sinh Vien: ");
         int n = input.nextInt();
         ArrayList<Quan_Ly_SinhVien> List = new ArrayList<>();
         for(int i=0; i<n; i++)
         {
             System.out.println("Nhap Thong Tin Sinh Vien ["+i+"]:");
             System.out.print("Nhap MaSV: ");
             input.nextLine();
             String MaSv = input.nextLine();
             System.out.print("Nhap Ten: ");
             String TenSv = input.nextLine();
             System.out.print("Nhap Gioi Tinh: ");
             String gt = input.nextLine();
             System.out.print("Nhap khoa: ");
             String Khoa = input.nextLine().toUpperCase();
             System.out.print("Nhap Diachi: ");
             String Diachi = input.nextLine(); 
             System.out.print("Nhap Diem1: ");
             double Diem1=input.nextInt();
             System.out.print("Nhap Diem2: ");
             double Diem2=input.nextInt();
             System.out.print("Nhap Diem3: ");
             double Diem3=input.nextInt();
             List.add(new Quan_Ly_SinhVien(MaSv, TenSv, Diachi, Khoa, gt, Diem1, Diem2, Diem3));
         }
         System.out.println("===================================");
         System.out.println("Danh Sach Sinh Vien Vua Nhap Vao:");
         for(Quan_Ly_SinhVien a :List)
         {
             a.show();
             System.out.println("Diem Trung Binh:"+a.GetDiemTB());
         }
        //========================================================================================
         System.out.println("===================================");
         System.out.println("Danh Sach Sinh Vien Phai Hoc Lai:");
        boolean Kiemtra = false; // kiem tra bat dau cho no bang false;
         for(Quan_Ly_SinhVien b : List)
         {
             if(b.HocLai())
             {
                System.out.println("Sinh Vien Phai Hoc Lai nhe!!");
                 System.out.println("MaSV:"+b.getMaSv()+"TEN:"+b.getTenSv());
                Kiemtra =true;
             }
         }
        if (!Kiemtra)
        {
            System.out.println("Khong co Sinh Vien Phai Hoc Lai༼ つ ◕_◕ ༽つ=>gioi the");
        }
        //========================================================================================
        System.out.println("===================================");
        System.out.println("Danh Sach Sinh Vien Co Diem Trung Binh Cao Nhat Khoa Dien Tu:");
        double DiemTbcaoNhat =0;
         for(Quan_Ly_SinhVien b : List)
         {
             if(b.getKhoa().equals("DIEN TU"))
             {
                if(b.GetDiemTB()>DiemTbcaoNhat)
                {
                    DiemTbcaoNhat = b.GetDiemTB();
                    System.out.println("Diem Trung binh:"+DiemTbcaoNhat+"\tMasv:"+b.getMaSv()+"\tTen:"+b.getTenSv());
                }
                Kiemtra = true;
             }
            else if(!(b.getKhoa().equals("DIEN TU")))
            {
                System.out.println("Sinh Vien Khong Thuoc khoa Dien Tu!!");
                System.out.println("MASV: " + b.getMaSv() + "\tTEN: " + b.getTenSv() + "\tKhoa: " + b.getKhoa()+"\tDTB:"+b.GetDiemTB());
            }
         }
         if(!Kiemtra)
         {
             System.out.println("Khong Co Sinh Vien Diem cao nhat!!");
         }
        //========================================================================================
        System.out.println("===================================");
        System.out.println("Danh Sach Sinh những sinh vien đạt học bổng ( TB > 7.5 và điểm TP >5):");
        for(Quan_Ly_SinhVien c : List)
        {
            if(c.datHocBong())
            {
                System.out.println("Sinh Vien Dat Hoc bong Masv:"+c.getMaSv()+"\tTen:"+c.getTenSv()+"\tDTB"+c.GetDiemTB()+"\nDiem1:"+c.getDiem1()+"\nDiem2:"+c.getDiem2()+"\nDiem3:"+c.getDiem3());
                Kiemtra =true;
            }
            else if(!Kiemtra)
            {
                System.out.println("Khong sinh vien dat Hoc Bong!!!!");
            }
        }
        // TODO code application logic here
    }
    
}
