public class PaymentTest {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new PayPal();

        p1.pay(1200);
        p2.pay(850);
    }
}
