package pack;

import pack.a.User; // import를 사용하면 풀경로를 생략해도 됨
import pack.a.User2;

// import pack.a.*; // 해당 패키지 하위의 모든 클래스를 사용할 수 있음

public class PackageMain2 {

    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); // import를 사용하면 풀경로를 생략해도 됨
        User2 user2 = new User2();
    }
}
