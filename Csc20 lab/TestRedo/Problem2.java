//Shammah Thao
//Problem 2 in the midterm Exam, to write 3 methods that take iteger typed 
//two-dimensioal array and return the follwing quantities
//3/31/2018

public class Problem2{

   int[][] myArray;
   
   public Problem2()
   {
      //intiatize myArray with the given
      //value provide from the given square above.
      myArray = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
   }
   //Sum all elements by rows
   public int sumAllElementsbyRows()
   {
      int sum = 0;
      for(int row = 0; row < myArray.length; row++)
      {
         for(int col = 0; col < myArray.length; col++)
         {         
            sum += myArray[row][col];
         }
      }
      return sum;
   }
   //Sum Reversed Diagonal Elements
   public int sumAllReverseDiag()
   { 
      int changesum = 0;
      for(int i = (myArray.length-1); i>= 0; i--)
      {
         changesum += myArray[i][i];
      }
      return changesum;
   }
   //Sum All elements by columns
   public int sumAllElementsbyColumns()
   {
     int sum = 0;
      for(int col = 0; col < myArray.length; col++)
      {
         for(int row = 0; row < myArray.length; row++)
         {
            sum += myArray[row][col];
         }
      }
      return sum;
   }
   public static void main(String[] args)
   {
     Problem2 myProblem2 = new Problem2();
     System.out.println("Sum by rows: " + myProblem2.sumAllElementsbyRows());
     System.out.println("Sum by columns: " + myProblem2.sumAllElementsbyColumns());
     System.out.println("Sum reversed diagonal elements: " + myProblem2.sumAllReverseDiag());
   }
}