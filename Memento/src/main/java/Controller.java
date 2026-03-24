import java.util.ArrayList;
import java.util.List;

public class Controller {

    // this is the CARETAKER in the memento pattern
    // this class handles communication between the model and the view (GUI)
    // reacts to the user's actions and updates the model accordingly and uodtes the view if needed

    private Model model;
    private GUI gui;
    private String time;
    private List<IMemento> history; // mementos are stored in here

    private List<IMemento> redoHistory = new ArrayList<>(); // mementos for redo are stored in here
    private List<IMemento> allHistory = new ArrayList<>();

    public Controller(GUI gui) {
        this.model = new Model();
        this.gui = gui;
        this.history = new ArrayList<>();
    }

    public void setOption(int optionNumber, int choice){
        saveToHistory();
        model.setOption(optionNumber, choice);
    }

    public int getOption(int optionNumber){
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected){
        saveToHistory();
        model.setIsSelected(isSelected);
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public String getTime(){
        return model.getTime();
    }

    public void redo(){
        if(!redoHistory.isEmpty()){
            System.out.println("Memento found in redo history");
            IMemento currentState = model.createMemento();
            IMemento undoneState = redoHistory.remove(redoHistory.size() - 1);
            history.add(currentState);
            time = ((Memento) undoneState).getSavedTime();
            model.restoreState(undoneState, time);
            gui.updateGui();
        }
        else {
            System.out.println("No memento found in redo history");
        }
    }

    public void undo(){
        if(!history.isEmpty()){
            System.out.println("Memento found in history");
            IMemento currentState = model.createMemento();
            IMemento previousState = history.remove(history.size() - 1);
            System.out.println("previous state added to redo list " + previousState);
            redoHistory.add(currentState);
            allHistory.add(previousState);
            time = ((Memento) previousState).getSavedTime();
            model.restoreState(previousState, time);
            gui.updateGui();
        }
    }

//    public void getAllHistory(){
//        for (IMemento memento : allHistory) {
//            System.out.println(memento);
//            model.restoreState(memento, ((Memento) memento).getSavedTime());
//        }
//    }

    public List<IMemento> getAllHistory(){
        return allHistory;
    }

    public void restoreFromHistory(IMemento memento){
        model.restoreState(memento, ((Memento) memento).getSavedTime());
    }

    private void saveToHistory(){
        IMemento currentState = model.createMemento();
        System.out.println("Saving current state to history " + currentState);
        history.add(currentState);
        allHistory.add(currentState);
        redoHistory.clear(); // Clear redo history when a new action is taken
    }


}
