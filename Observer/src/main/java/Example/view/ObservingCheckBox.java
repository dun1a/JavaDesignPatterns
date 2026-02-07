package Example.view;

import Example.model.UserData;
import javafx.scene.control.CheckBox;


// a concrete subscriber class performs the update action
public class ObservingCheckBox extends CheckBox implements Observer {

    private UserData observable;

    public ObservingCheckBox(String text, UserData observable){
        super(text);
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update() {
        System.out.println("Checkbox received an update.");
        this.setDisable(observable.isSelected());

    }
}
