package creational.abstractfactory;

public class ShapeFactory implements GeometricFactory {
   public Shape createShape(Shapes shapes) throws InvalidShapeException {
      switch (shapes) {
         case SQUARE:
            return new Square();
         case RECTANGLE:
            return new Rectangle();
         default:
            throw new InvalidShapeException();
      }
   }
}
