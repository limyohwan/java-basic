package poly.ex6;

public class Bird extends AbstractAnimal implements Fly { // extends는 하나만 가능하기 때문에 먼저해야함
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("Bird.fly");
    }
}
