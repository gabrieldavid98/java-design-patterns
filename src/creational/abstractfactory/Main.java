package creational.abstractfactory;

public class Main {
   public static void main(String[] args) {
      try {
         GeometricFactory geometricFactory = GeometricFactoryCreator.createGeometricFactory(true);
         Shape roundedRectangle = geometricFactory.createShape(Shapes.RECTANGLE);

         roundedRectangle.draw();
      } catch (InvalidShapeException invalidShapeException) {
         invalidShapeException.printStackTrace();
      }
   }
}
