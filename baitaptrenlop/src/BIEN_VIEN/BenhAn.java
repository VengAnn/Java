package BIEN_VIEN;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
public class BenhAn extends Benh_vien
{
    private String MaBA;
    private String TenBA;
    private String Khoa;
    private String Phong;
    private double Dongia;
    private LocalDate ngayVao;
    private LocalDate ngayRa;
    private double VienPhi;
    public BenhAn(String MaBA, String TenBA, String Khoa, String Phong, double Dongia, LocalDate ngayVao, LocalDate ngayRa, double VienPhi, String MaBn, String TenBn, String Gt, String ngaySinh, String DiaChi, String Dienthoai, String BaoHYT) {
        super(MaBn, TenBn, Gt, ngaySinh, DiaChi, Dienthoai, BaoHYT);
        this.MaBA = MaBA;
        this.TenBA = TenBA;
        this.Khoa = Khoa;
        this.Phong = Phong;
        this.Dongia = Dongia;
        this.ngayVao = ngayVao;
        this.ngayRa = ngayRa;
        this.VienPhi = VienPhi;
    }
        public void setMaBA(String MaBA)
    {
        this.MaBA = MaBA;
    }
    public String getMaBA()
    {
        return MaBA;
    }
    public void setTenBA(String TenBA)
    {
        this.TenBA = TenBA;
    }
    public String getTenBA()
    {
        return TenBA;
    }
    public void setKhoa(String Khoa)
    {
        this.Khoa = Khoa;
    }
    public String getKhoa()
    {
        return Khoa ;
    }
    public void setPhong(String Phong)
    {
        this.Phong = Phong;
    }
    public String getPhong()
    {
        return Phong ;
    }
    public void setDongia(double Dongia)
    {
        this.Dongia =Dongia;
    }
    public double getDongia()
    {
        return Dongia;
    }
    public void setNgayVao(LocalDate Ngayvao)
    {
        this.ngayVao = Ngayvao;
    }
    public void setNgayRa(LocalDate NgayRa)
    {
        this.ngayRa = NgayRa;
    }
    public LocalDate getNgayVao()
    {
        return ngayVao;
    }
    public LocalDate getNgayRa()
    {
        return ngayRa;
    }
    public double getVienPhi(ArrayList<BenhAn>  ba)
    {
        int So_ngayNamVien;
        So_ngayNamVien = (int)ChronoUnit.DAYS.between(ngayVao, ngayRa)-1;
        if(getBYT().equals("1"))  
        {// 1 co nghia la co bao hiem y te duoc giam30% con 0 la khong giam
            VienPhi = So_ngayNamVien*Dongia - So_ngayNamVien*Dongia*30/100 ;
        }
        if(getBYT().equals("0"))
        {
            VienPhi = So_ngayNamVien*Dongia; 
        }
        if((So_ngayNamVien==-1 || So_ngayNamVien==0) && getBYT().equals("1"))
        {// So_ngayNamVien==-1 co nghia la nam trong 1 ngay vi so ngay ra - so ngay vao =-1 
            //neu ngay vao 2022-12-20 va ngay ra 2022-12-20 no se bang -1; nen xu ly nhu sau:
            VienPhi = Dongia - Dongia*30/100 ;
        }
        if((So_ngayNamVien==-1 || So_ngayNamVien==0) && getBYT().equals("0"))
        {
            VienPhi = Dongia;
        }
        return VienPhi;
    }
    
    public static void nhapDanhSachBenhAn(ArrayList<BenhAn> danhSachBenhAn) {
    Scanner input = new Scanner(System.in);
    System.out.print("Nhap so luong benh an: ");
    int n = input.nextInt();
    input.nextLine();
    System.out.println("Nhap danh sach benh an: ");
    for(int i=0 ; i<n ;i++) {
        System.out.print("Nhap Ma Benh nhan Thu ["+i+"]: ");
        String MaBn = input.nextLine();
        System.out.print("Ten Benh nhan: ");
        String TenBn = input.nextLine();
        System.out.print("Gioi Tinh: ");
        String Gt = input.nextLine();
        System.out.print("Ngay Sinh: ");
        String NgaySinh = input.nextLine();
        System.out.print("Dia Chi: ");
        String Diachi = input.nextLine();
        System.out.print("So Dien Thoai: ");
        String DienThoai = input.nextLine();
        System.out.print("Bao Hiem Y Te 1=la co 0=khong co (1/0): ");
        String BYT = input.nextLine();
        //Nhap du lieu vao Class Benh An;
        System.out.print("Nhap Ma Benh an: ");
        String MaBAa=input.nextLine();
        System.out.print("Ten Benh an: ");
        String TenBAa = input.nextLine();
        System.out.print("Khoa :");
        String Khoaa = input.nextLine();
        System.out.print("Phong: ");
        String Phonga = input.nextLine();
        System.out.print("Don gia: ");
        double Dongiaa = input.nextDouble();
        input.nextLine();
        System.out.print("Ngay vao (YYYY-MM-DD): ");
        String NgayVaostr = input.nextLine();
        LocalDate NgayVao = LocalDate.parse(NgayVaostr);
        System.out.print("Ngay Ra(YYYY-MM-DD): ");
        String NgayRastr = input.nextLine();
        LocalDate NgayRa = LocalDate.parse(NgayRastr);
        danhSachBenhAn.add( new BenhAn(MaBAa, TenBAa, Khoaa, Phonga, Dongiaa, NgayVao, NgayRa, Dongiaa, MaBn, TenBn, Gt, NgaySinh, Diachi, DienThoai, BYT));
        }
    } 
    public static void hienthiDanhSach(ArrayList<BenhAn> danhSachBenhAn)
    {
        System.out.printf("%-15s %-20s %-15s %-15s %-10s%n", "Ma BN", "Ten BN", "Phong", "Don gia", "Vien phi");
        for(BenhAn ba : danhSachBenhAn)
        {
            System.out.printf("%-15s %-20s %-15s %-15.0f %-10.0f%n", ba.getMaBn(), ba.getTenBn(), ba.getPhong(), ba.getDongia(), ba.getVienPhi(danhSachBenhAn));
        } 
    }
    public static void CheckSOLuongBenhNhan(ArrayList<BenhAn> danhSach)
    {
        //Khai bao bien kieu LocalDate 2021/02/20 va 2021/04/13;
        int soluong = 0;
        boolean check=false;
        LocalDate StartDate = LocalDate.of(2021, 02, 20);
        LocalDate endDate = LocalDate.of(2021, 04, 13);
        for(BenhAn ba : danhSach)
        {
            LocalDate StartDatefrominput = ba.getNgayVao();
            LocalDate endDateFrominput = ba.getNgayRa();
            if(StartDatefrominput.isBefore(endDate) && endDateFrominput.isAfter(StartDate) )
            {//!endDateFrominput.isBefore(StartDate) && !StartDatefrominput.isAfter(endDate)
                hienthiDanhSach(danhSach);
                soluong++;
                check =true;
            }
        }
        if(check==false)
        {
            System.out.println("Khong co Benh Nhan Nam trong Ngay 2021/02/20 den 2021/04/13");
        } 
        else if(check==true)
        {
            System.out.println("Soluong Benh An: "+soluong);
        }
    }
    public static void CheckSoLuongBenhNhanRa(ArrayList<BenhAn> danhsach)
    {
        int cout =0;
        boolean check=false;
        LocalDate StartDate = LocalDate.of(2021, 02, 20);
        LocalDate endDate = LocalDate.of(2021, 04, 13);
        for(BenhAn ba : danhsach)
        {
            
            LocalDate endDateFromInputRA = ba.getNgayRa();
            if(endDateFromInputRA.isBefore(endDate) && endDateFromInputRA.isAfter(StartDate))
            {
                hienthiDanhSach(danhsach);
                cout++;
                check=true;
            }
        }
        if(check==false)
        {
            System.out.println("Khong co Benh Nhan ra Nam trong 2021-02-20 den 2021-04-13");       
        }
        if(check==true)
        {
            System.out.println("So luong Benh Nhan ra Vien Trong 2021-02-20 den 2021-04-13: "+cout);
        }      
    }
    public static void showTheoThuTuGaimdan(ArrayList<BenhAn> danhSach)
    {
        for(int i=danhSach.size()-1; i>=0 ; i--)
        {
            BenhAn ba = danhSach.get(i);
            System.out.println("Ma Benh Nhan ["+i+"]La :"+"\t"+ba.getMaBn());
            hienthiDanhSach(danhSach);
        }
    }
    /*
    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            Runtime.getRuntime().exec("clear");
                }
            } catch (IOException | InterruptedException ex) {
                System.err.println("Failed to clear screen: " + ex.getMessage());
    }
}*/
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<BenhAn> danhSachBenhAn = new ArrayList<>(100);
        while(true)
        {
            System.out.println("==============MENU===========================");
            System.out.println("[1].==========Nhap Danh Sach Benh Nhan=============");
            System.out.println("[2].==========Hien thi Danh Sach Benh Nhan========");
            System.out.println("[3].==========Cho biết từ ngày 20/2/2021 đến 13/4/2021 có bao nhiêu bệnh nhân nằm viện=========== ");
            System.out.println("[4].==========Cho biết từ ngày 20/2/2021 đến 13/4/2021 có bao nhiêu bệnh nhân được ra viện=========");
            System.out.println("[5].===========Sắp xếp danh sách bênh nhân theo thứ tự giảm dần==============");
            System.out.println("Hay chon mot Chuc Nang cua Menu Tren ?");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    
                    nhapDanhSachBenhAn(danhSachBenhAn);
                    System.out.println("Danh sách bệnh nhân đã được nhập.");
                    break;
                case 2: 
                    hienthiDanhSach(danhSachBenhAn);
                    //System.out.print("\033[H\033[2J");
                    break;
                case 3: 
                    CheckSOLuongBenhNhan(danhSachBenhAn);
                    //System.out.flush(); 
                    break;
                case 4:
                    CheckSoLuongBenhNhanRa(danhSachBenhAn);
                    break;
                case 5:
                    showTheoThuTuGaimdan(danhSachBenhAn);
                    break;
                case 0:
                    //return ;
                    System.exit(0);
                default:
                    System.out.println("Nhap sai!!");
                    break;
                    
            
            }
        }
    }
}
