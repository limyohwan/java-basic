package class1;

public class Student {
    String name; // 멤버 변수, 필드
    int age;
    int grade;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
