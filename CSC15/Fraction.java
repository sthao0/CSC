public class Fraction
{
   private int deno;
   private int nevo;
   public Fraction(int nevo, int deno)
   {
      setDeno(deno);
      this.nevo = nevo;
   }
   public void setDeno(int newDeno)
   {
      if(newDeno != 0)
      {
         deno = newDeno;
      }
   }
   public void setNevo(int newNevo)
   {
      nevo = newNevo;
   }
   public int getDeno()
   {
      return deno;
   }
   public int getNevo()
   {
      return nevo;
   }
   private int gcd()
   {
      int max = Math.min(this.nevo,this.deno);
      while((nevo%max != 0) || (deno % max != 0))
      {
         max--;
      }
      return max;
   }
   public Fraction simplify()
   {
      int g = gcd();
      int n = nevo/g;
      int d = deno/g;
      Fraction f = new Fraction(n,d);
      return f;
   }
   public Fraction add(Fraction f)
   {
      int d = this.deno * f.deno;
      int n = (this.nevo * f.deno) + (this.deno * f.nevo);
      Fraction f1 = new Fraction(n,d);
      f1 = f1.simplify();
      return f1;
   }
   public Fraction subtract(Fraction f)
   {
	   int d = this.deno * f.deno;
	   int n = (this.nevo * f.nevo) - (this.deno * f.nevo);
	   Fraction f1 = new Fraction(n,d);
	   f1 = f1.simplify();
	   return f1;
   }
   public Fraction multiple(Fraction f)
   {
	   int d = this.deno * f.deno;
	   int n = this.nevo * f.nevo;
	   Fraction f1 = new Fraction(n,d);
	   f1 = f1.simplify();
	   return f1;
   }
   public Fraction divide(Fraction f)
   {
	  int d = this.deno * f.nevo;
	  int n = this.nevo * f.deno;
	  Fraction f1 = new Fraction(n,d);
	  f1 = f1.simplify();
	  return f1;
   }
   public boolean equals(Fraction f)
   {
      Fraction f1 = this.subtract(f);
      return f1.nevo == 0;
   }
   public String toString()
   {
      String s = (nevo + "/" + deno);
      return s;
   }
}      