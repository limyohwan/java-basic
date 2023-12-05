package class1;

public class ClassStart3 {

    public static void main(String[] args) { // 사용자 정의 타입을 위한 설계도 = 클래스
        Student student1;
        student1 = new Student(); // 실제 메모리에 만들어진 실체 = 객체, 인스턴스
        student1.name = "학생1"; // 객체.(점, dot)필드 -> 해당 필드에 접근
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
    }
}
