package poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        Animal[] animals = {dog, cat, caw, duck};
        for (Animal animal : animals) {
            System.out.println("sound start");
            animal.sound(); // 오버라이딩된 메서드가 있으면 그 메서드를 우선적으로 호출함
            System.out.println("sound end");        }
    }
}
