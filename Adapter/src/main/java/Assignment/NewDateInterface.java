package Assignment;

// is the interface the client code will use
// adapter class should implement it
public interface NewDateInterface  {

    void setDay(int day);
    void setMonth(int month);
    void setYear(int year);
    int getDay();
    int getMonth();
    int getYear();
    void advanceDays(int days); // should advance day by given number of days
}
