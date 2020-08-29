package structural.bridge;

public class GreenCircle implements Drawer {
   public void drawCircle(int radius, int x, int y) {
      System.out.printf(
         "Drawing GreenCircle { radius = %d, x = %d, y = %d }\n",
         radius, x, y
      );
   }
}
