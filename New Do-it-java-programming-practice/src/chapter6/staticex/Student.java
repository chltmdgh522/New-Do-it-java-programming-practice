package chapter6.staticex;

public class Student {

     static int serialNum=0;
    int studentId;
    String studentName;

    public Student(){
        serialNum++;
        studentId=serialNum;

    }
}
