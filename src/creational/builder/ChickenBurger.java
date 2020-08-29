package creational.builder;

public class ChickenBurger extends Burger {
   @Override
   public String getName() {
      return "Chicken Burger";
   }

   @Override
   public double getPrice() {
      return 20.77;
   }
}
