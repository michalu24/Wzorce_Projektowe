package _5_Adapter;

public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVLC(String fileName) {

    }

    @Override
    public void playMP4(String filename) {
        System.out.println("Playing MP4: " + filename);

    }
}
