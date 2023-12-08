package construct;

public class MethodInitMain2 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "member1", 15, 90);


        MemberInit member2 = new MemberInit();
        initMember(member2, "member2", 18, 20);

        MemberInit[] members = {member1, member1};
        
        for (MemberInit member : members) {
            System.out.println("member = " + member);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
