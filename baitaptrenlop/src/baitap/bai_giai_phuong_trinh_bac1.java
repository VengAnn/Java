package baitap;
//giai phuong trinh bac nhat1
import java.util.Scanner;
public class bai_giai_phuong_trinh_bac1 {
    public static void main(String[] args) {
        float a;
        float b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        System.out.println("Nhap so b: ");
        a = input.nextFloat();
        b = input.nextFloat();
        if(a==0){
            System.out.print("Phuong trinh vo nghiem!");
           if(b==0){
               System.out.println("Phuong trinh vo so nghiem !!");
           }
        }else
        {
            float x =-b/a ;
            System.out.println("Phuong trinh co nghiem x= " +x);
        } 
    }
    
}
