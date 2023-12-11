package final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        final int data1;
        data1 = 10; // 최초 한번만 할당 가능
//        data1 = 20; // 재할당 시 컴파일 에러 발생

        final int data2 = 10;
//        data2 = 20; // 재할당 시 컴파일 에러 발생
    }

    static void method(final int parameter) {
//        parameter = 20; // 파이널 매개변수 값 변경 불가, 재할당 시 컴파일 에러 발생
    }
}
