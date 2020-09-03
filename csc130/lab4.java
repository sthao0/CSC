import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class lab4 {
   public static void main(String[]args) throws FileNotFoundException
   {
      Queue<Integer> Q=new LinkedList<>();
      String Filename="C:\\Users\\shamm\\Documents\\CSC\\csc130\\lab 4 numlist";
      Scanner Reader=new Scanner(new File(Filename));
      while(Reader.hasNext())
      {
         Q.add(Integer.parseInt(Reader.next()));
      }
      Iterator<Integer> ite = Q.iterator();
      while(ite.hasNext())
      {
         int value=ite.next();
         if(value<0)
         ite.remove();
      }
      for(Integer item:Q)
      {
         System.out.print(item +" ");
      }
   }
}