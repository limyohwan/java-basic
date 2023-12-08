package pack;

import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        User userA = new User(); // 자주 사용하는 클래스 import, 다른 클래스는 풀경로 사용
        pack.b.User userB = new pack.b.User(); // 다른 패키지의 같은 이름의 클래스를 사용할 때 둘 중 하나는 풀경로를 적어줘야함
    }
}
