package final1;

public class Member {

    private final String id; // 변경하면 안되는 경우 final로 선언하여 다른 개발자들이 변경할 수 없게 해야함
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String id, String name) {
//        this.id = id; // 변경 불가 컴파일 에러
        this.name = name;
    }

    public void print() {
        System.out.println("id = " + id + " name = " + name);
    }
}
