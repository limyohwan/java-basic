package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        // 배열로 선언하게되면 데이터를 추가하고 삭제하는데 실수할 여지가 있음
        String[] studentNames = {"학생1",  "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("studentNames" + (i + 1) +" = " + studentNames[i]);
            System.out.println("studentAges"+ (i + 1) +" = " + studentAges[i]);
            System.out.println("studentGrades"+ (i + 1) +" = " + studentGrades[i]);
        }
    }
}
