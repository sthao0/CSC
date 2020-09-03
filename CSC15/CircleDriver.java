public class CircleDriver
{
   public static void main(String[] agrs)
   {
      Circle c1 = new Circle(1,2,5);
      Circle c2 = new Circle(5,7,15);
      c1.setRadius(10);
      c2.setRadius(20);
      int r = c1.getRadius();
      if(c1.equals(c2))
      {  
         System.out.print("Same");
      }
      System.out.println(c1);
      System.out.println(c1.toString());
      c1.expand(5);
      double area = c1.getArea();
      System.out.println("Area " + area);
      double circumference = c1.getCircumference();
      System.out.println("Circumference " + circumference);
      int count = Circle.setCount();
      System.out.println("number of circle " + count);
   }
}