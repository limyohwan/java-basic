package poly.ex3;

public abstract class AbstractAnimal {

    // 추상 메서드가 하나라도 있는 클래스는 추상클래스로 선언해야함
    public abstract void sound();

    public void move() { // 추상 메서드가 아님, 자식 클래스에서 오버라이딩하지 않아도됨
        System.out.println("AbstractAnimal.move");
    }
}
