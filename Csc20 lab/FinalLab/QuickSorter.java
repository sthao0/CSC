import java.util.*;
import java.util.Arrays;
public class QuickSorter
{
public static void quickSort(int array[])
{
doQuickSort(array, 0, array.length - 1);
}
private static void doQuickSort(int array[], int start, int end)
{
int pivotPoint;
if (start < end)
{
int beforePivotPoint[] = Arrays.copyOfRange(array, start, end+1);
System.out.println(Arrays.toString( beforePivotPoint ) );
pivotPoint = partition(array, start, end);
System.out.println("Pivot Point " + array[pivotPoint] );
doQuickSort(array, start, pivotPoint - 1);
doQuickSort(array, pivotPoint + 1, end);
}
}
private static int partition(int A[], int start, int end)
{
int pivotValue = A[start];
int endOfLeftList = start;
for (int scan = start + 1; scan <= end; scan ++)
{
           System.out.println("Before comparing");  
if (A[scan] < pivotValue)
{
endOfLeftList ++;
                System.out.println("Swapping");  
swap(A, endOfLeftList, scan);
}
System.out.println("----------------------");
}
swap(A, start, endOfLeftList);
System.out.println("Eoll: " + endOfLeftList);
return endOfLeftList;
}
private static void swap(int[] A, int a, int b)
{
int temp;
temp = A[a];
A[a] = A[b];
A[b] = temp;
}

    public static void main(String a[]){    
        int[] arr1 = {54,25,93,17,77,31,44,55,22};    
        System.out.println("Before Quick Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        quickSort(arr1);//sorting array using insertion sort    
           
        System.out.println("After Quick Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
    }    



}
