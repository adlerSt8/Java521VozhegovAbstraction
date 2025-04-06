package TaskSecond;

public class LocalFileManager implements FileManager {
    @Override
    public void copyFile(String source, String destination) {
        System.out.println("Копирование локального файла из: " + source + " в: " + destination);
    }

    @Override
    public void deleteFile(String filePath) {
        System.out.println("Удаление локального файла: " + filePath);
    }
}
