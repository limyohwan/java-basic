package poly.ex.pay1;

public class NaverPay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("naver on");
        System.out.println("paying " + amount + "won");
        return true;
    }
}
