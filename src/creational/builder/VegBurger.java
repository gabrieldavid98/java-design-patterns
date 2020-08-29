package creational.builder;

public class VegBurger extends Burger {
   @Override
   public String getName() {
      return "Veg Burger";
   }

   @Override
   public double getPrice() {
      return 10.7;
   }
}
