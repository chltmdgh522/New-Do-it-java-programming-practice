package chapter6.cooperation;

public class TakeTrains {

    public static void main(String[] args) {
        Student choi = new Student("최승호", 5000);
        Student kim = new Student("김승호", 5000);

        Bus bus100 = new Bus(100);
        Subway subway1 = new Subway(1);

        choi.takeBus(bus100);
        choi.takeSubway(subway1);
        choi.show();

        kim.takeBus(bus100);
        kim.takeSubway(subway1);
        kim.show();

        bus100.show();
        subway1.show();
    }

}