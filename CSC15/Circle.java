public class Circle
{
   private int x;
   private int y;
   private int radius;
   private static int count = 0;
   public Circle(int x, int y, int radius)
   {
      this.x = x;
      this.y = y;
      this.radius = radius;
      count++;
   }
   public static int setCount()
   {
      return count;
   }
   public void setRadius(int r)
   {
      this.radius = r;
   }
   public int getRadius()
   {
      return radius;
   }
   public boolean equals(Circle c)
   {
      return this.x == c.x && this.y == c.y && this.radius == c.radius;
   }
   public String toString()
   {
      String s = " ";
      s = ("(" + x + "," + y + "):" + radius);
      return s;
   }
   public void expand(int units)
   {
      this.radius = this.radius + units;
   }
   public double getArea()
   {
      return Math.PI * radius * radius;
   }
   public double getCircumference()
   {
      return 2 * Math.PI * radius;
   }
  public boolean inside(Circle other)
   {
      int x = this.x - other.x;
      int y = this.y - other.y;
      int inside = x + y;
      if(inside > 0 || inside == 0)
      {
         return true;
      }
      else return false;
   } 
}