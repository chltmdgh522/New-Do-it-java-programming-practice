package chapter5.reference;

public class Student {
    int studentId;

    String studentName;

    Subject korea = new Subject();

    Subject math = new Subject();


    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void setKorea(String name, int score) {
        korea.setSubjectName(name);
        korea.setScore(score);
    }

    public void setMath(String name, int score) {
        math.setSubjectName(name);
        math.setScore(score);
    }

    public void show() {
        int total = korea.getScore() + math.getScore();
        System.out.println(studentName + total + korea.getSubjectName());

    }
}
