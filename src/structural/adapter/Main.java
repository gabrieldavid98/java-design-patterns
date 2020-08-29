package structural.adapter;

public class Main {
   public static void main(String[] args) {
      MediaAdapter mediaAdapter = new MediaAdapter(MultimediaType.VLC);
      AudioPlayer audioPlayer = new AudioPlayer(mediaAdapter);

      audioPlayer.play();
   }
}
