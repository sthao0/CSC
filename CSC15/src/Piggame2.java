import java.util.Scanner;
import java.util.Random;
public class Piggame2
{
   public final int POINTS = 40;
   public final int FORFEIT_POINTS = 20;
   public static void main(String[] agrs)
   {
     Scanner kb = new Scanner(System.in);
     Random rand = new Random();
     description();
     playGame(kb,rand);
   }
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
   public static void getPrompt(Scanner kb, Random rand)
   {
      System.out.print("Is there another play? ");
      String yn = kb.nextLine();   
      while(!yn.equalsIgnoreCase("yes") && !yn.equalsIgnoreCase("no"))
      {
         System.out.print("Is there another play? ");
         String yn2 = kb.nextLine(); 
         if(yn2.equalsIgnoreCase("yes") || yn2.equalsIgnoreCase("no")) 
         {
            playGame(kb,rand);
         }    
      }
   }
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
 /*   public static int diceFliping(Random rand)
    {
      int dice1 = rollingDice(rand);
      int dice2 = rollingDice(rand);
      int points = dice1 + dice2;
      int Points = 0;
      System.out.println("Points : " + Points);
      System.out.println("dice1 : " + dice1);
      System.out.println("dice2 : " + dice2);
      Points += points;
      return Points;     
    } */
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
    public static void playGame(Scanner kb, Random rand)
    {
      int Cscore = 0;
      int Pscore = 0;
      int dice1 = rollingDice(rand);
      int dice2 = rollingDice(rand);
      int Points = 0;
      int points = dice1 + dice2;
      String Cname = getComputerName(rand);
      System.out.println("Hi my name is " + Cname);
      System.out.print("What is your name? ");
      String name = kb.nextLine();
      String Capname = name.substring(0,1).toUpperCase();
      String Pname = Capname + name.substring(1);
      System.out.println("Hi " + Pname + ", I am fliping the coin to determine who goes first");
      System.out.println("press any key to start the game.");
      kb.nextLine();
      while(!(Cscore >= 40) || !(Pscore >= 40))
      { 
        String first = coinFliping(rand);
        if(first.equalsIgnoreCase("head"))
         {
         System.out.println(Pname + " is going to start the game");
         while(first.equalsIgnoreCase("head"))
         {
          Points += 0;
          dice1 = rollingDice(rand);
          dice2 = rollingDice(rand);
          points = (dice1 + dice2);
          Pscore = (dice1 + dice2) + Points;
         System.out.println(Pname + "'s turn:");  
         if(dice1 == 1 && dice2 == 1)
         {
            System.out.println("Points : " + Points);
            System.out.println("dice1 : " + dice1);
            System.out.println("dice2 : " + dice2);
            System.out.println("Sorry " + Pname + " you lost all your points");
            Pscore = Pscore * 0;
            System.out.println("points : " + Pscore);
            Pscore = points * 0;
            System.out.println("\nPress any key to continue");
            kb.nextLine();
         }
         else if(dice1 == 1)
         {
            System.out.println("Points : " + Points);
            System.out.println("dice1 : " + dice1);
            System.out.println("dice2 : " + dice2);
            System.out.println("Sorry " + Pname + " you lost the points for this turn");
            Pscore = Points;
            System.out.println("points : " + Pscore);
            points = 0;
            if(Pscore >= 20)
            {
            System.out.print("Do you want to forfeit your turn since you have 20 or more points? ");
            String yn = kb.nextLine();
            while( !(yn.equalsIgnoreCase("yes")) || !(yn.equalsIgnoreCase("no")))
               {
               System.out.print("Do you want to forfeit your turn since you have 20 or more points ");
               String ny = kb.nextLine();
               if(ny.equalsIgnoreCase("yes"))
                  {
                   
                  }
               else if(ny.equalsIgnoreCase("no"))
                  {
                  System.out.println("points : " + Pscore);
                  }
               }
            }
            System.out.println("\nPress any key to continue");
            kb.nextLine();   
            Points = Points;
         }
         else if (dice2 == 1)
         {
            System.out.println("Points : " + Points);
            System.out.println("dice1 : " + dice1);
            System.out.println("dice2 : " + dice2);
            System.out.println("Sorry " + Pname + " you lost the points for this turn");
            Pscore = Points;
            System.out.println("points : " + Pscore);
            points = 0;
            if(Pscore >= 20)
            {
            System.out.print("Do you want to forfeit your turn since you have 20 or more points? ");
            String yn = kb.nextLine();
            while( !(yn.equalsIgnoreCase("yes")) || !(yn.equalsIgnoreCase("no")))
               {
               System.out.print("Do you want to forfeit your turn since you have 20 or more points ");
               String ny = kb.nextLine();
               if(ny.equalsIgnoreCase("yes"))
                  {
                    first.equalsIgnoreCase("tail");
                  }
               else if(ny.equalsIgnoreCase("no"))
                  {
                  System.out.println("points : " + Pscore);
                  }
               }
            }
            System.out.println("\nPress any key to continue");
            kb.nextLine();   
            Points += points;
         }         
         else if(!(dice1 == 1) && !(dice2==1))
         {
            System.out.println("Points : " + Points);
            System.out.println("dice1 : " + dice1);
            System.out.println("dice2 : " + dice2);
            System.out.println("points : " + Pscore);
            if(Pscore >= 20)
            {
            System.out.print("Do you want to forfeit your turn since you have 20 or more points? ");
            String yn = kb.nextLine();
            while( !(yn.equalsIgnoreCase("yes")) || !(yn.equalsIgnoreCase("no")))
               {
               System.out.print("Do you want to forfeit your turn since you have 20 or more points ");
               String ny = kb.nextLine();
               if(ny.equalsIgnoreCase("yes"))
                  {
                    first.equalsIgnoreCase("tail");
                  }
               else if(ny.equalsIgnoreCase("no"))
                  {
                  System.out.println("points : " + Pscore);
                  }
               }
               System.out.println("\nPress any key to continue");
               kb.nextLine();        
            }
              System.out.println("\nPress any key to continue");
              kb.nextLine(); 
              Points += points; 
          }
             if(Pscore >= 40)
             {
            System.out.println("Hurray!!!!!");
            System.out.println("You reached or passed 40 points");
            System.out.println("\nPress any key to continue");
            System.out.println("\nHurray!!! We have a winner");
            System.out.println("Somebody got 40 or more");
            System.out.println(Cname + " points: " + Cscore);
            System.out.println(Pname + " points: " + Pscore);
            if(Cscore > Pscore)
            {
            System.out.println(Cname + " won the game");
            }
             else if ( Pscore > Cscore )
            {
               System.out.println(Pname + " won the game");
            } 
            getPrompt(kb,rand);
          }
         }
        }
         //computer turn
        else if (first.equalsIgnoreCase("tail"))
         {
         System.out.println(Cname + " is going to start the game");
         while(first.equalsIgnoreCase("tail"))
         {
            Points += 0;
            dice1 = rollingDice(rand);
            dice2 = rollingDice(rand);
            points = (dice1 + dice2);
            Cscore = (dice1 + dice2) + Points;
         System.out.println(Cname + "'s turn:");
         if(dice1 == 1 && dice2 == 1)
         {
            System.out.println("Points : " + Points);
            System.out.println("dice1 : " + dice1);
            System.out.println("dice2 : " + dice2);
            System.out.println("Sorry " + Cname + " you lost all your points");
            Cscore = Cscore * 0;
            System.out.println("points : " + Cscore);
            Points = Cscore * 0;
            System.out.println("\nPress any key to continue");
            kb.nextLine();
         }
         else if(dice1 == 1)
         {
            System.out.println("Points : " + Points);
            System.out.println("dice1 : " + dice1);
            System.out.println("dice2 : " + dice2);
            System.out.println("Sorry " + Cname + " you lost the points for this turn");
            Cscore = Points;
            System.out.println("points : " + Cscore);
            points = 0;
            if(Cscore >= 20)
            {
               String yn = computerFF(rand);  
               if(yn.equalsIgnoreCase("yes"))
                  {
                     System.out.println("I am Forfeiting my turn since i have " + Cscore + " which is more than twenty points");
                  }
               else if(yn.equalsIgnoreCase("no"))
                  {
                  System.out.println("points : " + Cscore);
                  }
             }  
            Points = Points;
         }
         else if (dice2 == 1)
         {
            System.out.println("Points : " + Points);
            System.out.println("dice1 : " + dice1);
            System.out.println("dice2 : " + dice2);
            System.out.println("Sorry " + Cname + " you lost the points for this turn");
            Cscore = Points;
            System.out.println("points : " + Cscore);
            points = 0;
            if(Cscore >= 20)
            {
               String yn = computerFF(rand);  
               if(yn.equalsIgnoreCase("yes"))
                  {
                    System.out.println("I am Forfeiting my turn since i have " + Cscore + " which is more than twenty points");
                  }
               else if(yn.equalsIgnoreCase("no"))
                  {
                  System.out.println("points : " + Cscore);
                  }
             }
             Points = Points;  
         }         
         else if(!(dice1 == 1) && !(dice2==1))
         {
            System.out.println("Points : " + Points);
            System.out.println("dice1 : " + dice1);
            System.out.println("dice2 : " + dice2);
            System.out.println("points : " + Cscore);
            if(Cscore >= 20)
            {
               String yn = computerFF(rand);  
               if(yn.equalsIgnoreCase("yes"))
                  {
                    System.out.println("I am Forfeiting my turn since i have " + Cscore + " which is more than twenty points");
                  }
               else if(yn.equalsIgnoreCase("no"))
                  {
                  }
             }
            }
            System.out.println("\nPress any key to continue");
            kb.nextLine(); 
            Points += points;        
         }
                  if(Pscore >= 40 || Cscore >= 40)
         {
            System.out.println("Hurray!!!!!");
            System.out.println("You reached or passed 40 points");
            System.out.println("\nPress any key to continue");
            System.out.println("\nHurray!!! We have a winner");
            System.out.println("Somebody got 40 or more");
            System.out.println(Cname + " points: " + Cscore);
            System.out.println(Pname + " points: " + Pscore);
            if(Cscore > Pscore)
            {
            System.out.println(Cname + " won the game");
            }
             else if ( Pscore > Cscore )
            {
               System.out.println(Pname + " won the game");
            } 
            getPrompt(kb,rand);
          }
       }
     }
   }
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
   public static void finish(Scanner kb, Random rand)
   {
   }
   
}
// infinity loop  when asking to ff
// make it switch between computer and player.
// make an ending output ending.

