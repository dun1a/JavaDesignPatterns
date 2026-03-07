package Example;

public class CardPayment implements PaymentStrategy{

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing card payment of $" + amount);
        System.out.println("Forwarding payment to card processor...");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Payment successful!");
        return true;
    }
}
