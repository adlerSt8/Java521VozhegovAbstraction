package TaskThird;

public class Math extends Subject{
    public Math(String teacher) {
        super("Математика", teacher);
    }

    @Override
    public void study() {
        System.out.println("Изучаем уравнения и геометрию с учителем " + getTeacher());
    }
}
