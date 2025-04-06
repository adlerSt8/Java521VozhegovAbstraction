package TaskThird;

public class History extends Subject{
    public History(String teacher) {
        super("История", teacher);
    }

    @Override
    public void study() {
        System.out.println("Изучаем Древний Рим с учителем " + getTeacher());
    }
}
