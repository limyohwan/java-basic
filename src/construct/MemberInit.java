package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    MemberInit() { // 기본 생성자, 생성자가 하나도 없으면 컴파일러에서 자동으로 만들어줌

    }

    void initMember(String name, int age, int grade) {
        this.name = name; // 이름이 같으면 매개변수가 우선순위를 가짐, 그러므로 해당 인스턴스의 멤버변수에 값을 넣기 위해서는 this.를 사용해야함
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "MemberInit{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
