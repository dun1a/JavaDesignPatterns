package Assingment;

import java.util.Random;

public class CompensationHandler extends Approver{

    Random rand = new Random();
    int approvedOrNo = rand.nextInt(2);
    boolean approved = false;


    @Override
    public void processFeedback(CustomerMessage customerMessage){
            if((customerMessage.getFeedbackType() == CustomerMessage.feedbackType.COMPENSATION)) {
                System.out.println("Compensation message received");
                if (approvedOrNo == 0) {
                    System.out.println("Compensation approved");
                    approved = true;
                } else {
                    System.out.println("Compensation rejected");
                    approved = false;
                    super.processFeedback(customerMessage);

                }
            }

    }
}
