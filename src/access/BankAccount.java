package access;

public class BankAccount {

    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액 : " + amount);
        }
    }

    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유요하지 않은 금액이거나 :" + amount + " 잔고 : " + balance + "가 부족합니다");
        }
    }

    public int getBalance() {
        return balance;
    }

    private boolean isAmountValid(int amount) { // 내부에서 사용하는 기능은 private으로 설정
        return amount > 0;
    }
}
