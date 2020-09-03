import java.io.*; 
import java.util.*;
  
class sum_of_digits 
{ 

    static int sum_of_digit(int n) 
    {  
        if (n == 0) 
            return 0; 
        return (n % 10 + sum_of_digit(n / 10)); 
    } 
  
    public static void main(String args[]) 
    { 
      System.out.println("Print out a 4 digit num.");
      Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        int result = sum_of_digit(num); 
        System.out.println(result); 
    } 
} 
