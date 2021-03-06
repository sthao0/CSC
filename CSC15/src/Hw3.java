/* Shammah Thao
   Csc15 Hw #3
   11/13/2017  */
import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class Hw3
{
   public static void main(String[] args) throws FileNotFoundException
   {
     Scanner kb = new Scanner(System.in);
     Random rand = new Random();
     String[] names = new String[20];
     String[] items = new String[20];
     double[] bids = new double[4];
     start(kb,bids,rand,names,items);
   }
   public static void readName(String[] names) throws FileNotFoundException
   {
      File f = new File("Hw3name.txt");
      Scanner input = new Scanner(f);
      String name = " ";
      for(int i = 0; i < 4 ; i++)
      {
         names[i] = input.nextLine();
         name = names[i];
         System.out.println(name);
      }
   }
   public static void randNames(Random rand,String[] names) throws FileNotFoundException
   {
      readName(names);
      String randnames = "";
      for(int i = 0; i < 4; i++)
      {
         String randname = names[new Random().nextInt(20)];
         randnames = randname;
      }
   }
   public static void readList(String[] items) throws FileNotFoundException
   {
      File f = new File("Hw3price.txt");
      Scanner input = new Scanner(f);
      for(int i = 0; i < 1; i++)
      {
               items[i] = input.nextLine();
               System.out.println(items[i]);
      }
   }
   public static void randItems(Random rand, String[] items) throws FileNotFoundException
   {
      readList(items);
      String randitems = "";
      for(int i = 0; i < 4; i++)
      {
         randitems = items[new Random().nextInt(20)];
      }
   }
   public static void playerBids(Scanner kb, double[] bids)
   {
      for(int i = 0; i < bids.length; i++)
      {
         System.out.print("enter your bid: ");
         while(!kb.hasNextInt())
         {
            kb.next();
            System.out.print("Enter your bid :");
         }
         bids[i] = kb.nextInt();
         kb.nextLine();
      }                             
   }
   public static int priceIsRight(int bids[], int price)
   {
      int closest = 0;
      for(int i=0; i< bids.length; i++)
      {
         if(closest<bids[i] && bids[i]<=price)
         {
            closest=bids[i];
         }
      }
      return closest;
   }
   public static void result()
   {
      //display  all the bids made by the play, the price of the items and the winner of the play
      System.out.println("Welcome, you are about to play \"Price is Right\" game, a game where you");
      System.out.println("try to guess the actual price of an item. The closest bid to the actualy price is the winner.");
      
      
    
   }
   public static void start(Scanner kb,double[] bids,Random rand,String[] names, String[] items) throws FileNotFoundException
   {  
      randNames(rand,names);
      randItems(rand,items);
      playerBids(kb,bids);
   }
}