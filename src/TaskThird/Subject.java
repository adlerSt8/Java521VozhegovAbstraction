package TaskThird;

public abstract class Subject {
    private String subjectName;
    private String teacher;

    public Subject(String subjectName, String teacher) {
        this.subjectName = subjectName;
        this.teacher = teacher;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getTeacher() {
        return teacher;
    }

    // Абстрактный метод - будет реализован в подклассах
    public abstract void study();
}
