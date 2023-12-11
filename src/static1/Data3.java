package static1;

public class Data3 {
    public String name;
    public static int count; // static 변수, 정적 변수, 클래스 변수의 변수들은 메서드 영역에서 관리함 -> 인스턴스 영역에 생성되지 않음

    public Data3(String name) {
        this.name = name;
//        Data3.count++;
        count++;
    }
}
