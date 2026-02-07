package Assignment.view;


public class ObservingSubject2  implements Observer{

    @Override
    public void update(int temperature) {
        System.out.println("Observing object 2 has been notified. Current temperature is " + temperature);

    }
}
