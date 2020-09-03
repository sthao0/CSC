/* Shammah Thao
   10/19/2017
   Csc15 Hw#1 */

import java.util.Scanner;  
public class TestScore1   // class name
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in); // set scanner to kb(keyboard)
      int scoreone = 0;
      int scoretwo = 0;
      description(); // call the description
      System.out.print("How many time do you want to use this program: "); // ask the user for how many time they want to use it
      int use = kb.nextInt(); //user input
      kb.nextLine();
      
      for(int i = 1; i <= (use * 2); i++) // using if loop, multiple the use by 2 since you want to display 2 time the amount of your use so you can compare two user
      {
        choose(kb);
         if( i%2 == 0) // use this so after every two it would compare their gpa score and also repeat the desciption so it can compare two different people. 
         { 
          Compare(scoreone, scoretwo);       
          System.out.println();
          description();
         }                      
      
       }
   }
   public static double choose(Scanner kb)
   {
       System.out.println();
       System.out.println("Information for applicant #1:" );  // write an output so it can change the numer everytime it go to a different use.
       System.out.print("    do you have 1) SAT scores or 2) ACT scores? "); // ask what they want to compare
       int choice = kb.nextInt();
       kb.nextLine();
       if (choice >= 3 && choice <= 0) // call the one that they want
         { 
            System.out.print(" ");
         }
            else if (choice == 1)
         {
              SAT(kb);
         }
            else if (choice == 2)
         {
              ACT(kb);
         }
         return 0;
   }

   public static void description() // the description of what the program is about
   {
      System.out.println("This program compares two applicants to ");
      System.out.println("determine which one seems like the stronger ");
      System.out.println("applicant.  For each candidate I will need ");
      System.out.println("either SAT or ACT scores plus a weighted GPA.");
      
   }
   public static double SAT(Scanner kb) // ask user to input all their SAT info
   {
      System.out.print("    SAT math? ");
      double math = kb.nextDouble();
      kb.nextLine();
      System.out.print("    SAT critical reading? ");
      double reading = kb.nextDouble();
      kb.nextLine();
      System.out.print("    SAT writing? ");
      double writing = kb.nextInt();
      kb.nextLine();
      double sgpa = Sexam(math, reading, writing);
      double gpa1 = Allgpa(kb);
      double finals = (sgpa + gpa1);
      return finals;
    }
    public static double Sexam(double math, double reading,double writing) // the formula for SAT exam
    {
      double exam1 = ((2 * math + reading + writing)/32);
      System.out.printf("    exam score = %4.1f", + exam1);
      return exam1;
    }
    public static double ACT(Scanner kb) // ask user to input teir ACT results
    {
      System.out.print("    ACT English? ");
      double english = kb.nextInt();
      kb.nextLine();
      System.out.print("    ACT math? ");
      double math = kb.nextInt();
      kb.nextLine();
      System.out.print("    ACT reading? ");
      double reading = kb.nextInt();
      kb.nextLine();
      System.out.print("    ACT science? ");
      double science = kb.nextInt();
      kb.nextLine();
      double agpa = Aexam(math,reading,science,english);
      double gpa2 = Allgpa(kb);
      double finala = (agpa + gpa2);
      return finala;
    }
   public static double Aexam(double math,double reading, double science,double english) // formula for ACT exam
    {
      double exam2 = ((english + 2 * math + reading + science)/1.8);
      System.out.printf("    exam score = %4.1f", + exam2);
      return exam2;
    }
  public static double Allgpa(Scanner kb) // the gpa, ask and return the gpa
   {
      System.out.print("\n    overall GPA? ");
      double overall = kb.nextDouble();
      kb.nextLine();
      System.out.print("    max GPA? ");
      double max = kb.nextDouble();
      System.out.print("    Transcript Multiplier? ");
      double trans = kb.nextDouble();
      kb.nextLine();
      double gpa = ((overall / max) * 100 * trans);
      System.out.printf("    GPA score = %4.1f", + gpa);
      System.out.print("\n");
      return gpa;
   } 
   public static void Compare(double scoreone, double scoretwo)
   {
     System.out.println();
     System.out.printf("First applicant overall score = %5.1f" + scoreone);
     System.out.printf("Second applicant overall score = %5.1f" + scoretwo);
            if(scoreone > scoretwo)
              {
                System.out.println("The first applicant seems to be better");
              }
            else if (scoreone == scoretwo)
               {
                System.out.println("The two applicants seem to be equal");
               }
                else if (scoretwo > scoreone)
               {
                System.out.println("The second applicant seems to be better");
               }
   }
}

