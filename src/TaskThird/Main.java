package TaskThird;

public class Main {
    public static void main(String[] args) {
        Subject math = new Math("Иванов");
        Subject history = new History("Петрова");
        Subject science = new Science("Сидоров");

        math.study();
        history.study();
        science.study();
    }
}
