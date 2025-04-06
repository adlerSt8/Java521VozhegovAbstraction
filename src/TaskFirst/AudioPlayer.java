package TaskFirst;

public class AudioPlayer implements MediaPlayer{
    @Override
    public void play() {
        System.out.println("Воспроизведение аудио...");
    }

    @Override
    public void stop() {
        System.out.println("Аудио остановлено.");
    }
}
