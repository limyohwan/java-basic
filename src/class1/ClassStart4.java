package class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];
        students[0] = student1; // 자바에서 대입은 항상 변수에 들어 있는 값을 복사해서 전달함, 참조값(x001)이 변수에 들어있으면 이 참조값(x001)이 전달됨
        students[1] = student2;

        System.out.println("students[0] = " + students[0]);
        System.out.println("students[1] = " + students[1]);
        // students[0].name -> x005[0].name -> x001.name -> "학생1"
    }
}
