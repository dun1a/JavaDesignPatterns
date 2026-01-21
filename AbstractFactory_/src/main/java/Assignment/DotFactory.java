package Assignment;


public class DotFactory extends UIFactory {
    @Override
    public Button createButton() {
        return new ButtonA();
    }

    @Override
    public TextField createTextField() {
        return new TextFieldA();
    }

    @Override
    public CheckBox createCheckBox() {
        return new CheckboxA();
    }

}
