/* Shammah Thao
   09/08/2017 
   Csc15 Lab_1: Methods */
public class Lab_1 {
    public static void main(String[] agrs) {
      box();
   }
    
    public static void line() {
      System.out.println ("+---------+");
   }
      
    public static void top(){
      System.out.println ("|    *    |");
      System.out.println ("|   /*\\   |");
      System.out.println ("|  //*\\\\  |");
      System.out.println ("| ///*\\\\\\ |");
   }
      
    public static void bottom() {
      System.out.println ("| \\\\\\*/// |");
      System.out.println ("|  \\\\*//  |");
      System.out.println ("|   \\*/   |");
      System.out.println ("|    *    |");
   }
      
    public static void box() {
      line();
      top();
      bottom();
      line();
      bottom();
      top();
      line();
   }
}
    
    
