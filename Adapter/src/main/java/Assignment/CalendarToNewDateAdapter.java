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
    }

    @Override
    public void setDay(int day) {
        calendar.set(Calendar.DATE, day);
    }

    @Override
    public void setMonth(int month) {
        calendar.set(Calendar.MONTH, month - 1); // Calendar months are 0-based
    }

    @Override
    public void setYear(int year) {
        calendar.set(Calendar.YEAR, year);
    }

    @Override
    public int getDay() {
        return calendar.get(Calendar.DATE);
    }

    @Override
    public int getMonth() {
        return calendar.get(Calendar.MONTH) + 1; // Calendar months are 0-based
    }

    @Override
    public int getYear() {
        return calendar.get(Calendar.YEAR);
    }

    @Override
    public void advanceDays(int days) {
        calendar.add(Calendar.DATE, days);
    }
}
