package TaskFirst;

public class Main {
    public static void main(String[] args) {
        MediaPlayer audio = new AudioPlayer();
        audio.play();
        audio.stop();

        System.out.println();

        MediaPlayer video = new VideoPlayer();
        video.play();
        video.stop();
    }
}
