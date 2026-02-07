package Assignment;


import Assignment.model.WeatherStation;
import Assignment.view.Observer;
import Assignment.view.ObservingSubject1;
import Assignment.view.ObservingSubject2;

public class Main {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();
        Thread thread = new Thread(weatherStation);
        thread.start();

        Observer observingSubject1 = new ObservingSubject1();
        Observer observingSubject2 = new ObservingSubject2();
        weatherStation.addObserver(observingSubject1);
        weatherStation.addObserver(observingSubject2);


    }

}
