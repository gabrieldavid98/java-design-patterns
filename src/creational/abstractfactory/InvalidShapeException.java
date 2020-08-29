package creational.abstractfactory;

public class InvalidShapeException extends Exception {
   public InvalidShapeException() {
      super("The shape is invalid for this context");
   }
}
