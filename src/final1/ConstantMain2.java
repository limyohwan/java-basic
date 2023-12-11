package final1;

public class ConstantMain2 {

    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " + Constant.MAX_USERS);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("currentUserCount = " + currentUserCount);
        if (currentUserCount > Constant.MAX_USERS) { // 매직 넘버(개발자를 고민하게 만드는 숫자, 변수)에 상수를 사용하여 문맥을 제공함, 또한 수정시 상수 부분만 수정하면됨
            System.out.println("대기자 등록");
        } else {
            System.out.println("게임 참여");
        }
    }
}
