import java.util.Scanner;
public class TimeShell
{
   //declare all your constants
   public static final int SEC_PER_MINUTE = 60;
   public static void main(String[] args)
   {
       Scanner kb = new Scanner(System.in);
       start(kb);            
        
   }
   /* call the method description
   prompt the user for the name and the number of the times that they want to use this program
   get the hours, minutes, seconds
   call the method hoursToSec
   call the method minToSec
   calculate the total seconds
   output the total seconds
   call the method minSec to calulate the minutes and sec
   call the method hourMinSec*/
   public static void start(Scanner kb)
   {
      minSec(167);  
   }
   /*This method get the totlal number of the seconds and 
   finds the number of the minutes and sec and outputs the result*/
   public static void minSec(int totalSeconds)
   {
      int min = totalSeconds / SEC_PER_MINUTE;
      int sec = totalSeconds % SEC_PER_MINUTE;
      
      //output the result
      System.out.println(totalSeconds + " seconds is " + min +" minutes and " + sec + " seconds");
   }
   /*This method get the total number of the seconds and calculates the number of hours, minutes and second, then outputs the result*/
   public static void hourMinSec(int totalSeconds)
   {
            
   } 
   /*calulates the number of the seconds in the given hours and returns the value*/  
   public static int hourToSec(int hours)
   {
       return 0;         
   }
   /*This method calculates the number of the seconds in the given number of minutes*/
   public static int minToSec(int min)
   {
       return 0;
   }
   /*outputs the description of the program*/
   public static void description()
   {
   }
   
 }  