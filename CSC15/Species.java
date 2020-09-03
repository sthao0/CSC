public class Species
{
   private static int speciesCount = 0;
   private static int endangeredCount = 0;
   private String name;
   private int population;
   private double growthRate;
   public  Species()
   {
      String name = " ";
      int population = 0;
      int growthRate = 0;
      speciesCount++;
   }
   public Species(String initName, int initPopulation,double initGrowthRate)
   {
      this.name = initName;
      setPopulation(initPopulation);
      this.growthRate = initGrowthRate;
      speciesCount++;
      if(growthRate < 0)
      {
         endangeredCount++;
      }
   }
   public void setName(String newName)
   {
      name = newName;
   }
   public boolean setPopulation(int newPopulation)
   {
      if(newPopulation >= 0)
      {
         population = newPopulation;
         return true;
      }
      else return false;
   }
   public double setGrowthRate(double newGrowthRate)
   {
      if(newGrowthRate > 0 && growthRate < 0)
      {
         endangeredCount--;
      }
      else if(newGrowthRate < 0 && growthRate > 0)
      {
         endangeredCount++;
      }
      growthRate = newGrowthRate;
      return growthRate;
   }
   public String getName()
   {
      return name;
   }
   public int getPopulation()
   {
      return population;
   }
   public double getGrowthRate()
   {
      return growthRate;
   }
   public static int getSpeciesCount()
   {
      return speciesCount;
   }
   public static int getEndangeredCount()
   {
      return endangeredCount;
   }
   public static double getPercentEndangered()
   {
      double percent = ((double)endangeredCount/speciesCount) * 100;
      return percent;
   }
   public boolean endangered()
   {
      if(growthRate < 0)
      {
         return true;
      }
      else return false;
   }
   public boolean equals(Species otherSpecies)
   {
      return this.name.equalsIgnoreCase(otherSpecies.name) && this.population == otherSpecies.population && this.growthRate == otherSpecies.growthRate;
   }
   public String toString()
   {
      String s = " ";
      s = ("Species: " + name + ", Population: " + population + ", GrowthRate: " +  (growthRate * 100) + "%");
      return s;
   }
}