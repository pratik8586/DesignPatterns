package Strategy;

public class Application {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor(new CreditCardPaymentStrategy());
        paymentProcessor.processPayment(100);

        paymentProcessor = new PaymentProcessor(new DebitCardPaymentStrategy());
        paymentProcessor.processPayment(200);

        paymentProcessor = new PaymentProcessor(new PaypalPaymentStrategy());
        paymentProcessor.processPayment(300);
    }
}
