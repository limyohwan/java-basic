package poly.ex.pay1;

public class PayService {
    public void processPay(String option, int amount) {
        System.out.println("start paying option : " + option + ", amount : " + amount);

        Pay pay = PayStore.findPay(option);
        boolean result = pay.pay(amount);

        if (result) {
            System.out.println("pay success");
        } else {
            System.out.println("pay fail");
        }
    }
}
