package static1;

public class DataCountMain3 {

    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("data1 = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("data2 = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("data3 = " + Data3.count);

        Data3 data4 = new Data3("D");
        System.out.println("data4 = " + data4.count); // 인스턴스를 통한 접근, 별로 추천하지 않은 방법임, count가 인스턴스 변수인지 클래스 변수인지 헷갈리게 됨
        System.out.println("data4 = " + Data3.count); // 클래스를 통한 접근
    }
}
