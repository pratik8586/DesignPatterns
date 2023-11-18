package Strategy;

public class DebitCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("DebitCardPaymentStrategy : " + amount);
    }
}
