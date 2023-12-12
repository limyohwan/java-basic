package poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        Parent poly = new Child();

        // poly.childMethod(); 사용 불가

        Child child = (Child) poly; // 다운 캐스팅(부모타입 -> 자식타입)
        child.childMethod();
    }
}
