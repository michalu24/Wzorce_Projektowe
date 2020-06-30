package _5_Adapter;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("VLC")) {
            advancedMediaPlayer = new VLcPlayer();
        }
        else if (audioType.equalsIgnoreCase("MP4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("VLC")) {
            advancedMediaPlayer.playVLC(fileName);

        } else if (audioType.equalsIgnoreCase("MP4")) {
            advancedMediaPlayer.playMP4(fileName);

        }
    }
}
