/*
Shammah Thao
Final Project
Trying to compare all student score from document, and finding the lowest
and high score then trying to find the average.
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class Final{

   // Labs are = hw assingments
   static Student[] Stud;
   //Statistics StudStats;
   final static int NUM_LABS = 5;
   final static String FileName = "Final1.txt";
   
   public static void convertToStud(String readFile){
      //BufferedReader buff = new BufferedReader(readFile);
      String check = "";
      System.out.println(check);
      while(check!= null){
      
      }
      return ;
   }
   
   // STUDENT CLASS
   class Student extends Final{
      private int ID;
      private int scores[] = new int[NUM_LABS];
      
      public Student(int newId, int[] newScores){
         ID = newId;
         scores = newScores;
      }
      public int getID() {
         return ID;
      }
      public void setID(int newID){
         ID = newID;
      }
      public String getScore(){
         return scores.toString();
      }
      public int getScore(int index){
         return scores[index];
      }
      public void setScores(int[] newScores){
         scores = newScores;
      }
      public String toString(){
         String tempString = ""+scores[0];
         for(int i = 1; i < NUM_LABS;i++){
            tempString += " "+Integer.toString(scores[i]);
         }
         return tempString+"";
      }
   }
   
   // Statistics 
   class Statistics{
      private int[] lowScores = new int[NUM_LABS];
      private int[] highScores = new int[NUM_LABS];
      private double[] avgScores = new double[NUM_LABS];
      
      void calculateLow(Student[] A){
      // finds lowest scores on each lab
         for(int lab = 0; lab <NUM_LABS;lab++){
            lowScores[lab] = A[0].getScore(lab);
            for(int stu = 1;stu<A.length;stu++){
               if(lowScores[lab] > A[stu].getScore(lab))
                  lowScores[lab] = A[stu].getScore(lab);
            }
         } 
         System.out.println("Low Scores:   "+Arrays.toString(lowScores));
      }
      void calculateHigh(Student[] A){
         // finds highest scores on each lab
         for(int lab = 0; lab <NUM_LABS;lab++){
            highScores[lab] = A[0].getScore(lab);
            for(int stu = 1;stu<A.length;stu++){
               if(highScores[lab] < A[stu].getScore(lab))
                  highScores[lab] = A[stu].getScore(lab);
            }
         }
         System.out.println("High Scores:  "+Arrays.toString(highScores));
      }
      void calculateAvg(Student[] A){
         // finds avg scores on each lab
         for(int lab = 0; lab <NUM_LABS;lab++){
            avgScores[lab] = 0;
            for(int stu = 0;stu<A.length;stu++){
                avgScores[lab] = avgScores[lab]+A[stu].getScore(lab);
            }
            double a = avgScores[lab]/A.length;
//System.out.println("a: "+a+"b: "+b+"c: "+c);
            avgScores[lab] = a;
         }
         System.out.print("Average Scores: ");
         System.out.printf("%.2f",avgScores[0]);
         for(int i = 1;i<NUM_LABS;i++)
         System.out.printf(" %.2f",avgScores[i]);
         System.out.print("");
      }
   }
   // converts read file into student array
   public void studDec(int[] tokens, int students){  
      Student[] Stud = new Student[students];
      int ct = 0;
      for(int studI = 0;studI<students;studI++){
         int[] newScores = new int[NUM_LABS];
         for(int scoreI = 0;scoreI<NUM_LABS;scoreI++){
            int temp = scoreI+(studI*(NUM_LABS+1))+1;
            newScores[scoreI] = tokens[temp];
         }  
         Student newStud = new Student(tokens[studI*6],newScores);
         Stud[studI] = newStud;
         this.Stud = Stud;     
      }
   }
   // FILE READER
   // reads file and converts into student array
   public void readFile(String fileName) throws IOException{
      try{
         String readFile = "";
         FileReader file = new FileReader(fileName);
         BufferedReader buff = new BufferedReader(file);
         String read;
         buff.readLine();
         read = buff.readLine();
         int count = 0;        
         while(read !=null) {
            count++;
            readFile += " "+read;
            read = buff.readLine();
            
         }
         buff.close();
         
         // prepares for converstion to student class
         String[] tokensS = readFile.split(" ");
         int tokenLength = tokensS.length-1;
         int[] tokensI = new int[tokenLength];
         for(int tokenIndex = 0; tokenIndex<tokenLength;tokenIndex++){
            tokensI[tokenIndex] = Integer.parseInt(tokensS[tokenIndex+1]);
         }
         studDec(tokensI,count);
      } catch (IOException e) {
         System.out.println("Error "+e.toString());
      }
   }
   public static void main(String[]args) throws IOException{
      Final score  = new Final();
      Statistics StudStats =  score.new Stati
      stics();
      try{
         // reads file and converts to student array in a nested method
         score.readFile(FileName);
      } catch (IOException e) {
         System.out.println("Error "+e.toString());
      }
      System.out.print("Stud L1 L2 L3 L4 L5");
      for(int i= 0;i<Stud.length;i++)
         System.out.printf(", \n %2d: %s",(i+1),Stud[i]);

      System.out.print("\n");
         StudStats.calculateLow(score.Stud);
         StudStats.calculateHigh(score.Stud);
         StudStats.calculateAvg(score.Stud);
   }
}