package poly.ex.pay1;

public class NewPay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("new on");
        System.out.println("paying " + amount + "won");
        return true;    }
}
