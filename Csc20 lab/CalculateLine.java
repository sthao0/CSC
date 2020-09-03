import java.util.*;

public class CalculateLine{

   public static void main(String[] agrs)
   {
      Scanner kb = new Scanner(System.in);
      System.out.println("This program calculates y coordinates for a line.");
      System.out.print("Enter slope (m): ");
      int m = kb.nextInt();
      kb.nextLine();
      System.out.print("Enter the intercept (b): ");
      int b = kb.nextInt();
      kb.nextLine();
      System.out.print("Enter x: ");
      int x = kb.nextInt();
      kb.nextLine();
      int y = m*x+b;
      System.out.println("f(" + x + ") = " + y);
      while(x != -1)
      {
        System.out.print("Enter x: ");
        x = kb.nextInt();
        if(x == -1)
        {
            break;
        }
        kb.nextLine();
        y = m*x+b;
        System.out.println("f(" + x + ") = " + y);
      }
   }
}