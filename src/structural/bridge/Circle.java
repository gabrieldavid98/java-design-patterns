package structural.bridge;

public class Circle extends Shape {
   private int x, y, radius;

   public Circle(Drawer drawer, int x, int y, int radius) {
      super(drawer);
      this.x = x;
      this.y = y;
      this.radius = radius;
   }

   @Override
   public void draw() {
      drawer.drawCircle(radius, x, y);
   }
}
