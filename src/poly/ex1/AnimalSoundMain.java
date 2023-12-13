package poly.ex1;

public class AnimalSoundMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        System.out.println("sound start");
        dog.sound();
        System.out.println("sound end");

        System.out.println("sound start");
        cat.sound();
        System.out.println("sound end");

        System.out.println("sound start");
        caw.sound();
        System.out.println("sound end");

//        sound(dog); // 불가능
//        sound(cat); // 불가능
        sound(caw);

//        Caw[] caws = {caw, cat, dog}; // 불가능
        Caw[] caws = {caw};
        for (Caw caw1 : caws) {
            System.out.println("sound start");
            caw1.sound();
            System.out.println("sound end");
        }

        // 타입이 같지 않으므로 중복 코드 제거에 어려움이 있음
    }

    private static void sound(Caw caw) {
        System.out.println("sound start");
        caw.sound();
        System.out.println("sound end");
    }
}
