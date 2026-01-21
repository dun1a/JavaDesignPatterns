package Assignment;

public class StarFactory extends UIFactory{
    @Override
    public Button createButton() {
        return new ButtonB();
    }

    @Override
    public TextField createTextField() {
        return new TextFieldB();
    }

    @Override
    public CheckBox createCheckBox() {
        return new CheckboxB();
    }

}
