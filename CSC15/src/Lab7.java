import java.util.*;

public class Lab7
{
   public static void main(String[] agrs)
   {
     Scanner kb = new Scanner(System.in); 
     System.out.print("Enter the number of the students: ");
     int[] students = new int[kb.nextInt()];
     String[] grades = new String[students.length];
     fillArray(students,kb);
     getGrades(students,grades);
     System.out.print("Do you use this program again? ");
     String repeat = " ";
     while(repeat != "yes" || repeat!= "no")
     {
         repeat = kb.nextLine();
         if( repeat.equalsIgnoreCase("yes"))
         {
             System.out.print("\nEnter the number of the students: ");
             students = new int[kb.nextInt()];
             grades = new String[students.length];
             fillArray(students,kb);
             getGrades(students,grades);
             System.out.print("Do you use this program again? ");
         }
         else if(repeat.equalsIgnoreCase("no"))
         {
            break;
         }
     }

   }
   public static void fillArray(int[] students, Scanner kb)
   {
      System.out.print("\nEnter " + students.length + " students: ");
		for (int i = 0; i < students.length; i++) 
      {
			students[i] = kb.nextInt();
		}
   }
   public static int findMaxGrade(int[] array) 
    {    
       int max = array[0];
       for(int i = 1; i < array.length; i++)
       {
         if(array[i] > max)
         {
            max = array[i];
         }
       }
       return max; 
    }
	public static void getGrades(int[] students, String[] grades) {
		int best = findMaxGrade(students);
		for (int i = 0; i < students.length; i++) 
      {
			if (students[i] >= best - 10)
         {
				grades[i] = "A";
          }
			else if (students[i] >= best - 20)
         {
				grades[i] = "B";
         }
			else if (students[i] >= best - 30)
         {
				grades[i] = "C";
         }
			else if (students[i] >= best - 40)
         {
				grades[i] = "D";
         }
			else
         {
				grades[i] = "F";
         }
		}
       System.out.println("\nHere is the result: ");
       System.out.println("\nStudent\tScore\tGrade");
       for(int i = 0; i < grades.length; i++)
       {
         System.out.println("\t\t" + (i + 1) + "\t\t" + students[i] + "\t\t" + grades[i]); 
       }   
    } 
}