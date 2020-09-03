import java.util.Arrays;
public class reverseElements
{
   public static void reverse(double[] a)
   {
      double[] b = new double[a.length];
      for(int i=a.length-1, indexForB = 0; i >=0; i--,indexForB++)
      {
         b[indexForB]=a[i];
      }
      a = b;
   }
   public static void main(String[] agrs)
   {
      double[] a = {1.1,5.3,3.4,8.9,0.0,1.3,5.2,7.8,9.9};
      System.out.println("initial array = " + Arrays.toString(a));
      reverse(a);
      System.out.println("reversed array = " + Arrays.toString(a));
   }
}