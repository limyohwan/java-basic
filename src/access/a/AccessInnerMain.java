package access.a;

public class AccessInnerMain {

    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicMethod();

        data.defaultField = 1;
        data.defaultMethod();

//        data.privateField = 1; // private은 접근 불가
//        data.privateMethod();

        data.innerAccess();
    }
}
