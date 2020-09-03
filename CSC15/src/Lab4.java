import java.util.Scanner;
public class Lab4
{
   public static void main(String[] agrs) 
   {
      Scanner kb = new Scanner(System.in);
      recall(kb);
   }
   public static int description(Scanner kb)
   {
      System.out.println("*******    This program converts your birthday to its ");
      System.out.println("equivalent roman numbers    *******");
      System.out.print("How many times do you want to repeat this program: ");
      int repeat = kb.nextInt();
      kb.nextLine();
      return repeat;
    }  
   public static void recall(Scanner kb)
   {
      int repeat = description(kb);
      for(int i = 1; i <= repeat; i++)
      {
         String name = start(kb);
         System.out.println("Hi " + name + " let's start");
         birthday(kb); 
         
      }
    }
    public static String start(Scanner kb)
    {
      System.out.print("Enter your name: ");
      String name = kb.nextLine();
      return name;
      
    }
    public static int birthday(Scanner kb)
    {
      System.out.print("Enter the month of your birthday: ");
      int month = kb.nextInt();
      kb.nextLine();
      String first = roman(month);
      System.out.print("Enter the day of your birthday: ");
      int day = kb.nextInt();
      kb.nextLine();
      String second = roman(day);
      System.out.print("Enter the year of your birthday: ");
      int year = kb.nextInt();
      kb.nextLine();
      String third = roman(year);
      System.out.println("Your birthday in Roman is: " + first + "/" + second + "/" +third);
      return month;
     }
     public static String roman(int num)
     {
      if (num <= 0)
       {
         return " ";
       }
       else if (num >= 1000) 
       {
         return "M" + roman(num - 1000);
       }
          else if (num >= 900)
          { 
            return "CM" + roman(num - 900);
          } 
          else if (num >= 500) 
          {
            return "D" + roman(num - 500);
          }
            else if (num >= 400) 
            {
               return "CD" + roman(num - 400);
            }
          else if (num >= 100) 
          {
            return "C" + roman(num - 100); 
          }           
          else if (num >= 90) 
          {
            return "XC" + roman(num - 90);
          }
          else if (num >= 50) 
          {
            return "L" + roman(num - 50);
          }
         else if (num >= 40) 
         {
            return "XL" + roman(num - 40);
         }
         else if (num >= 10)
         {
             return "X" + roman(num - 10);
         }
         else if (num >= 9) 
         {
            return "IX" + roman(num - 9);
         }
          else if (num >= 5) 
         {
            return "V" + roman(num - 5);
         }
          else if (num >= 4) 
          {
            return "IV" + roman(num - 4);
          }
             else if (num >= 1)
           {
            return "I" + roman(num - 1);
           }
             return roman(num);
     }
}