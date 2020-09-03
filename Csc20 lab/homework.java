
public class homework{

   public static void main(String[] agrs){
   int[] a = {2,5,11,14,15,27,31};
   mystery1(a,5);
   mystery2(a,5);
   System.out.println(mystery1(a,5));
   System.out.println(mystery2(a,5));
}
public static boolean mystery1(int[] array, int target){
for(int i = 0; i < array.length; i++){
if(array[i] == target)
return true;
else if(array[i] > target)
return false;
}
return false;
}
public static boolean mystery2(int[] array, int target){
int low = 0;
int high = array.length - 1;
while(low <= high){
int mid  = (low+high)/2;
if(array[mid]==target)
return true;
else if(array[mid] < target)
low = mid +1;
else 
high = mid - 1;
}
return false;
}
}