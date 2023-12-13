package poly.ex3;

public class AbstractMain {

    public static void main(String[] args) {
//        AbstractAnimal abstractAnimal = new AbstractAnimal(); // 추상클래스는 인스턴스화 하지 못함
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("sound start");
        animal.sound(); // 오버라이딩된 메서드가 있으면 그 메서드를 우선적으로 호출함
        System.out.println("sound end");
    }
}
