package structural.adapter;

public class Mp4Player implements AdvanceMediaPlayer {
   public void playVlc() { }

   public void playMp4() {
      System.out.println("Playing Mp4");
   }
}
