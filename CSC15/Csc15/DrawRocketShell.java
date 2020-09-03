public class DrawRocketShell 
{
   public static final int SUB_HEIGHT = 13;
   
   public static void main(String[] agrs) 
   {
      All();
   }
   public static void All() 
   {
      drawCone();
      drawLine();
      drawHalf1();
      drawHalf2();
      drawLine();
      drawHalf2();
      drawHalf1();
      drawLine();
      drawCone();
   }
      
   public static void drawCone()
   {
      for(int line = 1; line <= ((SUB_HEIGHT * 2) - 1); line++) 
      {
         for(int space = 1; space <=((SUB_HEIGHT * 2 - 1) - (line - 1) ); space++)
         {
            System.out.print(" ");
         }
         for(int slash = 1; slash <= line; slash++)
         {
            System.out.print("/");
         }
         System.out.print("**");
         for(int bs = 1; bs <= line; bs++)
         {
            System.out.print("\\");
         }
         System.out.println();
      }
   }

   public static void drawLine()
   {
      System.out.print("+");
      for(int line = 1; line <= 1; line++) 
      {
         for(int space = 1; space <= (SUB_HEIGHT * 2); space++)
         {
            System.out.print("=*");
         }
         System.out.println("+");
       
      }
   }

   public static void drawHalf1()
   {
      for(int line = 1; line <= SUB_HEIGHT; line++)
      {
         System.out.print("|");
         for(int dot = 1; dot <= (SUB_HEIGHT - 1) - (line - 1); dot++)
         {
            System.out.print(".");
         }
         for (int slash = 1; slash <= line; slash++)
         {
            System.out.print("/\\");
         }
         for(int dot = 1; dot <= ((SUB_HEIGHT + (SUB_HEIGHT - 2) - line) - (line - 2)); dot++)
         {
            System.out.print(".");
         }
         for( int slash = 1; slash <= line; slash++)
         {
            System.out.print("/\\");
         }
         for(int dot = 1; dot <= (SUB_HEIGHT - 1) - (line - 1); dot++)
         {
            System.out.print(".");
         }
         System.out.println("|");
      }
   }

   public static void drawHalf2()
   {
      for(int line = 1; line <= SUB_HEIGHT; line++)
      {
         System.out.print("|");
         for(int dot = 1; dot <= (line  + 1) - 2; dot++)
         {
            System.out.print(".");
         }
         for(int slash = 1; slash <= (SUB_HEIGHT - line + 1); slash++)
         { 
            System.out.print("\\/");
         }
         for(int dot = 1; dot <= (2 * (line - 1)); dot++)
         {
            System.out.print(".");
         }
         for(int slash = 1; slash <= (SUB_HEIGHT + 1 - line); slash++)
         {
            System.out.print("\\/");
         }
         for(int dot = 1; dot <= (line - 1); dot++)
         {
            System.out.print(".");
         }
         System.out.println("|");
      }     
   }
}