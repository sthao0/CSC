import java.util.*;
public class FractionDriver
{
   public static void main(String[] args)
   {
      Fraction[] fraction = new Fraction[2];
      fillArray(fraction);
      System.out.print(fraction);
      math(fraction);
   }
   public static void fillArray(Fraction[] f)
   {
      Scanner kb = new Scanner(System.in);
      for(int i = 0; i < f.length; i++)
      {
         System.out.println("Fraction " + (i+1));
         System.out.print("Enter the deno: ");
         int d = kb.nextInt();
         System.out.print("Enter the nevo: ");
         int n = kb.nextInt();
         Fraction f1 = new Fraction(n,d);
         f[i] = f1;
      }
   }
   public static void print(Fraction[] f)
   {
      for(int i = 0; i < f.length; i++)
      {
         System.out.println(f[i].toString());
      }
   }
   public static void math(Fraction[] f)
   {
      Fraction f1 = f[0].add(f[1]); // do this 4x with the other math classes, change add
      System.out.println(f[0] + "+" + f[1] + "=" + f1);
      Fraction f2 = f[0].simplify();
      System.out.print(f2 + "=" + f[0]);
      boolean result = f[2].equals(f[3]);
      if(result)
      {
         System.out.print(f[2] + "=" + f[3]);
      }
      else System.out.print(f[2] + "=" + f[3]);
   }
}