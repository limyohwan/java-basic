package final1;

public class FinalRefMain {

    public static void main(String[] args) {
        final Data data = new Data();
//        data = new Data(); // Final이라 재할당 불가, 변수에 있는 값만 못바꾼다는 뜻임

        // 참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value); // data.value는 final이 아님
        data.value = 20;
        System.out.println(data.value);
    }
}
