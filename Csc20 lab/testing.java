public class testing{
   public static void main(String[] agrs){
   one var1 = new two();
   one var2 = new three();
   one var3 = new four();
   three var4 = new four();
   Object var5 = new three();
   Object var6 = new one();
  // var1.method1();
  //var2.method1();
 // var3.method1();
 // var4.method1();
 // var5.method1(); doesnt work
  //var6.method1(); doesnt work
//  var4.method2();
 // var4.method3(); doesnt work
 // ((two)var1).method2(); doesnt work
 //((three)var1).method2(); doesnt work
 //((two)var1).method3();
 //((four)var2).method1(); deosnt work
 //((four)var3).method1();
// ((four)var4).method3();
  // ((one)var5).method1(); d.w
  //((three)var5).method2();
 ((two)var6).method3();
   }
}
class one{
   public void method1(){
      System.out.println("One1");
      }
   }
class two extends one{
   public void method3(){
      System.out.println("Two3");
      }
   }
 class three extends one {
   public void method2() {
      System.out.println("Three2");
      method1();
      }
    }
class four extends three {
   public void method1() {
      System.out.println("four1");
      super.method1();
      }
      public void method3() {
         System.out.println("four3");
      }
  }