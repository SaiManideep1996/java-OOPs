public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Prathyusha", 5000);

        account.deposit(1500);
        account.withdraw(2000);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Remaining Balance: $" + account.getBalance());
    }
}
