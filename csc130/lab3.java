import java.util.*;
import java.io.*;

class lab3{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.println("Input number");
      int num = scan.nextInt();
      System.out.println("Your number: " + num);
      
      int b = num;
      String a = "";
      while(b > 0){
         int d = b % 2;
         a = d + a;
         b = b/2;
      }
     System.out.println("Binary: " + a);
     
     String hex [] = {"A","B","C","D","E","F"};
       String h="";
       int m = num;
       while(0<m)
         {
           int r = m%16;//m mod 16
           if(9<r)
         {
      
       r=r-10;
       h=hex[r]+h;
       }
       else{
         h = Integer.toString(r)+h;
       }
       m=m/16;//m/16
       }
     System.out.println("hexa: " + h);
   }  
}