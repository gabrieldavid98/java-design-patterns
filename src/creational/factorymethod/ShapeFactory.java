package creational.factorymethod;

public class ShapeFactory {
   public Shape createShape(Shapes shapes) {
      switch (shapes) {
         case Circle:
            return new Circle();
         case Square:
            return new Square();
         case Rectangle:
            return new Rectangle();
         default:
            return null;
      }
   }
}
