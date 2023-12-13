package poly.diamond;

public class Child implements InterfaceA, InterfaceB {
    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    @Override
    public void methodCommon() { // 같은 메서드는 구현을 하나만 하면됨
        System.out.println("Child.methodCommon");
    }
}
