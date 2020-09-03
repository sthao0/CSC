//Lab number: 2 
//Author Name: Shammah Thao
//Module Description:This program ask the user for two output 3 integar number and then the program solves it by outputing everything out.
// Date: 1/31/2018
import java.util.*;

public class PrintMultipOfNDigits{

   public static void main(String[] agrs)
   {
      Scanner kb = new Scanner(System.in);
      System.out.println("Enter num1 intger");
      int num1 = kb.nextInt();     
      System.out.println("Enter num2 integer");
      int num2 = kb.nextInt();
      int num3 = (num2%10)*num1;
      int num4 = ((num2/10)%10) *num1;
      int num5 = ((num2/10)%1000)%100*num1 ;
      int num0 = num1 * num2;
      System.out.printf("%10d\nX%9d\n%10s\n%10d\n%9d\n%8d\n%10s\n%10d\n",num1,num2," --------- ",num3,num4,num5," --------- ",num0);
   }         
}         