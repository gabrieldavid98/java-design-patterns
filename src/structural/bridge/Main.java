package structural.bridge;

public class Main {
   public static void main(String[] args) {
      Drawer drawer = new GreenCircle();
      Circle greenCircle = new Circle(drawer, 10, 20, 15);

      drawer = new RedCircle();
      Circle redCircle = new Circle(drawer, 34, 654, 78);

      greenCircle.draw();
      redCircle.draw();
   }
}
