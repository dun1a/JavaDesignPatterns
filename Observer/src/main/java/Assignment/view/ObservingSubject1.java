package Assignment.view;

public class ObservingSubject1 implements Observer {

    @Override
    public void update(int temperature) {
        System.out.println("Observing object 1 got an update. Current temperature is " + temperature);
    }
}
