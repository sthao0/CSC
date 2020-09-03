import java.util.Scanner;
public class ShowInterestShell 
{
    public static void main(String[] args) 
    {
       Scanner kb = new Scanner(System.in);
       System.out.println("Welcome to interest calculator");
       System.out.println("This program shows how money increase over time given a particular interest rate and a");
       System.out.println("regular deposit amount.");
       System.out.println();
       //ask how many times do you want to use this app
       System.out.print("How many time do you want to use this app: ");
       //get the user's input
       int count = kb.nextInt();
       kb.nextLine();
       
       //for( 1 to count)
       for(int i = 1; i <= count; i++);
       {
            //call the method getInfo
          getInfo(kb);
            //call the method getInterest
          getInterests(kb);
       }     
            
            
    }
    //this method calls getName, getTelephone, getAddress and out put the user's info on the screen
    public static void getInfo(Scanner kb)
    {
      String name = getName(kb);
      int phone = getTelephone(kb);

      String address = getAddress(kb); 
      System.out.println();
      System.out.println();
      System.out.println();
      System.out.print("******************************************");
      System.out.println();
      System.out.println();
      System.out.println("Name: " + name);
      System.out.println("Phone: " + phone);
      System.out.println("Address: " + address);
      System.out.println();
      System.out.println();
      System.out.println("******************************************");              
    }
    //this method gets the user's name and reformat it as shwn in the output, converts it to upper case and returns the result
    public static String getName(Scanner kb)
    {
        System.out.println();
        System.out.print("Enter your first and last name separating with one space(all letters in lowercase): ");
        String name = kb.nextLine();
        name.toUpperCase();
         return name;
    }
    //this method gets the phone number and reformat shown in the output and returns the result
    public static  int getTelephone(Scanner kb)
    {  
        System.out.print("Enter your phone number in the format(123 456 7890): ");
        int phone = kb.nextInt();
        kb.nextLine();
        return phone; 
    }
    //this method gets the address and reformat shown in the output and returns the result    
    public static  String getAddress(Scanner kb)
    {
        System.out.print("Enter your address in the following format(6000 j street:Sacramento:CA 95819): ");
        String address = kb.nextLine();
        return address;   
       
    }     
       
     /*This method asks  the info such as initial amount, number of years, ineterst rate, monthly deposit
     then calls the method printTable and passes the info needed to that method*/ 
    public static void getInterests(Scanner kb)
   {   
       System.out.print("Enter the initial amount: ");
       double amount = kb.nextDouble();
       kb.nextLine();
       System.out.print("Enter the number of the years: ");
       int periods = kb.nextInt();
       kb.nextLine();
       System.out.print("Enter the interest rate: ");
       double rate = kb.nextDouble();
       kb.nextLine();
       System.out.print("Enter the monthly deposit: ");
       double deposit = kb.nextDouble();
       kb.nextLine(); 
       
       printTable(amount, periods, rate, deposit);
    }
    /*This program displays a description of the app */
    public static void description()
    {
    }

    public static void printTable(double amount, int periods, double rate,double deposit) 
    {
        //print the header such as Year Interest deposit new balance
        System.out.println("Year\tInterest\tDeposit\tNewBalance");
        //output start    and the initial amount
        System.out.println("start\t\t\t\t\t\t\t\t" + amount);
        //for( 1 to the number of years
        for(int i = 1; i <= periods; i++)
        {
           //call the method getInterest
           getInterest(amount,rate);
           rate = rate;
           //call the method round to round the calculated ineterst
           round2(rate);
           //calculate the balance by adding the amount , interest and deposit
           amount = amount + rate + deposit;
           //call the method round to round the new balance
           round2(amount);
           //display the result
           System.out.println(i + "\t\t\t" + rate + "\t" + deposit + "\t\t\t" + amount);
        }   
    }
    /*calculate the amount of the interest deposited to the acount after each month
    which is amount * rate /100*/
    public static double  getInterest(double amount, double rate)
    {
      rate = amount * rate / 100;
       return rate; 
    }
    //rounds the given double value to two decimal points
    public static double round2(double n) 
    {
      double round2 = (double) Math.round(n * 100.0) / 100.0;
        return round2;
    }
}