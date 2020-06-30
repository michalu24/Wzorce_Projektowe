package _5_Adapter;

public class VLcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing VLC: " + fileName);
    }

    @Override
    public void playMP4(String filename) {

    }
}
