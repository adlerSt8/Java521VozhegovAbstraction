package TaskSecond;

public class CloudFileManager implements FileManager {
    @Override
    public void copyFile(String source, String destination) {
        System.out.println("Копирование файла в облаке из: " + source + " в: " + destination);
    }

    @Override
    public void deleteFile(String filePath) {
        System.out.println("Удаление файла из облака: " + filePath);
    }
}
