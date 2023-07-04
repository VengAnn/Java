package baitap;

//giai phuong trinh bac 2;
import java.util.Scanner;
public class Phuong_trinh_bac2 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so nguyen a: ");
        a = input.nextDouble();
        System.out.print("Nhap so nguyen b: ");
        b = input.nextDouble();
        System.out.print("Nhap so nguyen c: ");
        c = input.nextDouble();
        System.out.println("Phuong trinh bac 2=>ax^2+bx+c=0 :"+a+"x^2 +"+b+"x +"+c+"=0 ");
        if(a==0){
            System.out.print("Phuong trinh vo nghiem!!");
        }else
        {
            double Delta = Math.pow(b,2) - 4*a*c;
            if(Delta>0)
            {
                System.out.print("Phuong trinh se co 2 nghiem khac nhau nhu sau:");
                double x1,x2;
                x1 = (-b+Math.sqrt(Delta))/2*a;
                x2 = (-b-Math.sqrt(Delta))/2*a;
                System.out.println("\nX1= "+x1+","+"x2="+x2);
            }else if(Delta<0)
            {
                System.out.print("Phuong trinh vo nghiem!\n vi Delta<0");
            }
            if(Delta==0)
            {
                double x=-b/2*a;
                System.out.print("Phuong trinh co 2 nghiem giong nhau x1=x2= "+x);
                
            }
        }
        
        
        
    }
    
}
