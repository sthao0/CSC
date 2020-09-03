public class finalPrelab{
   public static void main(String[] agrs){
   Green var1 = new Blue();
   Green var2 = new Red();
   Blue var3 = new Yellow();
   Object var4 = new Green();
   var1.one();
 //  var1.two();    driver.java:8: error: cannot find symbol
   var1.three();
   var2.one();
 //  var2.two();    driver.java:11: error: cannot find symbol
   var2.three();
 //  var3.two();   driver.java:13: error: cannot find symbol
   var3.three();
 //  var4.one();   driver.java:15: error: cannot find symbol
  ((Blue)var1).one();
 //  ((Yellow)var1).two(); Exception in thread "main" java.lang.ClassCastException: Blue cannot be cast to Yellow
   ((Red)var2).three();
   ((Yellow)var2).two();
   ((Green)var4).three();
  // ((Yellow)var4).two(); Exception in thread "main" java.lang.ClassCastException: Green cannot be cast to Yellow
   }
}
   class Blue extends Green{
      public void one(){
         System.out.println("Blue 1");
         super.one();
      }
   }
   class Red extends Yellow{
      public void one() {
         super.one();
         System.out.println("Red 1");
      }
      public void two(){
         System.out.println("Red 2");
         super.two();
      }
   }
  
   class Yellow extends Blue{
      public void two(){
         System.out.println("Yellow 2");
         }
      public void three() {
         two();
         System.out.println("Yellow 3");
         }
   }
   class Green {
      public void one() {
      System.out.println("Green 1");
      }
      public void three(){
      System.out.println("Green 3");
      }
   }