package poly.ex.pay1;

public class DefaultPay implements Pay {// null 오브젝트 패턴
    @Override
    public boolean pay(int amount) {
        System.out.println("no payment");
        return false;
    }
}
