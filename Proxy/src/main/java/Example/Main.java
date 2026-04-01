package Example;

public class Main {

    // client class
    // creates cities
    // retrieves their names, population, weather information
    // uses the City interface to interact with the cities

    public static void main(String[] args){
        City city = new CityProxy("Heslinki", "Finland", 631695);
        City city2 = new CityProxy("Cario", "Egypt", 2148000);
        City city3 = new CityProxy("Tampere", "Finland", 235000);

        // print population
        System.out.println(city.getName() + " population: " + city.getPopulation());
        System.out.println(city2.getName() + " population: " + city2.getPopulation());
        System.out.println(city3.getName() + " population: " + city3.getPopulation());

        // print weather - proxy triggers fetching weather and creates RealCity
        System.out.println(city.getName() + " weather: " + city.getWeather());
        System.out.println(city2.getName() + " weather: " + city2.getWeather());

        // print weather - no proxy involved
        System.out.println(city3.getName() + " weather: " + city3.getWeather());

        // print weather - proxy knows the RealCity and doesn't fetch weather
        System.out.println(city2.getName() + " weather: " + city2.getWeather());
    }
}
