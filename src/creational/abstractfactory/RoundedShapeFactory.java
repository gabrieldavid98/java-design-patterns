package creational.abstractfactory;

public class RoundedShapeFactory implements GeometricFactory {
   public Shape createShape(Shapes shapes) throws InvalidShapeException {
      switch (shapes) {
         case ROUNDED_SQUARE:
            return new RoundedSquare();
         case ROUNDED_RECTANGLE:
            return new RoundedRectangle();
         default:
            throw new InvalidShapeException();
      }
   }
}
