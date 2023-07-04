/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.benhan;
import java.util.Scanner;
/**
 *
 * @author hoang
 */
public class BenhVien {
   static Scanner sc = new Scanner(System.in);
        static int i;
        static BenhNHAN[] bn = new BenhNHAN[1000];
        static BenhAN[]  ba = new BenhAN[100];
        static int sl = 0;

 public static void Action(){
    System.out.println("\t\t\t\t BENH VIEN DA KHOA THAI NGUYEN XIN KINH CHAO !!!");
     System.out.println("\t\t\t\t\t VUI LONG NHAP LUA CHON CUA BAN: ");
     System.out.println("\t1.NHAP THONG TIN BENH NHAN.");
     System.out.println("\t2.CHO BIET TU NGAY 20/2/2021 DEN 13/4/2021 CO BAO NHIEU BENH NHAN NAM VIEN.");
     System.out.println("\t3.CHO BIET TU NGAY 20/2/2021 DEN 13/4/2021 CO BAO NHIEU BENH NHAN RA VIEN.");
     System.out.println("\t4.DANH SACH BENH NHAN TU LON DEN BE ");
     System.out.println("\t0.THOAT.");
     
     i = sc.nextInt();
     switch(i){
            case 1:
            {
                int a;
                System.out.print("BAN MUON NHAP BAO NHIEU BENH NHAN ? ");
                a = sc.nextInt();
                sc.nextLine();
                int b = a + sl;
                while(sl < b){
                    bn[sl] = new BenhNHAN();
                    bn[sl].NhapBN();
                    ba[sl] = new BenhAN();
                    ba[sl].NhapBA();
                    sl++;
                }  
            break;
            }
            case 2:
            {
              System.out.println("SO LUONG BENH NHAN VAO VIEN LA: "); 
              int soluongV = 0;
              for(int j =0 ; j < sl ; j ++)
              {

                  if (((ba[j].GetNamVao() == 2021 && ba[j].GetThangVao() == 2 && ba[j].GetNgayVao() > 20) 
                       || (ba[j].GetNamVao() == 2021 && ba[j].GetThangVao() > 2 ))
                      &&
                      ((ba[j].GetNamVao() == 2021 && ba[j].GetThangVao() == 4 && ba[j].GetNgayVao() < 13 ) 
                       || (ba[j].GetNamVao() == 2021 && ba[j].GetThangVao()  < 4)))
                  {
                      soluongV++;
                      bn[j].Print();
                      System.out.println("");
                  }      
              }
              
              System.out.println("So luong benh nhan vao vien " + soluongV);
              break;
            }         
            case 3:
            {
              System.out.println("SO LUONG BENH NHAN RA VIEN LA: "); 
              int soluongR = 0;
              for(int j =0 ; j < sl ; j ++)
              {

                  if (((ba[j].GetNamRa() == 2021 && ba[j].GetThangRa() == 2 && ba[j].GetNgayRa() > 20) 
                       || (ba[j].GetNamVao() == 2021 && ba[j].GetThangVao() > 2 ))
                      &&
                      ((ba[j].GetNamRa() == 2021 && ba[j].GetThangRa() == 4 && ba[j].GetNgayRa() < 13 ) 
                       || (ba[j].GetNamRa() == 2021 && ba[j].GetThangRa()  < 4)))
                  {
                      soluongR++;
                      bn[j].Print();
                      System.out.println("");
                  }      
              }
              System.out.println("So luong benh nhan vao vien " + soluongR);
              break;
            }       
           case 4:
            {             
             System.out.println("Dach Sach Benh Nhan Tu Lon den Be");
               for(int y =0 ; y < sl -1 ; y ++){
                for(int j =1 ; j < sl   ; j ++){                 
                       if(bn[j-1].GetNamSinh() >  bn[j].GetNamSinh())
                       {
                           System.out.println("So luong benh nhan vao vien ");
                           bn[999] = bn[j-1];
                           bn[j-1]  = bn[j];
                           bn[j] = bn[999];
                       }                      
                           else 
                       {
                           if(bn[j-1].GetNamSinh() == bn[j].GetNamSinh() && bn[j-1].GetThangSinh() < bn[j].GetThangSinh())
                           {                           
                           bn[999] = bn[j-1];
                           bn[j-1]  = bn[j];
                           bn[j] = bn[999];                     
                           }
                           else
                           {
                               if(bn[j-1].GetNamSinh() == bn[j].GetNamSinh() && bn[j-1].GetThangSinh() == bn[j].GetThangSinh() 
                                       && bn[j-1].GetNgaySinh() < bn[j].GetNgaySinh())
                               {                            
                                         bn[999] = bn[j-1];
                                         bn[j-1]  = bn[j];
                                         bn[j] = bn[999];
                               }                             
                           }
                          }
                       }
             }
             
            for(int z =0 ; z < sl ; z ++)
              {
                  bn[z].Print();
                  System.out.println("");
              }                     
             break;   
            }
            
            case 0:
            {
                break;
            }
            default:
            {
                System.out.println("CU PHAP KHONG HOP LE. VUI LONG THU LAI.");
            }    
     }
   }
    public static void main(String[] args)
    { 
       while(true)
       {
               Action();
               
       }    
}
 
}
    

     

    

