public class InsertionSortExample {  
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) { 
           System.out.println("Before comparing");  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {
                System.out.println("Swapping");  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
           System.out.println("---------------");
        }  
    }  
       
    public static void main(String a[]){    
        int[] arr1 = {54,25,93,17,77,31,44,55,22};    
        System.out.println("Before Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr1);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
    }    
}    