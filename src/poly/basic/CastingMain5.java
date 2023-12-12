package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent poly = new Child();
        System.out.println("poly");
        call(poly);

        System.out.println("parent");
        Parent parent = new Parent();
        call(parent);
    }

    private static void call(Parent parent) {
        parent.parentMethod();

        if (parent instanceof Child) { // 다운 캐스팅을 하고싶으면 instanceof를 통해 타입을 확인하고 다운 캐스팅을 해야함
            System.out.println("child instance");
            Child child = (Child) parent;
            child.childMethod();
        }
    }
}
