import java.util.Scanner;
import java.util.Random;

public class Lab5
{
   public static void main(String[] agrs)
   {
     Scanner kb = new Scanner(System.in);
     Random rand = new Random(); 
     
     description();
    //call the compare, put the computer choices into the compare
    compare(kb, rand); 
   }
   public static void description()
   {
     System.out.println("Using this app you can play Rock-Paper-Scissors game against the computer. When played between"); 
     System.out.println("two people, each person picks one of the three options at the same time, and the winner");
     System.out.println("Is determined. The program should randomly choose one of the three options, then prompt for the");
     System.out.println("user’s selection. At that point, the program reveals both choices and print a");
     System.out.println("Statement indicating if the user won, the computer won, or if it was a tie. Continue playing until the"); 
     System.out.println("user choose to stop. Then print the total number of the games played, total wins, total losses, and ");
     System.out.println("total ties.");
     System.out.println();
     System.out.println("Ready ,Set, Go");
   }
   public static String getComputerChoice(Random rand)
   {
      String choice = " ";
      //generate a random number bewtween 0- 2 inclusive
      int num = rand.nextInt(3) + 1;
      //use switch statement
      switch (num)
      {
         case 1 : choice = "rock";
         break;
         case 2 : choice = "Paper";
         break;
         case 3 : choice = "Scissor";
         break;
      }  
      //return choice
      return choice;
   }
   public static String getUserChoice(Scanner kb)
   {
   //show user choice
      System.out.println();
      System.out.println("your choices");
      System.out.println("       Rock");
      System.out.println("       Paper");
      System.out.println("       Scissor");
      System.out.println("       stop");
      String rock = "rock";
      String paper = "paper";
      String scissor = "scissor";
      String stop = "stop";
      System.out.print("Enter your choice: ");
      String choice = kb.nextLine();
      choice = choice.toUpperCase(); 
      while (!choice.equalsIgnoreCase(rock) && !choice.equalsIgnoreCase(paper) && !choice.equalsIgnoreCase(scissor) && !choice.equalsIgnoreCase(stop))
      {
         System.out.println("your choices");
         System.out.println("       Rock");
         System.out.println("       Paper");
         System.out.println("       Scissor");
         System.out.println("       stop");
         System.out.print("Enter your choice: ");
         choice = kb.nextLine();
         choice = choice.toUpperCase();
      }
 //return user's choice
   return choice;
  }
  public static int compare(Scanner kb,Random rand)
  {
      int Cscore = 0;
      int Pscore = 0;
      int ties = 0;
      int time = 0;
      int player;
      time = time + 1;
      String loop="yes";
      
    while(loop.equals("yes"))
    {
      String Pchoice = getUserChoice(kb);
      String Cchoice = getComputerChoice(rand);
      System.out.println();
      if(!Pchoice.equalsIgnoreCase("stop"))
      {
         System.out.println("Computer selected: " + Cchoice);
         System.out.println("You selected: " + Pchoice);
      }
   
   
     if(Pchoice.equalsIgnoreCase(Cchoice))
      {
         System.out.println("There is a tie!");
         ties++;
         time++;
      }
      else if(Pchoice.equalsIgnoreCase("rock"))
      {
        if(Cchoice.equalsIgnoreCase("scissor"))
        {
         System.out.println("Hurray! You won.");
         Pscore++;
         time++;
        }
      else if (Cchoice.equalsIgnoreCase("paper"))
       {
        System.out.println("Oh No, you lost");
        Cscore++;
        time++;
       }
     }
    else if(Pchoice.equalsIgnoreCase("scissor"))
    {
      if(Cchoice.equalsIgnoreCase("paper"))
      {
         System.out.println("Hurray! You won.");
         Pscore++;
         time++;
      }
      else if (Cchoice.equalsIgnoreCase("rock"))
      {
          System.out.println("Oh No, you lost");
          Cscore++;
          time++;
      }
    }
    else if(Pchoice.equalsIgnoreCase("paper"))
    {
        if(Cchoice.equalsIgnoreCase("rock"))
        {
          System.out.println("Hurray! You won.");
          Pscore++;
          time++;
        }
        else if (Cchoice.equalsIgnoreCase("scissor"))
        {
          System.out.println("Oh No, you lost");
          Cscore++;
          time++;
        }            
    }
   if(Pchoice.equalsIgnoreCase("stop"))
    {
      System.out.println("------------------------------------");
      System.out.println("Times played:" + time);
      System.out.println("Wins:     " + Pscore);
      System.out.println("Losses:   " + Cscore);
      System.out.println("Ties:     " + ties);
      
      if(Cscore > Pscore)
      {
         System.out.println("Sorry computer won this time. Try again.");
      }
      else if (Pscore > Cscore)
      {
         System.out.println("Congratualtion! You won.");
      }
      else if (Pscore == Cscore)
      {
         System.out.println("It's a tie");
      }
      System.out.println();
      System.out.println("------------------------------------");
      getPlay(kb, rand);
      break;
    }
   }
   return 0;
  }
  public static void getPlay(Scanner kb,Random rand)
  { 
   System.out.print("Do you want to play again? ");
   String play = kb.nextLine();
   
   if(play.equalsIgnoreCase("Yes"))
   {
      description();
      compare(kb,rand);
   }
   else if(play.equalsIgnoreCase("No"))
   {
      System.out.println("GOOD BYE. COME BACK SOON");
   }
  } 
}
   