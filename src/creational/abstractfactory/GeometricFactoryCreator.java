package creational.abstractfactory;

public class GeometricFactoryCreator {
   public static GeometricFactory createGeometricFactory(boolean rounded) {
      if (rounded) {
         return new RoundedShapeFactory();
      }

      return new ShapeFactory();
   }
}
