package itmo.java.basics.lab3;

public class Study {
    private String course;

    public Study (String course) {
        this.course = course;
    }

    public String printCourse() {
        return this.course;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        Study study = new Study("Изучение Java - это просто!");
        study.printCourse();
    }

}
