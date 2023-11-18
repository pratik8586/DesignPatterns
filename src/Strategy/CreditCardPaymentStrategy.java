package Strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("CreditCardPaymentStrategy : " + amount);
    }
}
