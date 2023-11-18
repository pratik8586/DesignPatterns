package Strategy;

public class PaypalPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("PaypalPaymentStrategy : " + amount);
    }
}
