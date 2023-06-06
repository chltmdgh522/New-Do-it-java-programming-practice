package chapter13.innerclass;

class Outer {
    int outNum = 100;
    static int sNum = 200;

    Runnable runnable =new Runnable() {
        @Override
        public void run() {
            System.out.println("runnable");
        }
    };
    public Runnable getRunnable() { // 쓰레드 생성할때 사용하는거

        int localNum = 100;
        class MyRunnable implements Runnable {

            @Override
            public void run() {
                //localNum+=9; //오류
                System.out.println(outNum);
                System.out.println(sNum);
                System.out.println(localNum);
            }
        }

        return new MyRunnable();
    }


}

public class LocalInnerTest {
    public static void main(String[] args) {
        Outer outer =new Outer();
        outer.getRunnable().run();

        outer.runnable.run();
    }
}
