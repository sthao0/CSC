public class GroceryList
{
   private item[] items;
   private int count;
   public GroceryList()
   {
      items = new item[50];
      count+=0;
   }
   public item[] getList()
   {
      return items;
   }
   public void add(item newitem)
   {
     items[count] = newitem;
     count++; 
   }
   public boolean remove(item olditem)
   {
      for(int i=0; i < count; i++)
      {
         if(items[i] != null)
         {
            if(items[i].equals(olditem))
            {
               items[i]=null;
            }
         }
      }
      return false;  
   }
   public double getTotalCost()
   {
      double cost = 0;
      for(int i = 0; i < count; i++)
      {
         if(items[i] != null)
         {
            cost = cost + items[i].getTotalCost();
         }
      }
      return cost;
   }
   public int find(String name)
   {
      int index = 1;
      for(int i = 0; i < count; i++)
      {
         if(items[i].getName().equalsIgnoreCase(name))
         {
            index = i;
         }
      }
      return index;
   }
   public String toString()
   {
      String s = " ";
      for(int i = 0; i < count; i++)
      {
         if(items[i] != null)
         {
            s = s + items[i].toString() + "\n";
         }
      }
      return s;
   }
}