package Assingment;


// declares process() method , is responsible fr managing the next object in the chain
public abstract class Approver {

    private Approver nextApprover;

    public void processFeedback(CustomerMessage customerMessage) {
        if (nextApprover != null) {
            nextApprover.processFeedback(customerMessage);
        }
    }
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

}