package Assignment;

import java.util.Calendar;

// this class will implement NewDateInterface, using the Calendar interface internally to handle date operations
public class CalendarToNewDateAdapter implements NewDateInterface {

    private Calendar calendar; // using the Calendar class internally inside the adapter class

    private int day;
    private int month;
    private int year;

    public CalendarToNewDateAdapter(Calendar calendar) {
        this.calendar = calendar;
//        this.day = calendar.get(Calendar.DAY_OF_MONTH);
//        this.month = calendar.get(Calendar.MONTH) + 1; // Calendar.MONTH is zero-based
//        this.year = calendar.get(Calendar.YEAR);

    }
    @Override
    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int getDay() {
        return day;
    }

    @Override
    public int getMonth() {
        return month;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void advanceDays(int days) {
        this.day += days;
    }
}
