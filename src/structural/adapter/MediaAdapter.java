package structural.adapter;

public class MediaAdapter implements MediaPlayer {
   private AdvanceMediaPlayer advanceMediaPlayer;
   private MultimediaType multimediaType;

   public MediaAdapter(MultimediaType multimediaType) {
      this.multimediaType = multimediaType;

      switch (multimediaType) {
         case VLC:
            advanceMediaPlayer = new VlcPlayer();
            break;
         case MP4:
            advanceMediaPlayer = new Mp4Player();
            break;
      }
   }

   public void play() {
      switch (multimediaType) {
         case VLC:
            advanceMediaPlayer.playVlc();
            break;
         case MP4:
            advanceMediaPlayer.playMp4();
            break;
      }
   }
}
