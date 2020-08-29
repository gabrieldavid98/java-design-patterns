package creational.factorymethod;

public class Main {
   public static void main(String[] args) {
      final ShapeFactory shapeFactory = new ShapeFactory();

      Shape shape = shapeFactory.createShape(Shapes.Circle);
      shape.draw();

      shape = shapeFactory.createShape(Shapes.Square);
      shape.draw();

      shape = shapeFactory.createShape(Shapes.Rectangle);
      shape.draw();
   }
}
