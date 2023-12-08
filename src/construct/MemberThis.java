package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter; // 매개변수와 이름이 다르면 this. 생략 가능 -> 요즘 IDE에서 매개변수와 멤버변수 구분을 잘 해주기 때문에 주로 생략함
    }
}
