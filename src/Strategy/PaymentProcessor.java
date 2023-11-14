package Strategy;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    PaymentProcessor(final PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        paymentStrategy.processPayment(amount);
    }
}
