package structural.bridge;

public class RedCircle implements Drawer {
   public void drawCircle(int radius, int x, int y) {
      System.out.printf(
         "Drawing RedCircle { radius = %d, x = %d, y = %d }\n",
         radius, x, y
      );
   }
}
