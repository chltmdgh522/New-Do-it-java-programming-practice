package chapter8.inheritancetest;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");

    }
}

class Human extends Animal {

    @Override
    public void move() {
        System.out.println("사람도 움직입니다.");

    }

    public void readBook() {
        System.out.println("사람은 책을 읽는다.");

    }
}

class Tiger extends Animal {

    public void move() {
        super.move();
        System.out.println("호랑이가 움직입니다.");

    }
    public void hunting() {
        System.out.println("호랑이는 사냥한다.");

    }
}

class Birds extends Animal {
    public void move() {
        System.out.println("새가 움직입니다.");

    }

    public void egg() {
        System.out.println("독수리는 알은 낳는다.");

    }

}

public class AnimalTest {

    public static void main(String[] args) {
        moveAnimal(new Animal());
        moveAnimal(new Birds());
        moveAnimal(new Tiger());
        moveAnimal(new Human());

        // Animal animal=new Human();

    }

    public static void moveAnimal(Animal animal) {
      animal.move();

        if(animal instanceof Human){
            Human human=(Human)animal;
            human.readBook();
        } else if (animal instanceof Tiger) {
            Tiger tiger = (Tiger) animal;
            tiger.hunting();
        } else if (animal instanceof Birds) {
            Birds eggle = (Birds) animal;
            eggle.egg();
        }


    }

}
