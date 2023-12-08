package pack;

public class PackageMain1 {

    public static void main(String[] args) {
        Data data = new Data(); // 같은 패키지면 경로를 생략할 수 있음
        pack.a.User user = new pack.a.User(); // 다른 패키지면 풀경로를 작성해 주어야 함
    }
}
