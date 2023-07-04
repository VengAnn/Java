//Giai He phuong trinh a1X+b1Y=c1 va a2X+b2Y=c2;Theo Phuong thuc Cramer D
package baitap;
import java.util.Scanner;
public class Giai_he_phuong_trinh_2_bien {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double a1,b1,c1;
        double a2,b2,c2;
        System.out.print("Nhap so a1 cau he: ");
        a1 = input.nextDouble();
        System.out.print("Nhap so b1 cua he: ");
        b1 = input.nextDouble();
        System.out.print("Nhap so c1 cua he: ");
        c1 = input.nextDouble();
        System.out.print("Nhap so a2 cua he: ");
        a2 = input.nextDouble();
        System.out.print("Nhap so b2 cua he: ");
        b2 = input.nextDouble();
        System.out.print("Nhap so c2 cua he: ");
        c2 = input.nextDouble();
        System.out.print("He phuong trinh La: "+a1+"x +"+b1+"y="+c1+" va "+a2+"x +"+b2+"y="+c2);
        double D,Dx,Dy;
        D = a1*b2 - a2*b1;
        Dx = c1*b2 - c2*b1;
        Dy = a1*c2 - a2*c1;
        if(D==0)
        {
            if(Dx+Dy == 0) //Dx=Dy=0 phuong he phuong trinh vo so nghiem!;
            {
                System.out.print("\nHe Phuong trinh co vo so nghiem ");     
            }
            else{//nguoc lai D=0; Dx!=0va Dy!=0 he vo nghiem;
                System.out.print("\nHe Phuong trinh vo nghiem Vi D=0 va Dx!=Dy");
                
            }
        }
        else //D!=0 thi co nghiem X=Dx/D; Y=Dy/D;
        {
            System.out.print("\nHe phuong trinh se co nghiem X Va Y nhu sau:\n"+"x ="+(Dx/D)+ " , 2" +"Y="+(Dy/D));
        }
    }
    
}
