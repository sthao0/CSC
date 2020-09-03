// ****************************************************************
// MagicSquareTest.java
//
// Text below is to be filled by student. 
//
// ****************************************************************
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
 
public class MagicSquareTest
{
     public static void main(String[] args) throws IOException
     {
      Scanner scan = new Scanner(new File("magicText.txt"));
 
 
      // make sure that the file magicData is in the current directory
      int count = 1; //count which square we're on
      int size = scan.nextInt(); //size of next square
 
      //Expecting -1 at bottom of input file
      while (size != -1)
      {
 
         //create a new Square of the given size 
         MagicSquare s = new MagicSquare(size);
       
         //call its read method to read the values of the square
         System.out.print("\n***** Square " + count + " *****");
         s.readSquare(scan);
        
         //print the square 
         s.printSquare();

         //print the square id
         System.out.println("\n***** Square " + count + " *****");
          

         //print the sums
          s.printMagicSquareSums();         
          
          //determine and print whether it is a magic square
          System.out.print("Is it a magic square: " );
          if(s.isMagicSquare() == true)
          {
            System.out.print("true");
          }
          else System.out.print("false");
          System.out.println();
         //get size of next square
         size = scan.nextInt();
         count++;
     }
   }
}