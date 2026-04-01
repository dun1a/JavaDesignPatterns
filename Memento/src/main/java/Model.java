public class Model {

    // this is the ORIGINATOR in the memento pattern


    // this class contains the applications state
    // stores the colors of the rectangles and boxes of the checkboxes
    // the values are stored as 0 1 2 and the state of the checkboxes is stored as true / false
    // the createMemento method in here returns an object of a Memento
    // the memento object contains the state of the model at the time of its creation
    // the restoreState() is for takes a memento object and restores the state of the model to the state save in the memento

    private int[] options = new int[3];

    private boolean isSelected;

    public void setOption(int optionNumber, int choice, String time){
        System.out.println("optionNumber: " + optionNumber + " choice: " + choice + " time: ");
        if (optionNumber >= 1 && optionNumber <= 3){
            options[optionNumber - 1] = choice;
        }
    }

    public int getOption(int optionNumber){
        if (optionNumber >= 1 && optionNumber <= 3){
            return options[optionNumber -1 ];
        }
        return -1;
    }

    public void setIsSelected(boolean isSelected){
        System.out.println("isSelected: " + isSelected);
        this.isSelected = isSelected;
    }

    public boolean getIsSelected(){
        return isSelected;
    }

    public String getTime(){
        return new Memento(options, isSelected).getSavedTime();
    }

    public IMemento createMemento(){
        return new Memento(options, isSelected);
    }

    // method to restore the state of the model
    public void restoreState(IMemento memento, String time) {
        Memento selectionMemento = (Memento) memento;
        options = selectionMemento.getOptions();
        System.out.println("options: " + options[0] + " " + options[1] + " " + options[2]);
        isSelected = selectionMemento.isSelected();
        System.out.println("isSelected: " + isSelected);
        System.out.println("State restored");
        //System.out.println("Restored time: " + time);
    }

}
