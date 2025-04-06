package TaskFirst;

public class VideoPlayer implements MediaPlayer{
    @Override
    public void play() {
        System.out.println("Воспроизведение видео...");
    }

    @Override
    public void stop() {
        System.out.println("Видео остановлено.");
    }
}
