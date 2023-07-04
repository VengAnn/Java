
/*viet mot chuong trinh co 5 mon hoc 
1.nhap thong tin Id,ten, gioi tinh , tuoi va diem tung moi mon hoc 
2. tinh diem tong quat va diem trung binh cua tat ca tung moi sinh vien 
3.in ra man hinh  diem tong quat va diem trung vinh tung moi sinh vien ra man hinh*/
package Project_test;
import java.util.Scanner;
public class Test2 
{
    public static void main(String[] args) 
    {
        Scanner input =new Scanner(System.in);
        int n;
        System.out.print("Input Quantity of student :");
        n = input.nextInt();
         SV[] sv = new SV[n];
         for(int i=0; i<n;i++)
        {
            System.out.println("Input information of students "+(i+1)+":");
            System.out.print("Input Identity Id: ");
            int Id = input.nextInt();
            input.nextLine(); // thêm dòng này để xóa bộ nhớ đệm
            System.out.print("Input Name: ");
            String Name = input.nextLine();
            System.out.print("Input Gender: ");
            String Gender = input.nextLine();
            System.out.print("Input age: ");
            int age = input.nextInt();
            System.out.print("Input Mark of Score 1: ");
            double Score1 = input.nextDouble();
            System.out.print("Input Mark of Score 2: ");
            double Score2 = input.nextDouble();
            System.out.print("Input Mark of physic Score 3: ");
            double Score3= input.nextDouble();
            System.out.print("Input Mark of chemistry Score 4: ");
            double Score4 = input.nextDouble();
            System.out.print("Input Mark of biology Score 5: ");
            double Score5 = input.nextDouble();
            //Tao mot doi tuong SV vua nhap
            sv[i] = new SV(Id,age,Name,Gender,Score1,Score2,Score3,Score4,Score5);
        }
         for(int i=0; i<n ;i++)
         {
            sv[i].AverageofScore();
            System.out.println("Information of students "+(i+1)+":");
            sv[i].PrintInfo();
         }

    }
 }
class SV
{
    private int Id;
    private int age;
    private String Name;
    private String Gender;
    private double Score1; 
    private double Score2;
    private double Score3;
    private double Score4;
    private double Score5;
    private double AverageofScore;
    //constructor SV ham tao
    public SV(int id, int age, String Name, String Gender,double Score1,double Score2,double Score3,double Score4,double Score5)
    {
        this.Id = id;
        this.Name =Name;
        this.age = age;
        this.Gender = Gender;
        this.Score1 = Score1;
        this.Score2 = Score2;
        this.Score3 = Score3;
        this.Score4 = Score4;
        this.Score5 = Score5;
    }
    public void getage(int age)
    {
        this.age =age;
    }
    public void getGender(String Gender)
    {
        this.Gender = Gender;
    }
    public void getScore1(double Score1)
    {
        this.Score1 = Score1;
    }
     public void getScore2(double Score2)
    {
        this.Score2 = Score2;
    }
      public void getScore3(double Score3)
    {
        this.Score3 = Score3;
    }
       public void getScore4(double Score4)
    {
        this.Score4 = Score4;
    }
     public void getScore5(double Score5)
    {
        this.Score5 = Score5;
    }
    public void getName(String Name)
    {
        this.Name = Name;
    }

    public void getid(int id)
    {
        this.Id = id; 
    }
    public void AverageofScore()
    {
        double TotalScore = Score1 + Score2 + Score3 + Score4 + Score5;
        double average = TotalScore/5.0;
        this.AverageofScore=average;
    }
    public void PrintInfo()
    {
        System.out.println("Id :" +Id);
        System.out.println("Name :" +Name);
        System.out.println("Age : " +age);
        System.out.println("Gender :" +Gender);
        System.out.println("Score1 :" +Score1);
        System.out.println("Score2 :" +Score2);
        System.out.println("Score3 :" +Score3);
        System.out.println("Score4 :" +Score4);
        System.out.println("Score5 :" +Score5);
        System.out.println("Average Score: "+AverageofScore);
    }   
}

