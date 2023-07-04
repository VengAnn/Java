package Project_test;
import java.util.Scanner;
public class Test1 
{
    /* private static int sum(int a,int b)
    {
        return (a+b);
    }
     protected static int sub(int a,int b)
     {
         return (a-b);
     }
    */
    static void square(double a)
    {
        double AreaofSquare =  Math.pow(a, 2);//a*a;
        System.out.print("Area of Square = "+AreaofSquare);
        
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input value of square a=");
        double a = input.nextDouble();
        square(a);
    }   
}