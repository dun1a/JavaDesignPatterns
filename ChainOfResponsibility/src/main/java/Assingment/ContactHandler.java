package Assingment;

public class ContactHandler extends Approver {

    @Override
    public void processFeedback(CustomerMessage customerMessage) {
        System.out.println("Contact message received");

    }
}
