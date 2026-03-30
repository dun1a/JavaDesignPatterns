package Example;

public class RealCity implements City{

    // the RealSubject class
    // implements the City interface
    // has a constructor that takes the city's name, country, population and weather

    private String name;
    private String country;
    private int population;
    private String weather;

    public RealCity(String name, String country, int population, String weather) {
        this.name = name;
        this.country = country;
        this.population = population;
        this.weather = weather;
    }
    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getCountry() {
        return "";
    }

    @Override
    public int getPopulation() {
        return 0;
    }

    @Override
    public String getWeather() {
        return "";
    }

}
