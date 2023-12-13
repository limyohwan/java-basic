package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Caw(), new Duck()}; // 새로운 동물이 추가되었을때 클래스만 생성에서 배열에 집어넣으면 다른 코드들은 수정하지 않아도됨
        for (Animal animal : animals) {
            soundAnimal(animal);
        }

        Animal animal = new Animal(); // 상속의 문제점, Animal은 다형성을 위해 사용할뿐 인스턴스로 사용할 생각은 없음 -> 추상 클래스 사용
        animal.sound();

        Pig pig = new Pig();
        pig.sound(); // Animal의 sound를 override 않아 실수할 여지가 있음 -> 추상 메서드 사용
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("sound start");
        animal.sound(); // 오버라이딩된 메서드가 있으면 그 메서드를 우선적으로 호출함
        System.out.println("sound end");
    }
}
