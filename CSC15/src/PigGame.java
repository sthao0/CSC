/* Shammah Thao
   Csc 15, Hw #2
   11/3/2017 */
import java.util.Scanner;
import java.util.Random;
public class PigGame
{
   //Delcare all the constant
   public static final int POINTS = 40;
   public static final int FORFEIT_POINTS = 20;
   public static void main(String[] agrs)
   {
     // make kb a scanner, and rand for random
     Scanner kb = new Scanner(System.in);
     Random rand = new Random();
     // Call the first couple main methods to display
     description();
     String no = " ";
     playGame(kb,rand);
 
   }
   // The method to descibe the output to the user
   public static void description()
   {
      System.out.println("**********************************************************************************");
      System.out.println("*      You are about to play the pig game against the computer.                  *");
      System.out.println("*	    On each turn, the current player will roll a pair of dice                 *");
      System.out.println("*	    and acumulates points. The goal is to reach to40 points                  *");
      System.out.println("*	    before your opponent does. If, on any turn, the player roll               *");
      System.out.println("*	    all the points accumulated for that round are forfeited and               *");
      System.out.println("*	    the control of the dice moves to the other player. If the player           *");
      System.out.println("*	    rolls two 1s in one turn , the player loses all the points                *");
      System.out.println("*	    accumulated thus far and forfeit and the control moves to the            *");
      System.out.println("*	    other player. The player may voluntarily turn over the dice after         *");
      System.out.println("*	    each roll. Therefore player must decide to roll again(be a pig)           *");
      System.out.println("*	    and risk losing points , or relinquish control of the dice, possibly      *");
      System.out.println("*	    allowing the other player to win.                                         *");
      System.out.println("*	    Computer is going to flip a coin to choose the  first player              *");
      System.out.println("**********************************************************************************");
      System.out.println("lets start the fun");
      System.out.println();
      System.out.println();
   }
   // this method is used to make it so if there is another player, they can play the game again. If there isnt another play, it ends.
   public static String getPrompt(Scanner kb, Random rand)
   {
      String yes = "yes";
      String no = "no";
      String yn = " ";
      while(!yn.equalsIgnoreCase("yes") && !yn.equalsIgnoreCase("no"))
      {
         System.out.print("\nIs there another player? ");
         yn = kb.nextLine(); 
         if(yn.equalsIgnoreCase(yes))
         {
            description();
            playGame(kb,rand);
         }
         else if(yn.equalsIgnoreCase(no))
         {
            System.exit(0);
         }
            
      }
      return yn;
   }
   // Method to call who goes first, and also helps switch between computer and player.
   public static String coinFliping(Random rand)
   {
      int coin = rand.nextInt(2)+1;
      if(coin == 1)
      {
         return "head";
      }
      else 
      {
        return "tail";
      }
    }
    // the method to randomly get a number between 1 - 6
    public static int rollingDice(Random rand)
    {
      int dice = 0;
      int num = rand.nextInt(6)+1;
      switch (num)
      {
         case 1 : dice = 1;
         break;
         case 2 : dice = 2;
         break;
         case 3 : dice = 3;
         break;
         case 4 : dice = 4;
         break;
         case 5 : dice = 5;
         break;
         case 6 : dice = 6;
         break;
       }
      return dice;
    }  
    // Method to aquire the computer name. There are a total of 10 name, and are randomly choosen by computer.
    public static String getComputerName(Random rand)
    {
      String Cname = " ";
      int num = rand.nextInt(10) + 1;
      switch (num)
      {
         case 1 : Cname = "Ginger";
         break;
         case 2 : Cname = "Sleepy";
         break;
         case 3 : Cname = "Bob";
         break;
         case 4 : Cname = "Will";
         break;
         case 5 : Cname = "Pill";
         break;
         case 6 : Cname = "Crazy";
         break;
         case 7 : Cname = "Lizzy";
         break;
         case 8 : Cname = "Alexander";
         break;
         case 9 : Cname = "Fruity";
         break;
         case 10 : Cname = "Mighty";
         break;
      } 
      return Cname;
    }
    // Method to play the game
    public static void playGame(Scanner kb, Random rand)
    {
    // call a variables being called or used
      int Cscore = 0;
      int Pscore = 0;
      int Cscore2 = 0;
      int Pscore2 =0;
      int dice1 = rollingDice(rand);
      int dice2 = rollingDice(rand);
      int Points = 0;
      int points = dice1 + dice2;
      String Cname = getComputerName(rand);
      String first = coinFliping(rand);
      System.out.println("Hi my name is " + Cname);
      // get the users name
      System.out.print("What is your name? ");
      String name = kb.nextLine();
      String Capname = name.substring(0,1).toUpperCase();
      String Pname = Capname + name.substring(1);
      System.out.println("Hi " + Pname + ", I am fliping the coin to determine who goes first");
      System.out.println("press any key to start the game.");
      kb.nextLine();
      // method to call who goes first. randomly choosen 
      if(first.equalsIgnoreCase("head"))
      {
        System.out.println(Pname + " is going to start the game");
      }
      else if(first.equalsIgnoreCase("tail"))
      {
        System.out.println(Cname + " is going to start the game");
      }      
      // While there isnt any winner
      while(!(Cscore2 >= POINTS) || !(Pscore2 >= POINTS))
      { 
       // Players turn
        while(first.equalsIgnoreCase("head"))
        {
          Pscore += 0;
          Pscore2 = 0;
          dice1 = rollingDice(rand);
          dice2 = rollingDice(rand);
          points = (dice1 + dice2);
          Pscore2 = (dice1 + dice2) + Pscore;
         System.out.println(Pname + "'s turn:");  
         // if statement for if both dice roll a 1, total points is lose
         if(dice1 == 1 && dice2 == 1)
         {
            System.out.println("Points : " + Pscore);
            System.out.println("dice1 : " + dice1);
            System.out.println("dice2 : " + dice2);
            System.out.println("Sorry " + Pname + " you lost all your points");
            Pscore2 = Pscore2 * 0;
            System.out.println("points : " + Pscore2);
            Pscore= points * 0;
            System.out.println("\nPress any key to continue");
            kb.nextLine();
            while(!first.equalsIgnoreCase("tail"))
            {
              first = "tail";
              if(first.equalsIgnoreCase("tail"))
               {
               break;
               }
            }
            
         }
         // method if dice1 = 1 then total points stay the same
         else if(dice1 == 1)
         {
            System.out.println("Points : " + Pscore);
            System.out.println("dice1 : " + dice1);
            System.out.println("dice2 : " + dice2);
            System.out.println("Sorry " + Pname + " you lost the points for this turn");
            Pscore2 = Pscore;
            System.out.println("points : " + Pscore2);
            points = 0;
            // make user choose if they want to hold the points if they got more then 20, or they can keep going
            if(Pscore2 >= FORFEIT_POINTS)
            {
            String yn = " ";
            while( !(yn.equalsIgnoreCase("yes")) || !(yn.equalsIgnoreCase("no")))
               {
               System.out.print("Do you want to forfeit your turn since you have 20 or more points? ");
               yn = kb.nextLine();
               if(yn.equalsIgnoreCase("yes"))
                  {
                   while(!first.equalsIgnoreCase("tail"))
                   {
                    first = coinFliping(rand);
                    if(first.equalsIgnoreCase("tail"))
                    {
                     break;
                    }
                   }
                   break;
                  }
               else if(yn.equalsIgnoreCase("no"))
                  {
                  System.out.println("points : " + Pscore2);
                  break;
                  }
               }
            }
            System.out.println("\nPress any key to continue");
            kb.nextLine();   
            Pscore = Pscore;
            // statement to switch to computer if player loses points
            while(!first.equalsIgnoreCase("tail"))
            {
              first = coinFliping(rand);
              if(first.equalsIgnoreCase("tail"))
               {
               break;
               }
            }
         }// method if dice2 = 1 then total points stay the same
         else if (dice2 == 1)
         {
            System.out.println("Points : " + Pscore);
            System.out.println("dice1 : " + dice1);
            System.out.println("dice2 : " + dice2);
            System.out.println("Sorry " + Pname + " you lost the points for this turn");
            Pscore2 = Pscore;
            System.out.println("points : " + Pscore2);
            points = 0;
            // player given choose to hold points and pass turn, or keep going
            if(Pscore2 >= FORFEIT_POINTS)
            {
            String yn = " ";
            while( !(yn.equalsIgnoreCase("yes")) || !(yn.equalsIgnoreCase("no")))
               {
               System.out.print("Do you want to forfeit your turn since you have 20 or more points? ");
               yn = kb.nextLine();
               if(yn.equalsIgnoreCase("yes"))
                  {
                   while(!first.equalsIgnoreCase("tail"))
                   {
                    first = coinFliping(rand);
                    if(first.equalsIgnoreCase("tail"))
                    {
                     break;
                    }
                   }
                   break;
                  }
               else if(yn.equalsIgnoreCase("no"))
                  {
                  System.out.println("points : " + Pscore2);
                  break;
                  }
               }
            }
            System.out.println("\nPress any key to continue");
            kb.nextLine();   
            Pscore += points;
            // switch plater if lose points
            while(!first.equalsIgnoreCase("tail"))
            {
              first = coinFliping(rand);
              if(first.equalsIgnoreCase("tail"))
               {
               break;
               }
            }
         }
         // else if statement to keep adding points if nothing wrong happens         
         else if(!(dice1 == 1) && !(dice2==1))
         {
            System.out.println("Points : " + Pscore);
            System.out.println("dice1 : " + dice1);
            System.out.println("dice2 : " + dice2);
            // if player score is bigger than or equals to 40, then player win, then output results.
            if(Pscore2 >= POINTS)
            {
               System.out.println("Hurray!!!!!");
               System.out.println("You reached or passed 40 points");
               System.out.println("points : " + Pscore2);
               System.out.println("\nPress any key to continue");
               kb.nextLine();
               System.out.println("Hurray!!! We have a winner");
               System.out.println("Somebody got 40 or more");
               System.out.println(Cname + " points: " + Cscore2);
               System.out.println(Pname + " points: " + Pscore2);
               if(Cscore2 > Pscore2)
               {
                  System.out.println(Cname + " won the game");
               }
               else if ( Pscore2 > Cscore2 )
               {
                  System.out.println(Pname + " won the game");
               } 
               getPrompt(kb,rand);
            }
            System.out.println("points : " + Pscore2); 
            if(Pscore2 >= FORFEIT_POINTS)
            {
            String yn = " ";
            while( !(yn.equalsIgnoreCase("yes")) || !(yn.equalsIgnoreCase("no")))
               {
               System.out.print("Do you want to forfeit your turn since you have 20 or more points? ");
               yn = kb.nextLine();
               if(yn.equalsIgnoreCase("yes"))
                  {
                   while(!first.equalsIgnoreCase("tail"))
                   {
                    first = coinFliping(rand);
                    if(first.equalsIgnoreCase("tail"))
                    {
                     break;
                    }
                   }
                   break;
                  }
                  else if(yn.equalsIgnoreCase("no"))
                  {
                  System.out.println("points : " + Pscore2);
                  break;
                  }
               }
            }

            Pscore += points;
              System.out.println("\nPress any key to continue");
              kb.nextLine(); 
         }
       }
        // Computer Turn
        while(first.equalsIgnoreCase("tail"))
        {
            Cscore += 0;
            Cscore2 = 0;
            dice1 = rollingDice(rand);
            dice2 = rollingDice(rand);
            points = (dice1 + dice2);
            Cscore2 = (dice1 + dice2) + Cscore;
         System.out.println(Cname + "'s turn:");
         if(dice1 == 1 && dice2 == 1)
         {
            System.out.println("Points : " + Cscore);
            System.out.println("dice1 : " + dice1);
            System.out.println("dice2 : " + dice2);
            System.out.println("Sorry " + Cname + " you lost all your points");
            Cscore2 = Cscore2 * 0;
            System.out.println("points : " + Cscore2);
            Cscore = Cscore2 * 0;
            while(!first.equalsIgnoreCase("head"))
            {
              first = coinFliping(rand);
              if(first.equalsIgnoreCase("head"))
               {
               break;
               }
            }
         }
         // method if dice1 = 1 then total points stay the same
         else if(dice1 == 1)
         {
            System.out.println("Points : " + Cscore);
            System.out.println("dice1 : " + dice1);
            System.out.println("dice2 : " + dice2);
            System.out.println("Sorry " + Cname + " you lost the points for this turn");
            Cscore2 = Cscore;
            System.out.println("points : " + Cscore2);
            points = 0;
            if(Cscore2 >= FORFEIT_POINTS)
            {
               String yn = computerFF(rand);  
               if(yn.equalsIgnoreCase("yes"))
                  {
                     System.out.println("I am Forfeiting my turn since i have " + Cscore2 + " which is more than twenty points");
                      while(!first.equalsIgnoreCase("head"))
                     {
                        first = coinFliping(rand);
                        if(first.equalsIgnoreCase("head"))
                        {
                           break;
                        }
                     }
                  }
                     else if(yn.equalsIgnoreCase("no"))
                  {
                  }
             }  
            Cscore = Cscore;
            while(!first.equalsIgnoreCase("head"))
            {
              first = coinFliping(rand);
              if(first.equalsIgnoreCase("head"))
               {
               break;
               }
            }
         }
         // method if dice2 = 1 then total points stay the same
         else if (dice2 == 1)
         {
            System.out.println("Points : " + Cscore);
            System.out.println("dice1 : " + dice1);
            System.out.println("dice2 : " + dice2);
            System.out.println("Sorry " + Cname + " you lost the points for this turn");
            Cscore2 = Cscore;
            System.out.println("points : " + Cscore2);
            points = 0;
            if(Cscore2 >= FORFEIT_POINTS)
            {
               String yn = computerFF(rand);  
               if(yn.equalsIgnoreCase("yes"))
                  {
                    System.out.println("I am Forfeiting my turn since i have " + Cscore2 + " which is more than twenty points");
                      while(!first.equalsIgnoreCase("head"))
                     {
                        first = coinFliping(rand);
                        if(first.equalsIgnoreCase("head"))
                        {
                           break;
                        }
                     }
                  }
               else if(yn.equalsIgnoreCase("no"))
                  {
                  }
             }
             Cscore = Cscore;
            while(!first.equalsIgnoreCase("head"))
            {
              first = coinFliping(rand);
              if(first.equalsIgnoreCase("head"))
               {
               break;
               }
            } 
         }  
         // else if statement to make the game keep adding points, if there's no 1 in the game.       
         else if(!(dice1 == 1) && !(dice2==1))
         {
            System.out.println("Points : " + Cscore);
            System.out.println("dice1 : " + dice1);
            System.out.println("dice2 : " + dice2);
            System.out.println("points : " + Cscore2);
            // if statement to compare computer score to the final 40 points, if it is greater or equal to, computer win
            if(Cscore2 >= POINTS)
            {
               System.out.println("Hurray!!!!!");
               System.out.println("You reached or passed 40 points");
               System.out.println("\nPress any key to continue");
               kb.nextLine(); 
               System.out.println("Hurray!!! We have a winner");
               System.out.println("Somebody got 40 or more");
               System.out.println(Cname + " points: " + Cscore2);
               System.out.println(Pname + " points: " + Pscore2);
               if(Cscore2 > Pscore2)
               {
                  System.out.println(Cname + " won the game");
               }
               else if ( Pscore2 > Cscore2 )
               {
                  System.out.println(Pname + " won the game");
               } 
               getPrompt(kb,rand);
               
            } 
            // ask user to if they want to hold their points if they got 20 or more.
            if(Cscore2 >= FORFEIT_POINTS)
            {
               String yn = computerFF(rand);  
               if(yn.equalsIgnoreCase("yes"))
                  {
                    System.out.println("I am Forfeiting my turn since i have " + Cscore2 + " which is more than twenty points"); 
                      while(!first.equalsIgnoreCase("head"))
                     {
                        first = coinFliping(rand);
                        if(first.equalsIgnoreCase("head"))
                        {
                           break;
                        }
                     }
                  }
               else if(yn.equalsIgnoreCase("no"))
                  {
                  }
             }
            }
            Cscore += points;  
            System.out.println("\nPress any key to continue");
            kb.nextLine();       
         }
       }
     }    
  //Write a code so that the computer can randomly choose to Forfeit or not.
  public static String computerFF(Random rand)
  {
   String yn =  " ";
   int num = rand.nextInt(2)+1;
   switch(num)
   {
      case 1 : yn = "yes";
      break;
      case 2 : yn = "no";
      break;
   }
   return yn;
   } 
}