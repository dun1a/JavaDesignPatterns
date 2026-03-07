package Example;

import java.util.Scanner;

public class GiftCardPayment implements PaymentStrategy{

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing gift card payment of $" + amount);
        System.out.println("Enter gift card code: ");
        Scanner scanner = new Scanner(System.in);
        String giftCardCode = scanner.nextLine();
        System.out.println("Validating gift card code...");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("Gift card balance deducted successfully!");
            return true;
    }
}
