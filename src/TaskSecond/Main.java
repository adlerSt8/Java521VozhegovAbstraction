package TaskSecond;

public class Main {
    public static void main(String[] args) {
        FileManager localManager = new LocalFileManager();
        localManager.copyFile("C:/Documents/file.txt", "D:/Backup/file.txt");
        localManager.deleteFile("C:/Documents/file.txt");

        System.out.println();

        FileManager cloudManager = new CloudFileManager();
        cloudManager.copyFile("cloud:/file.txt", "cloud:/backup/file.txt");
        cloudManager.deleteFile("cloud:/file.txt");
    }
}
