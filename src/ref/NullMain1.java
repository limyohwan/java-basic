package ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null;
        System.out.println("data = " + data);
        data = new Data();
        System.out.println("data = " + data);
        data = null; // 아무도 참조하지 않는 데이터(8라인 Data)는 GC(가비지 컬렉션)가 인스턴스를 자동으로 메모리에서 제거해줌
        System.out.println("data = " + data);
    }
}
