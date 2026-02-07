package Example.model;
import Example.view.*;

import java.util.ArrayList;
import java.util.List;

// publisher class
public abstract class Observable {

    // this is considered a publisher class that needs a subscription mechanism so objects can either subscribe or unsubscribe
    // it needs:
    // 1. an array to store a list of references to subscriber objects
    // 2. several public methods to allow adding and removing subscribers from the list

    // all subscriber objects need to implement the same Interface so that the publisher class can communicate with them
    // publishers contain a subscription infrastructure

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        // when a new event happens, the publisher goes over the subscription list and calls the notification method declared in the subscriber interface on each subscriber object
        for (Observer observer : observers){
            observer.update();
        }
    }
}
