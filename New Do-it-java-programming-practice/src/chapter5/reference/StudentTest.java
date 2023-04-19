package chapter5.reference;

public class StudentTest {

    public static void main(String[] args) {
        Student s1 = new Student(100, "최승호");
        s1.setKorea("국어",100);
        s1.setMath("수학", 100);

        Student studentKim = new Student(101, "김승호");
        studentKim.setKorea("국어", 1000);
        studentKim.setMath("수학", 10);

        s1.show();
        studentKim.show();
    }
}
