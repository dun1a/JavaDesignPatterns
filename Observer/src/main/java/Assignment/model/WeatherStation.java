package Assignment.model;

import Assignment.view.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation implements Runnable{

    Random random = new Random();
    int temp;
    int addOrMinus;
    int plusOrMinusBy;
    int interval = random.nextInt(1000,6000);

    public WeatherStation() {
        this.temp = random.nextInt(-20,50);
    }

    public double getTemp() {
        return temp;
    }

    private List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for (Observer observer : observers){
            observer.update(temp);
        }
    }


    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            addOrMinus = random.nextInt(2);
            plusOrMinusBy = random.nextInt(6);
            if(addOrMinus == 0){
                temp -= plusOrMinusBy;
            } else {
                temp += plusOrMinusBy;
                System.out.println(temp);
            }
            notifyObservers();
        }

    }
}
