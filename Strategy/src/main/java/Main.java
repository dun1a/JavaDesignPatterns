import Example.CardPayment;
import Example.CashPayment;
import Example.GiftCardPayment;
import Example.PaymentContext;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PaymentContext paymentHandler = new PaymentContext(new CardPayment());

        // read amount
        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();

        System.out.println();
        System.out.println("Select payment method: ");
        System.out.println("1. Cash");
        System.out.println("2. Card");
        System.out.println("3. Gift Card");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> paymentHandler.setPaymentStrategy(new CashPayment());
            case 2 -> paymentHandler.setPaymentStrategy(new CardPayment());
            case 3 -> paymentHandler.setPaymentStrategy(new GiftCardPayment());
            default -> System.out.println("Invalid choice");
        }

        // process payment
        boolean paymentSuccess = paymentHandler.processPayment(amount);
        if(paymentSuccess){
            System.out.println("Payment successful!");
        } else {
            System.out.println("Payment failed!");
        }
    }

}
