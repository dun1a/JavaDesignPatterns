import Assignment.model.WeatherStation;

public class Main {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();
        Thread thread = new Thread(weatherStation);
        thread.start();
    }
}
