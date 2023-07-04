
package Veng_Ann_project_Learn;
import java.util.Scanner;
public class Students {
    private long Id;
    private String Name;
    private String Gender;
    private String Address;
    private int year;
    private float java;
    private float cpp;
    private float csharp;
    public Students(long id,String Name,String Gender,String Address,int y,float j,float cp,float csharp)
    {
        this.Id = id;
        this.Name = Name;
        this.Gender = Gender;
        this.Address = Address;
        this.year = y;
        this.java = j;
        this.cpp = cp;
        this.csharp = csharp;
    }
    public void setAddress(String Address) 
    {
        this.Address = Address;
    }
    public String getAddress() 
    {
        return Address;
    }
    public void setid(long id)
    {
        this.Id = id;
    }
    public long getid()
    {
        return Id;
    }
    public void setName(String N)
    {
        this.Name = N;
    }
    String getName()
    {
        return Name;
    }
    void setGender(String G)
    {
        this.Gender = G;
    }
    public String getGender() {
        return Gender;
    }

    public void setCpp(float cpp) {
        this.cpp = cpp;
    }
    public float getcpp()
    {
        return cpp;
    }
    public void setJava(float java) {
        this.java = java;
    }
    public float getJava() {
        return java;
    }

    public void setCsharp(float csharp) {
        this.csharp = csharp;
    }
    public float getCsharp() {
        return csharp;
    }
    public void setyear(int y)
    {
        this.year = y;
    }
    public int getyear()
    {
        return year;
    }
    public double average()
    {
        return (java+cpp+csharp)/3;
    }
    public String Mention()
    {
        if(average()>=0)
            if(average()<50)
                return "Fail";
            else if(average()<65)
                return "Pass";
            else if(average()<75)
                return "Fair";
            else if(average()<85)
                return "Good";
            else if(average()<95)
                return "very Good";
            else 
                return "Excellent";
        else
            return "Invalid";
    }
    void show()
    {
        System.out.print("Id:"+Id+"\tName:"+Name+"\tGender:"+Gender+"\tAddress:"+Address+"\tYear:"+year+"\tjava:"+java+"\tcpp:"+cpp+"\tcsharp:"+csharp);
        System.out.print("\tAverage:"+average()+"\t Metion:"+Mention());
        System.out.print("\n-------------------------------------------------------\n");
        
    }
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       int n;
       System.out.print("Input Quatity : ");
       n = input.nextInt();
       Students obj[] = new Students[n];
       for(int i=0; i<obj.length; i++)
       {
            long Id=i+1;
            String Name;
            String Gender;
            String Address;
            int year;
            float java;
            float cpp;
            float csharp;
           System.out.println("Input ID:"+Id); 
           System.out.print("Input Name:");
           input.nextLine();
           Name = input.nextLine();
           System.out.print("Input Gender:");
           Gender = input.next();
           System.out.print("Input Address:");
           input.nextLine();
           Address = input.nextLine();
           System.out.print("Input year of birth:");
           year = input.nextInt();
           System.out.print("Input Mark of java:");
           java = input.nextFloat();
           System.out.print("Input Mark of cpp:");
           cpp = input.nextFloat();
           System.out.print("Input Mark of csharp:");
           csharp = input.nextFloat();
           System.out.print("-------------------------------------\n");
           obj[i] = new Students(Id, Name, Gender, Address,year, java, cpp, csharp);
       }
       for(int i=0; i<obj.length-1; i++)
       {
           for(int j=i+1;j<obj.length; j++)
           {
               if(obj[i].average()<obj[j].average())
               {
                   Students temp;
                   temp=obj[i];
                   obj[i]=obj[j];
                   obj[j]=temp;
               }
           }
       }
       for(int i=0; i<obj.length; i++)
       {
           obj[i].show();
       }
   }
}

