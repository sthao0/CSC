/* Shammah Thao
   CSC 15 lab 3, Chapter 3
   09/22/2017
*/

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
      //prompt the user
      System.out.print("How many time do you want to repeat the app? ");
      //read input, need to flush "Enter" input by using (kb.nextLine()
      int count = kb.nextInt();
      kb.nextLine();
      
   for(int repeat = 1; repeat <= count; repeat++)
    {
      System.out.print("What is your name? ");
      String name = kb.nextLine();
      System.out.println("Hi " + name + " Lets start!!");
      System.out.println();
      
      //prompt the user to get the hours (as int)
      System.out.print("Enter the number of the hours: ");
      //read the user's input (as int)
      int hours = kb.nextInt();
      kb.nextLine();
      
      //prompt the user to get the number of the mins
      System.out.print("Enter the number of the minutes: ");
      // read the user 's input(as int)
      int min = kb.nextInt();
      kb.nextLine();
      
      //prompt the user to get the numbe rof the secs 
      System.out.print("Enter the number of the seconds: ");
      //read the user's input(as int)
      int sec = kb.nextInt();
      kb.nextLine();
      
      //output the hours, mins, secs that you got from the user
      System.out.println(hours + " Hours, " + min + " Minutes, and " + sec + " Seconds is :");
      System.out.println();
      
      //call the method hourToSec
      int sec1 = hourToSec(hours);
      //call the method minToSec
      int sec2 = minToSec(min);
      //calculate the total sec
      int total = sec1 + sec2 + sec;
      //output the total seconds
      System.out.println(total + " seconds");
      //call the method minSec
      minSec(total);
      //call the method hourMinSec
      hourMinSec(total);
      System.out.println();
   }
   }
   /*This method get the totlal number of the seconds and 
   finds the number of the minutes and sec and outputs the result*/
   public static void minSec(int totalSeconds)
   {
     int min = totalSeconds / 60;
     int sec = totalSeconds % 60;    
      //output the result
      System.out.println(min + " minutes, " + sec + " seconds");
      
      
   }
   /*This method get the total number of the seconds and calculates the number of hours, minutes and second, then outputs the result*/
   public static void hourMinSec(int totalSeconds)
   {
     int hours = (totalSeconds / 60) / 60;
     int min = (totalSeconds/60) % 60;
     int sec = totalSeconds % 60;
     System.out.println(hours + " Hours " + min + " Minutes " + sec + " Seconds "); 
    
   } 
   /*calulates the number of the seconds in the given hours and returns the value*/  
   public static int hourToSec(int hours)
   {
      int sec = hours * 3600;
      return sec;
              
   }
   /*This method calculates the number of the seconds in the given number of minutes*/
   public static int minToSec(int min)
   {
      int sec = min * 60;
       return sec;
   }
   /*outputs the description of the program*/
   public static void description()
   {
   }
 }  