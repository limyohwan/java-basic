package construct;

public class MethodInitMain3 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("member1", 15, 90);


        MemberInit member2 = new MemberInit();
        member2.initMember("member2", 18, 20);

        MemberInit[] members = {member1, member1};
        
        for (MemberInit member : members) {
            System.out.println("member = " + member);
        }
    }
}
