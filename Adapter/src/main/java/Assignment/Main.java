package Assignment;

public class Main {

    public static void main(String[] args) {

        CalendarToNewDateAdapter dateAdapter = new CalendarToNewDateAdapter(java.util.Calendar.getInstance());
        dateAdapter.setDay(4);
        dateAdapter.setMonth(4);
        dateAdapter.setYear(2026);
        dateAdapter.advanceDays(1);
        System.out.println("The date is: " + dateAdapter.getDay() + "/" + dateAdapter.getMonth() + "/" + dateAdapter.getYear());
    }
}
