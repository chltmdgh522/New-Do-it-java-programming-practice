package chapter6.staticex;

public class StudentTest1 {

    public static void main(String[] args) {

        Student student=new Student();
        System.out.println(Student.serialNum);
        System.out.println(Student.serialNum);
        System.out.println(student.studentId);

        Student student1=new Student();

        Student student2=new Student();

        System.out.println(student1.studentId);

    }
}
