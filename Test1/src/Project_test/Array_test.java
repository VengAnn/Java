
package Project_test;
import java.util.Scanner;
public class Array_test {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Input quatity of Array: ");
        n = input.nextInt();
        int a[] =new int[n];
        for(int i=0; i<n ;i++)
        {
            System.out.println("a["+i+"]:"+a[i]);
        }
    }
}
