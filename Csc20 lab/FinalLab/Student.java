class Student
{
   private int SID;
   private int scores[] = new int[NUMBER_OF_CSC20_LABS];
   //write public getter and setter methods for
   //SID and scores
   //add methods to print values of instance variables.
}
class Statistics
{
   private int [] lowscores = new int [NUMBER_OF_CSC20_LABS];   
   private int [] highscores = new int [NUMBER_OF_CSC20_LABS]; 
   private float [] avgscores = new float [NUMBER_OF_CSC20_LABS];

void calculateLow(Student [] a)
{
// This method will find lowest score and store it in an array names lowscores
   lowscores = a[0];
   for(int i = 1; i <= a.length;i++)
   {
      if(a[i] < lowsscore)
      {
         lowsscore = inputArray[i];
      }
   }
   return lowsscore;
}

void calculateHigh(Student [] a)
{
// This method will find highest score and store it in an array names highscores
   highscores = a[0];
   for(int i = 1; i <= a.length;i++)
   {
      if(a[i] > highscores)
      {
         highscores = a[i];
      }
   }
   return highscores;
}
void calculateAvg(Student [] a)
{
// This method will find avg score for each lab and store it in an array named avgscores
}
// add methods to print values of instance variables.
}
class Util
{
   public static Student[] readFile(String fileName) throwsIOException
   {
      //Reads the file and builds student array.
      //Open the file using FileReader Object.
      //In a loop read a line using readLine method.
      //Tokenize each line using StringTokenizer Object
      //Each token is converted from String to Integer using parseInt method
      //Value is then saved in the right property of Student Object.
   }

}
Putting it all together:
public static void main(String [] args)
{
   Student[] studArr = Util.readFile("studentData.txt");
   Statistics stat = new Statistics(); 
   stat.calculateLow(studArr);
   // add calls for the high and average values
   // Print the data and statistics, etc.
}
Additional materials:
Working with Text files:
// ReadSource.java shows how to work with readLine and FileReader 
public class ReadSource
{
   public static void main(String[] arguments)
   {
      try
     {
         FileReader file = new FileReader("ReadSource.java"); 
         BufferedReader buff = new BufferedReader(file); 
         String line;
         line = buff.readLine(); 
         while (line != null)
      {
         System.out.println(line); 
         line = buff.readLine();
      }
      buff.close();
     
     }
      catch (IOException e)
      {
         System.out.println("Error " + e.toString());
      }
   }
}