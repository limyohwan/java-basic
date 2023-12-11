package static2;

public class DecoMain1 {

    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil1 decoUtil1 = new DecoUtil1(); // 객체 생성이 크게 의미가 없어 보임
        String deco = decoUtil1.deco(s);
        System.out.println("deco = " + deco);
    }
}
