package structural.adapter;

public class AudioPlayer implements MediaPlayer {
   private MediaAdapter mediaAdapter;

   public AudioPlayer(MediaAdapter mediaAdapter) {
      this.mediaAdapter = mediaAdapter;
   }

   public void play() {
      mediaAdapter.play();
   }
}
