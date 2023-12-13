package poly.ex.pay1;

public class KakaoPay implements Pay {

    @Override
    public boolean pay(int amount) {
        System.out.println("kakao on");
        System.out.println("paying " + amount + "won");
        return true;
    }
}
