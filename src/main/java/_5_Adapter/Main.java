package _5_Adapter;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("MP3", "Lala land");
        audioPlayer.play("MP4", "Metallica Black Album");
        audioPlayer.play("VLC", "TED");
    }
}
