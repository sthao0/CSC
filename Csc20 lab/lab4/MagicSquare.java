// ****************************************************************
// MagicSquare.java
//Shammah Thao
// Csc20
// 2/21/2018
// Description: this program is a magic square, which is a square of random number.
// ****************************************************************
import java.util.Scanner;
public class MagicSquare { 

    int[][] square;

    public MagicSquare(int size)
    {
      square = new int[size][size];
    }
//--------------------------------------
//return the sum of the values in the given row
//--------------------------------------
 
    private int sumMagicRow(int row)
    {
      int changesum = 0;
      for(int col = 0; col < square.length; col++)
      {
         changesum += square[row][col];
      }
      return changesum;
    }
//--------------------------------------
//return the sum of the values in the given column
//--------------------------------------
 
    private int sumMagicCol(int col)
    {
      int changesum = 0;
      for(int row = 0; row < square.length; row++)
      {
         changesum += square[row][col];
      }
      return changesum;
    }
//--------------------------------------
//return the sum of the values in the main diagonal
//--------------------------------------
 
    private int sumMagicDiagMain()
    {
      int sum = 0;
      for(int i = 0; i < square.length; i++)
      {
         sum += square[i][i];
      }
      return sum;
    }
//--------------------------------------
//return the sum of the values in the other ("reverse") diagonal
//--------------------------------------
 
    private int sumMagicDiagRev()
    {
      int sum = 0;
      for(int i = (square.length-1); i>= 0; i--)
      {
         sum += square[i][i];
      }
      return sum;
    }
//--------------------------------------
//return true if the square is magic (all rows, cols, and diags
// have same sum) false otherwise
//-------------------------------------- 
    public boolean isMagicSquare()
    {
       boolean answer = true;
       int sum = 0;
       int sum1 = 0;
       for(int row = 0; row <square.length; row++)
       {
       sum = sumMagicRow(row);
       }
       for(int col = 0; col<square.length; col++)
       {
         sum1= sumMagicCol(col);
       }
       int sumMain = sumMagicDiagMain();
       int sumRev = sumMagicDiagRev();
       if(sum != sum1 || sum1 != sumMain || sumMain != sumRev)
       {
         return false;
       }
       return answer;
    }
//--------------------------------------
//compute and display sums of square including row, column, main diagonal, and other diagonal
//--------------------------------------
    public void printMagicSquareSums()
    {
      int sum = 0;
      //row
      for(int row = 0; row < square.length; row++)
      {
         sum = sumMagicRow(row);
         System.out.print("\nSum of row "+row+" is : " +sum);
      }
      System.out.println();
      
      sum = 0;
      //colums
      for(int col = 0; col<square.length;col++)
      {
         sum = sumMagicCol(col);
         System.out.print("\nSum of colums "+col+" is : " +sum);
      }
      System.out.println();
      
      //diagonals
      int sumDiagM = sumMagicDiagMain();
      System.out.print("\nSum of main diagonal is: " +sumDiagM);
      int sumDiagR = sumMagicDiagRev();
      System.out.print("\nSum of other diagonal is: " + sumDiagR);
      System.out.println("\n");
    }

//--------------------------------------
//read info into the square from the input stream associated with
//the Scanner parameter
//--------------------------------------
    public void readSquare(Scanner scan)
    {
        for (int row = 0; row < square.length; row++)
        {
           for (int col = 0; col < square.length; col++)
           {
              square[row][col] = scan.nextInt();
           }
        }
    }
//--------------------------------------
//print the contents of the square, neatly formatted
//--------------------------------------
    public void printSquare()
    {
      for(int row = 0; row < square.length; row++)
      {
         System.out.println();
         for(int col = 0; col < square.length; col++)
         {
            System.out.printf("%3d",square[row][col]);
         }
      }
    }          
}