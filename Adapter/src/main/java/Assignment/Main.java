package Assignment;

public class Main {

    public static void main(String[] args) {

        CalendarToNewDateAdapter dateAdapter = new CalendarToNewDateAdapter(java.util.Calendar.getInstance());
        dateAdapter.setDay(28);
        dateAdapter.setMonth(2);
        dateAdapter.setYear(2028);

        System.out.println("Initial date is: " + dateAdapter.getDay() + "/" + dateAdapter.getMonth() + "/" + dateAdapter.getYear());

        dateAdapter.advanceDays(2);
        System.out.println("New date is: " + dateAdapter.getDay() + "/" + dateAdapter.getMonth() + "/" + dateAdapter.getYear());
    }
    }
