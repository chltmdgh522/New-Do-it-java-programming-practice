package chapter13.innerclass;

class OutClass {

  private int num = 10;
    private static int sNum=20;
   InClass inClass;
    public OutClass(){

    }
    class InClass {
        int inNum=20;
        // static int a=10;
        void inTest(){
            System.out.println(num);
            System.out.println(sNum);
        }
    }
    static int sNUm=4;
    static class InStaticClass{
        int iNum=100;
        static int sInNum=200;

        void inTest(){
            //num+=9; // 오류
            sNUm+=9; // 스태틱 필드
            sInNum+=9; // 스태틱 클래스 필드
        }
        static void sTest(){
            //iNum+=4; //오류
            sInNum+=4; //스태틱 클래스 필드
        }
    }
}
public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass= new OutClass();
        OutClass.InClass inClass =outClass.new InClass();
        inClass.inTest();

        OutClass.InStaticClass inStaticClass = new OutClass.InStaticClass();
        inStaticClass.inTest();
        OutClass.InStaticClass.sTest();
    }
}

