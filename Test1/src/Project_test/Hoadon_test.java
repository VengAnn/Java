
package Project_test;
import java.util.Scanner;
public class Hoadon_test {
    private int STT;
    private String soHoaDon;
    private String maHang;
    private String tenHang;
    private double donGia;
    private int soLuong;
      // constructor
    public Hoadon_test(int STT, String soHoaDon, String maHang, String tenHang, double donGia, int soLuong) {
        this.STT = STT;
        this.soHoaDon = soHoaDon;
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
     // getter methods
    public int getSTT() {
        return STT;
    }
    
    public String getSoHoaDon() {
        return soHoaDon;
    }
    
    public String getMaHang() {
        return maHang;
    }
    
    public String getTenHang() {
        return tenHang;
    }
    
    public double getDonGia() {
        return donGia;
    }
    
    public int getSoLuong() {
        return soLuong;
    }
    
    // tính tổng tiền
    public double tinhTongTien() {
        return donGia * soLuong;
    }     
    
    public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
        
        // nhập thông tin cho danh sách hóa đơn
        System.out.print("Nhập số lượng hóa đơn: ");
        int n = input.nextInt();
        
        Hoadon_test[] dsHoaDon = new Hoadon_test[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho hóa đơn thứ " + (i+1) + ":");
            System.out.print("STT: ");
            int STT = input.nextInt();
            System.out.print("Số hóa đơn: ");
            String soHoaDon = input.next();
            System.out.print("Mã hàng: ");
            String maHang = input.next();
            System.out.print("Tên hàng: ");
            String tenHang = input.next();
            System.out.print("Đơn giá: ");
            double donGia = input.nextDouble();
            System.out.print("Số lượng: ");
            int soLuong = input.nextInt();
            
            dsHoaDon[i] = new Hoadon_test(STT, soHoaDon, maHang, tenHang, donGia, soLuong);
        }
        
        // tính tổng tiền của hóa đơn bất kỳ

    // tính tổng tiền của hóa đơn bất kỳ
    String chon;
    while(true) {
        System.out.print("Nhập số hóa đơn cần tính tổng tiền (nhập \"exit\" để thoát): ");
        String soHoaDonCanTinh = input.next();
        if (soHoaDonCanTinh.equals("exit")) {
            break;
        }

        double tongTien = 0;
        for (int i = 0; i < n; i++) {
            if (dsHoaDon[i].getSoHoaDon().equals(soHoaDonCanTinh)) {
                tongTien += dsHoaDon[i].tinhTongTien();
            }
        }
        System.out.println("Tổng tiền của hóa đơn " + soHoaDonCanTinh + " là: " + tongTien);
    }
    // tính tổng tiền của tất cả hóa đơn
    System.out.print("Bạn có muốn tính tổng tiền của tất cả hóa đơn không? (yes/no): ");
    chon = input.next();
    if (chon.equalsIgnoreCase("yes")) {
        double tongtathd = 0;
        for (int i = 0; i < n; i++)
        {
            tongtathd+=dsHoaDon[i].tinhTongTien();
        }
        System.out.println("tat ca hoa don: "+tongtathd);
    }      
    }
    
}
