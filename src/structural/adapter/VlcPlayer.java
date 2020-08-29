package structural.adapter;

public class VlcPlayer implements AdvanceMediaPlayer {
   public void playVlc() {
      System.out.println("Playing VLC");
   }

   public void playMp4() {
   }
}
