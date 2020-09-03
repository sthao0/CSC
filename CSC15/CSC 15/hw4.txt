import java.util.*;
public class Hw4
{
   public static void main(String[] agrs)
   {
      Scanner kb = new Scanner(System.in);
      GroceryList mylist = new GroceryList();
      purchase(mylist,kb);
   }
   public static void purchase(GroceryList mylist,Scanner kb)
   {
      boolean repeat = true;
      while(repeat)
      {
         System.out.println("Enter the item name: ");
         String name = kb.nextLine();
         System.out.println("Enter the quantity: ");
         int q = getInt(kb);
         System.out.println("Enter the Price: ");
         double p = kb.nextDouble();
         item item = new item(name,q,p);
         mylist.add(item);
         System.out.print("Do you want to buy another item? ");
         String answer = kb.next();
         if(answer.equalsIgnoreCase("no"))
         {
            repeat = false;
         }
      }
   }
   public static int getInt(Scanner kb)
   {
      int num = 0;
      while(!kb.hasNextInt())
      {
         kb.nextLine();
         System.out.print("Enter the quantity: ");
      }
      num = kb.nextInt();
      return num;
   }
   public static void modify(GroceryList mylist,Scanner kb)
   {
      item[] items = mylist.getList();
      System.out.print(mylist.toString());
      System.out.print("Enter the name of the item");
      String name = kb.nextLine();
      int index = mylist.find(name);
      if(index != -1)
      {
         System.out.print("Enter the quantity");
         int q = kb.nextInt();
         System.out.print("Enter the price");
         double p = kb.nextDouble();
         item item = new item(name,q,p);
      }
   }
   public static void displayCost(GroceryList mylist,Scanner kb)
   {
      double cost = mylist.getTotalCost();
      System.out.print(cost);
   }
}