//Lab number: 3
//Author Name: Shammah Thao
//Module Description:This program prints out the calendar of all 12 months.
// Date: 1/31/2018
// it is not correct since the days for the months doesnt change.
import java.util.Calendar;
public class PrintCalendar
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
      System.out.printf("%10d",givenYear);
      if(givenYear%4==0 && (givenYear%100!=0 || givenYear%400==0))
      {
               System.out.print(": Leap Year");
      }
      JulianDate JD = new JulianDate();
      int date = JD.toJulian(2018,1,1);
      int dayOfWeek = (date+1)%7; //0 mean Sunday, 1 mean Monday, etc
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
         if(givenYear == currentYear)
         {
            if(currentMonth == i)
            {
               System.out.println("-------------------------");
            }
         }
         System.out.println();
         System.out.println("     " + month);
         System.out.println();
         System.out.printf("%3s%3s%3s%3s%3s%3s%3s\n","S","M","Tu","W","Th","F","S");
         if(month == "January" || month == "October")
         {
            System.out.printf("%3s"," ");
            for(int j = 0; j <= (days-1); j++)
            {
               if(j > 9)
               {
                  System.out.printf("%3d",(j+1));
               }
               if(j<=9)
               {
                  System.out.printf("%3d",(j+1));
               }
               if(j==5 || j==12 || j== 19 || j == 26)
               {
                  System.out.println();
               }
            }
         }
         else if(month == "February" || month == "  March" || month == "November")
         {
            System.out.printf("%12s"," ");
            for(int j = 0; j <= (days-1); j++)
            {
               if(j > 9)
               {
                  System.out.printf("%3d",(j+1));
               }
               if(j<=9)
               {
                  System.out.printf("%3d",(j+1));
               }
               if(j==2 || j==9 || j== 16 || j == 23)
               {
                  System.out.println();
               }
            }
         }
         else if(month == "  April" || month == "  July")
         {
            for(int j = 0; j <= (days-1); j++)
            {
               if(j > 9)
               {
                  System.out.printf("%3d",(j+1));
               }
               if(j<=9)
               {
                  System.out.printf("%3d",(j+1));
               }
               if(j==6|| j==13 || j== 20 || j == 27)
               {
                  System.out.println();
               }
            }   
         }
         else if(month == "  May")
         {
            System.out.printf("%6s"," ");
            for(int j = 0; j <= (days-1); j++)
            {
               if(j > 9)
               {
                  System.out.printf("%3d",(j+1));
               }
               if(j<=9)
               {
                  System.out.printf("%3d",(j+1));
               }
               if(j==4 || j==11 || j== 18 || j == 25)
               {
                  System.out.println();
               }
            }
         }
         else if(month == "  June")
         {
            System.out.printf("%15s"," ");
            for(int j = 0; j <= (days-1); j++)
            {
               if(j > 9)
               {
                  System.out.printf("%3d",(j+1));
               }
               if(j<=9)
               {
                  System.out.printf("%3d",(j+1));
               }
               if(j==1 || j==8 || j== 15 || j == 22)
               {
                  System.out.println();
               }
            }
         }
         else if(month == " August")
         {
            System.out.printf("%9s"," ");
            for(int j = 0; j <= (days-1); j++)
            {
               if(j > 9)
               {
                  System.out.printf("%3d",(j+1));
               }
               if(j<=9)
               {
                  System.out.printf("%3d",(j+1));
               }
               if(j==3 || j==10 || j== 17 || j == 24)
               {
                  System.out.println();
               }
            }
         }
         else if(month == "September" || month == "December")
         {
            System.out.printf("%18s"," ");
            for(int j = 0; j <= (days-1); j++)
            {
               if(j > 9)
               {
                  System.out.printf("%3d",(j+1));
               }
               if(j<=9)
               {
                  System.out.printf("%3d",(j+1));
               }
               if(j==0 || j==7 || j== 14 || j == 21 || j==28)
               {
                  System.out.println();
               }
            }         }
         System.out.println("\n");
         if(givenYear == currentYear)
         {
            if(currentMonth == i)
            {
               System.out.println("-------------------------");
            }
         }
       }
   } 
   
  // public static void leapYear(
}