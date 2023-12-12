package poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        Parent poly = new Child();
        Child child1 = (Child) poly;
        child1.parentMethod();
        child1.childMethod();

        Parent parent = new Parent();
        Child child2 = (Child) parent; // child가 생성되지 않았으므로 캐스팅이 불가하여 컴파일 에러 발생, ClassCastException
        child2.parentMethod();
        child2.childMethod();

    }
}
