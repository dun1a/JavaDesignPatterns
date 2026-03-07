package Example;


// this interface class defines the contract of all payment strategies
public interface PaymentStrategy {
    boolean processPayment(double amount);
}
