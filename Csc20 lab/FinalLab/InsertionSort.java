public class InsertionSort
{
public static void main(String[] args)
{
int[] A = new int[] { 54, 26, 93, 17, 77, 31, 44, 55, 91 };
System.out.println("Original order: ");
for (int i = 0; i < A.length; i++)
System.out.print(A[i] + " ");
System.out.println("\n");
insertionSort(A);
System.out.println("After sorting: ");
for (int i = 0; i < A.length; i++)
System.out.print(A[i] + " ");
}
private static void insertionSort(int[] A)
{
int N = A.length;
int total = 0;
for (int index = 1; index <= N - 1; index++)
{
           System.out.println("Before comparing");  

int unSortedValue = A[index];
int scan = index;
int count = 1;
while (scan > 0 && A[scan -1] > unSortedValue)
{
           System.out.println("Swapping");  

A[scan] = A[scan - 1];
scan--;
if (scan > 0)
count += 1;
}
total += count;
A[scan] = unSortedValue;
System.out.println("-------------"); 
}
int test = 0; 
}
}
