package creational.abstractfactory;

public interface GeometricFactory {
   Shape createShape(Shapes shapes) throws InvalidShapeException;
}
