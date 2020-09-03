//Lab number: 3
//Author Name: Shammah Thao
//Module Description:This program prints out the calendar of all 12 months.
// Date: 1/31/2018
import java.util.Calendar;
public class PrintCalendar2
{ 
   public static void main(String[] args)
   {
      int currentYear = Calendar.getInstance().get(Calendar.YEAR);
      int currentMonth= Calendar.getInstance().get(Calendar.MONTH)+1;
      int givenYear;
      if(args.length != 0)
      {
         givenYear = Integer.parseInt(args[0]);
       }
       else{
       givenYear = currentYear;
       }
      if(givenYear%4==0 && (givenYear%100!=0 || givenYear%400==0))
      {
               System.out.print(" Leap Year");
       }
      
      JulianDate JD = new JulianDate();
      int date = JD.toJulian(givenYear,1,1);
      int dayOfWeek = (date+1)%7; //0 mean Sunday, 1 mean Monday, etc
      System.out.printf("%10d\n",givenYear);
      for(int i = 1; i <= 12; i++)
      {
         int days = 0;
         String month = " ";
         switch(i)
         {
            case 1: month = "January";
            days = 31;
            break;
            case 2: month = "February";
            days = 28;
            if(givenYear%4==0 && (givenYear%100!=0 || givenYear%400==0))
            {
               days++;
            }
            break;
            case 3: month = "  March";
            days = 31;
            break;
            case 4: month = "  April";
            days = 30;
            break;
            case 5: month = "  May";
            days = 31;
            break;
            case 6: month = "  June";
            days = 30;
            break;
            case 7: month = "  July";
            days = 31;
            break;
            case 8: month = " August";
            days = 31;
            break;
            case 9: month = "September";
            days = 30;
            break;
            case 10: month = "October"; 
            days = 31;
            break;
            case 11: month = "November";
            days = 30;
            break;
            case 12: month = "December";
            days = 31;
            break;
         }
         if(currentMonth == i)
         {
            System.out.println("\n-------------------------");
         }
         System.out.println();
         System.out.println("     " + month);
         System.out.println();
         System.out.printf("%3s%3s%3s%3s%3s%3s%3s\n","S","M","Tu","W","Th","F","S");
         for(int k = 0; k <= (days-1); k++)
         {
            System.out.printf("%3d",(k+1));
            if(k%7==0 || i == days)
            {
               System.out.print("\n");
            }
            
         }
         
      }
   }
   
}