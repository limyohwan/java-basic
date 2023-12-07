package ref;

public class NullMain2 {

    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // NPE 발생, 참조할 객체가 없음
        System.out.println("data.value = " + data.value);
    }
}
