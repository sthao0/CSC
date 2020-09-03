public class item
{
   private String name;
   private int quantity;
   private double pricePerUnit;
   public item(String name, int quantity, double pricePerUnit)
   {
      name = " ";
      quantity = 0;
      pricePerUnit = 0.0;
   }
   public String getName()
   {
      return name;
   }
   public int getQuantity()
   {
      return quantity;
   }
   public double getPricePerUnit()
   {
      return pricePerUnit;
   }
   public double getTotalCost()
   {
      double total = (pricePerUnit * quantity);
      return total;
   }
   public void setQuantity(int newQuantity)
   {
      quantity = newQuantity;
   }
   public void setPricePerUnit(int newPrice)
   {
      pricePerUnit = newPrice;
   }
   public String setName(String newName)
   {
      name = newName;
      return name;
   }
   public boolean equals(item other)
   {
      return this.name.equalsIgnoreCase(other.name) && this.quantity == other.quantity && this.pricePerUnit == other.pricePerUnit;
   }
   public String toString()
   {
      String s = " ";
      s = ("Name: " + name + " quantity: " + quantity + " Price Per Unit: " + pricePerUnit + " Price " + getTotalCost());
      return s;
   }
}