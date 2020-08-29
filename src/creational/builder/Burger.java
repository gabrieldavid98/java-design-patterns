package creational.builder;

public abstract class Burger implements Item {
   public Packing getPacking() {
      return new Wrapper();
   }
}
