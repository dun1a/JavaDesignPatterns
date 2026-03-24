package Example;

// declares process() method , is responsible fr managing the next object in the chain
public abstract class Approver {

    private Approver nextApprover;

    // a concrete method that concrete classes must implement
    public void process(ExpenseReport expenseReport) {
        if (nextApprover != null) {
            nextApprover.process(expenseReport);
        }
    }
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

}