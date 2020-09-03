import java.util.*;
import java.io.*;

class Sorting {
static void bubbleSort(int[][] arr, int rows)
{
   int i;
   int j;
   for (i = 0;i < rows;i++)
   {
	   for (j = 0;j < rows - i - 1;j++)
	   {
		   if (arr[j][0] > arr[j + 1][0])
		   {
			   int temp = arr[j][0];
			   arr[j][0] = arr[j + 1][0];
			   arr[j + 1][0] = temp;
		   }
	   }
   }

}

static void selectionSort(int[][] arr, int rows)
{
   int i;
   int j;
   for (i = 0;i < rows;i++)
   {
	   int maxi = arr[i][1];
	   int pos = i;
	   for (j = i;j < rows;j++)
	   {
		   if (arr[j][1] > maxi)
		   {
			   maxi = arr[j][1];
			   pos = j;
		   }

	   }
	   int temp = arr[i][1];
	   arr[i][1] = arr[pos][1];
	   arr[pos][1] = temp;
   }
}

static void shellSort(int[][] arr, int rows)
{
   int diff = rows / 2;
   while (diff > 0)
   {
	   int i;
	   int j;
	   for (i = diff;i < rows;i++)
	   {
		   int t = arr[i][2];
		   j = i;
		   while (j >= diff && arr[j - diff][2] > t)
		   {
			   arr[j][2] = arr[j - diff][2];
			   j = j - diff;
		   }
		   arr[j][2] = t;
	   }
	   diff = diff / 2;
   }
}

static void insertionSort(int[][] arr, int rows)
{
   int i;
   int j;
   for (i = 0;i < 4;i++)
   {
	   j = i;
	   while (j > 0 && arr[4][j] < arr[4][j - 1])
	   {
		   int temp = arr[4][j];
		   arr[4][j] = arr[4][j - 1];
		   arr[4][j - 1] = temp;
		   j--;
	   }
   }
}

static void display(int[][] arr, int rows)
{

   int i;
   int j;
   for (i = 0;i < rows;i++)
   {
	   for (j = 0;j < 4;j++)
	   {
		   System.out.printf("%d ",arr[i][j]);
	   }
	   System.out.print("\n");
   }
}

static void displays(int[][] arr, int cols)
{

   int i;
   int j;
   for (i = 0;i < cols;i++)
   {
	   for (j = 0;j < 4;j++)
	   {
		   System.out.printf("%d ",arr[i][j]);
	   }
	   System.out.print("\n");
   }
}
static void reset(int[][] temp, int[][] arr, int rows)
{
   int i;
   int j;
   for (i = 0;i < rows;i++)
   {
	   for (j = 0;j < 4;j++)
	   {
		   arr[i][j] = temp[i][j];
	   }
   }
}

static int binSearch(int[][] arr, int rows, int start, int end, int num)
{
   int mid = (start + end) / 2;

   if (start > end)
   {
	   return -1;
   }

   if (arr[4][mid] == num)
   {
	   return mid;
   }
   else if (arr[4][mid] < num)
   {
	   return binSearch(arr, rows, mid + 1, end, num);
   }
   else
   {
	   return binSearch(arr, rows, start, mid - 1, num);
   }
}

//static static int Main()
public static void main(String[] agrs)
{
   int rows = 5;
   int cols = 4;
   int[][] arr =
   {
	   {5, 3, 2, 16},
	   {9, 8, 10, 17},
	   {4, 7, 11, 18},
	   {2, 5, 9, 12},
	   {7, 9, 4, 10}
   };
   int[][] temp = new int[5][4];

   int i;
   int j;
   for (i = 0;i < rows;i++)
   {
	   for (j = 0;j < cols;j++)
	   {
		   temp[i][j] = arr[i][j];
	   }
   }

   System.out.print("Bubble sort of column 1\n");
   bubbleSort(arr, 5);
   display(arr, 5);


   reset(temp, arr, 5);
   System.out.print("Selection sort of column 2\n");
   selectionSort(arr, 5);
   display(arr, 5);

   reset(temp, arr, 5);
   System.out.print("Shell sort of column 3\n");
   shellSort(arr, 5);
   display(arr, 5);

   reset(temp, arr, 5);
   System.out.print("insertion sort of row 5\n");
   insertionSort(arr, 5);
   display(arr, 5);

   int num;
   System.out.print("Enter a number to be searched in row 5\n");
  // String tempVar = ConsoleInput.scanfRead();
   Scanner tempvar = new Scanner(System.in);
    num = tempvar.nextInt();

   int res = binSearch(arr, 5, 0, cols - 1, num);
   if (res == -1)
   {
	   System.out.print("The number could not be found\n");
   }
   else
   {
	   System.out.printf("Number found at row 5 at column \n",res);
}

}
}