import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Memento implements IMemento {

    // this class
    // creates a memento object containing the state of the model at the time of its creation
    // mementos are stored in an arrayList

    private int[] options;
    private boolean isSelected;
    String savedTime;


    Date date = GregorianCalendar.getInstance().getTime();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Memento(int[] options, boolean isSelected) {
        this.options = options.clone(); // Copy options array
        this.isSelected = isSelected;
        System.out.println("Memento created");
        this.savedTime = sdf.format(date);
        //System.out.println("Saved time: " + savedTime);
    }

    public int[] getOptions() {
        return options;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public String getSavedTime() {
        return savedTime;
    }

}
