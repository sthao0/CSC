public class SpeciesDriver
{
   public static void main(String[] agrs)
   {
      Species s1 = new Species(" " , 0, 0);
      System.out.println(s1.toString());
      Species s2 = new Species("Rabbit", 6750, 1.05);
      System.out.println(s2.toString());
      Species s3 = new Species("Polar Bear", 550, -.02);
      System.out.println(s3.toString());
      Species s4 = new Species("Rabbit", 6750, 1.05);
      System.out.println(s4.toString());
      System.out.println("Species: " + s3.getName());
      System.out.println("Population: " + s3.getPopulation());
      System.out.println("Growth rate: " + s3.getGrowthRate());
      System.out.println("Number of species is " + Species.getSpeciesCount());
      System.out.println("Number of endangered species is " + Species.getEndangeredCount());
      System.out.println(Species.getPercentEndangered() + "% of species are endangered");
      s1.setName("Horse");
      System.out.println("Species : " + s1.toString());
      s3.setGrowthRate(.05);
      System.out.println("Number of endangered species is " + Species.getEndangeredCount() + "\n");
      if(s2.equals(s4))
      {
         System.out.println("S2 and s4 are equal");
      }
      else
      {
         System.out.println("S2 and s4 are not equals");
      } 
      if(s2.equals(s3))
      {
         System.out.println("S2 and s3 are equal");
      }
      else
      {
         System.out.println("S2 and s3 are not equals");
      } 
   }
}