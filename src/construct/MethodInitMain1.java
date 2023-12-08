package construct;

public class MethodInitMain1 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "member1";
        member1.age = 15;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        member2.name = "member2";
        member2.age = 16;
        member2.grade = 90;

        MemberInit[] members = {member1, member1};

        for (MemberInit member : members) {
            System.out.println("member = " + member);
        }
    }
}
