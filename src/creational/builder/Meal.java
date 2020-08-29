package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
   private List<Item> items;

   public Meal() {
      items = new ArrayList<>();
   }

   public void addItem(Item item) {
      items.add(item);
   }

   public double getTotalCost() {
      double totalCost = items.
         stream().
         mapToDouble(i -> i.getPrice()).
         sum();

      return totalCost;
   }

   public void showItems() {
      items.forEach(i -> {
         System.out.printf("Item: %s, Packing: %s\n", i.getName(), i.getPacking().pack());
      });
   }
}
