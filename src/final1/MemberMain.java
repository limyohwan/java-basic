package final1;

public class MemberMain {

    public static void main(String[] args) {
        Member member = new Member("id", "yohwan");
        member.print();
        member.changeData("id2", "seo");
        member.print();
    }
}
