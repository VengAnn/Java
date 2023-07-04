/*viet code dung  ArrayList tao mot chuong trinh co 5 mon hoc 
1.nhap thong tin Id,ten, gioi tinh , tuoi va diem tung moi mon hoc 
2. tinh diem tong quat va diem trung binh cua tat ca tung moi sinh vien 
3.in ra man hinh  diem tong quat va diem trung vinh tung moi sinh vien ra man hinh
*/
package Project_test;
import java.util.ArrayList;
import java.util.Scanner;

public class test3 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n;
         System.out.print("input quatity : ");
         n =input.nextInt();
        ArrayList<SD> student = new ArrayList<SD>();
        for(int i=0; i<n; i++)
        {
            System.out.print("input ID: ");
            String Id = input.nextLine();
            input.nextLine();
            System.out.print("input Name: ");
            String Name= input.nextLine();
            System.out.print("input Gender: ");
            String Gender = input.nextLine();
            System.out.print("input Age: ");
            int age = input.nextInt();
            System.out.print("input Score1:");
            double Score1=input.nextDouble();
            System.out.print("input Score2:");
            double Score2=input.nextDouble();
            System.out.print("input Score3:");
            double Score3=input.nextDouble();
            System.out.print("input Score4:");
            double Score4=input.nextDouble();
            System.out.print("input Score5:");
            double Score5=input.nextDouble();  
            // create new SD have obj name sv and add to ArrayList
            SD sv = new SD(Id,Name,Gender,age,Score1,Score2,Score3,Score4,Score5);
            student.add(sv); 
        }
        for(SD sv : student)
        {
          System.out.println("Information :");
          sv.AverageSumof5Score();
          sv.output();
          
        }

    }
}
class SD
{
    private String Name,Id,Gender;
    private int age;
    private double Score1,Score2,Score3,Score4,Score5;
    private double AverageSumof5Score;
    public SD(String N,String i,String G,int a,double Score1,double Score2,double Score3,double Score4,double Score5)
    {
        this.Name = N;
        this.Id = i;
        this.Gender = G;
        this.age = a;
        this.Score1 = Score1;
        this.Score2 = Score2;
        this.Score4 = Score4;
        this.Score5 = Score5;
    }
    public String getName(String N)
    {
        return this.Name = N;
    }
    public String getId(String i)
    {
        return this.Id = i;
    }
    public String getGender(String G)
    {
        return this.Gender = G;
    }
    public int getAge(int a)
    {
        return this.age = a;
    }
    public double getScore1(double s1)
    {
        return this.Score1 =s1;
    }
     public double getScore2(double s2)
    {
        return this.Score2 =s2;
    }
      public double getScore3(double s3)
    {
        return this.Score3 =s3;
    }
     public double getScore4(double s4)
    {
        return this.Score4 =s4;
    }
     public double getScore5(double s5)
    {
        return this.Score5 =s5;
    }
    public double AverageSumof5Score()
    {
       double sum = (Score1+Score2+Score3+Score4+Score5)/5;
      return sum;
       
    }
    public void output()
    {
        System.out.println("ID: "+Id);
        System.out.println("Name: "+Name);
        System.out.println("Gender: "+Gender);
        System.out.println("Age: "+age);
        System.out.println("Average: "+AverageSumof5Score);
    }
    
}


