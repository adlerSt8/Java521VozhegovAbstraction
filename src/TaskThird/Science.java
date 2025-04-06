package TaskThird;

public class Science extends Subject{
    public Science(String teacher) {
        super("Наука", teacher);
    }

    @Override
    public void study() {
        System.out.println("Ставим эксперименты на уроке с учителем " + getTeacher());
    }
}
