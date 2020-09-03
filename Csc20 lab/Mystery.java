public class Mystery{
   public static void main(String[] args)
   {
      System.out.println(mystery3(-479));
   }   
   
   public static int mystery3(int n)
   {
      if(n<0){
         return -mystery3(-n);
         }
      else if(n<10){
         return n;
         }
      else
         return mystery3(n/10 + n %10);
   }
}  