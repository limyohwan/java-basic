package poly.ex.pay0;

public class PayService {
    public void processPay(String option, int amount) {
        boolean result;
        System.out.println("start paying option : " + option + ", amount : " + amount);
        if (option.equals("kakao")) {
            KakaoPay kakaoPay = new KakaoPay();
            result = kakaoPay.pay(amount);
        } else if (option.equals("naver")) {
            NaverPay naverPay = new NaverPay();
            result = naverPay.pay(amount);
        } else if (option.equals("new")) {
            NewPay newPay = new NewPay();
            result = newPay.pay(amount);
        } else {
            System.out.println("no payment");
            result = false;
        }

        if (result) {
            System.out.println("pay success");
        } else {
            System.out.println("pay fail");
        }
    }
}
