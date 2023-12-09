package access;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(3000);
        account.deposit(-22);

        System.out.println("account.getBalance() = " + account.getBalance());
    }
}
