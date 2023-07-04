package baitap;
import java.util.Scanner;
public class BAI_Tim_Max_cua_so {
    public static int find_Max(int[] array)
    {
        int max = array[0];
        for(int i=0 ;i<array.length; i++)
        {
            if(array[i] > max)
            {
               max = array[i];
            } 
        }
        return max;
    }
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap do dai cua mang: ");
        int n = input.nextInt();
        int array[] = new int[n];
        for(int i=0;i<n ; i++)
        {
            System.out.print("Nhap cac phan tu cua mang array ["+i+"]=");
            array[i] = input.nextInt();
        }
        System.out.print("Gia tri lon nhat cua array la: "+find_Max(array));
        
    }
    
}
