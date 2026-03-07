package Example;

public class PaymentContext {
    // this is the context class that uses PaymentStrategy intefrace
    // perform pyment
    // this class has setPaymentStrategy() method to set the payment method and a
    // processPayment() method to perform the payment


    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public boolean processPayment(double amount) {
        return paymentStrategy.processPayment(amount);
    }
}

