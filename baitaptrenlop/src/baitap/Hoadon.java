package baitap;
import java.util.Scanner;
public class Hoadon {

    private int stt;
    private String sohoadon;
    private String mahang;
    private String tenhang;
    private String dvt;
    private int sl;
    private double donggia;
    //constuctor
    public Hoadon(int stt, String sohoadon, String mahang, String tenhang, String dvt, int sl, double donggia) {
        this.stt = stt;
        this.sohoadon = sohoadon;
        this.mahang = mahang;
        this.tenhang = tenhang;
        this.dvt = dvt;
        this.sl = sl;
        this.donggia = donggia;
    }
     // getter methods
    public int getSTT() {
        return stt;
    }
    
    public String getSoHoaDon() {
        return sohoadon;
    }
    
    public String getMaHang() {
        return mahang;
    }
    
    public String getTenHang() {
        return tenhang;
    }
    
    public double getDonGia() {
        return donggia;
    }
    
    public int getSoLuong() {
        return sl;
    }
    

    public double TinhThanhtien()
    {
        double thanhtien ;
        thanhtien = (donggia*sl);
        return thanhtien;
    }

    void show()
    {
        System.out.print("stt:"+stt+"\tSo hoa don:"+sohoadon+"\tMa hang:"+mahang+"\tTen hang:"+tenhang+"\t\nDon vi tinh:"+dvt+"\t\n So luong:"+sl+"\t\nDon gia:"+donggia);
        System.out.print("\t\nThanh tien:"+TinhThanhtien()); 
        System.out.println("\n-------------------------------------------------");
    }
    //ham main;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Input Quality: "); n = input.nextInt();
        Hoadon Array[] = new Hoadon[n];
        for(int i=0; i<Array.length; i++)
        {
            int stt = i+1;
            System.out.print("Input Information of Hoadon ["+i+"]\n");
            System.out.print(" stt: "+stt+"\n");
            System.out.print("Input so hoa don:");
            input.nextLine();
            String sohoadon = input.nextLine();
            System.out.print("Ma hang:");
            String mahang = input.nextLine();
            System.out.print("Ten hang:");
            String tenhang = input.nextLine();
            System.out.print("Don vi tinh:");
            String dvt = input.nextLine();
            System.out.print("So luong: ");
            int sl = input.nextInt();
            System.out.print("Don gia: ");
            double dongia = input.nextDouble();
            // tao array moi de lay cac thong tin vua nhap tu keyboard
            Array[i] = new Hoadon(stt, sohoadon, mahang, tenhang, dvt, sl, dongia);
                
        }
        for (int i=0 ; i<n ;i++) 
        {
            //System.out.print("\n----------------------------------\n");
            Array[i].show();
        }
        while (true) 
        {            
            System.out.print("Nhập số hóa đơn cần tính tổng tiền (nhập \"exit\" để thoát): ");
            String soHoaDonCanTinh = input.next();
            if (soHoaDonCanTinh.equals("exit")) {
                break;
            }

            double tongtien = 0;
            for(int i=0; i < n; i++)
            {
            if (Array[i].getSoHoaDon().equals(soHoaDonCanTinh)) 
                {
                    tongtien += Array[i].TinhThanhtien();
                }
            }
             System.out.println("Tong tien cua hoa don"+soHoaDonCanTinh+"="+tongtien);
        }
        //tinh tong tat ca hoa don neu nhap yes;
        System.out.print("Bạn có muốn tính tổng tiền của tất cả hóa đơn không? (yes/no): ");
        String chon = input.next();
        if (chon.equalsIgnoreCase("yes")) {
            double tongtathd = 0;
            for (int i = 0; i < n; i++)
            {
                tongtathd+=Array[i].TinhThanhtien();
            }
            System.out.println("tat ca hoa don: "+tongtathd);
        }
        //Sap Xep theo so tien giam dan;
        for(int i=0 ; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
                if(Array[i].TinhThanhtien() < Array[j].TinhThanhtien())
                {
                    Hoadon temp;
                    temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temp;
       
                }
        }
        
        for(int i=0;i<n ;i++)
        {
            Array[i].show();
        }
        //Cho biết mặt hàng có tên là ao thon bán được bao nhiêu trong tháng 1
        int soao=0;
        for(int i=0; i<n; i++)
        {
            if(Array[i].getTenHang().equals("ao thon"))
            {
                soao+=Array[i].getSoLuong();
                
            }
        }
        System.out.println("Mat hang ten la ao thon so luong ban duoc: "+soao);
    }
    
}
