package construct;

public class ConstructMain2 {

    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("member1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("member2", 18);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("member = " + member);
        }
    }
}
