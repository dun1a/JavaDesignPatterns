package Assignment;


public class DotFactory extends UIFactory {

    String text;
    @Override
    public Button createButton(String text) {
        return new ButtonA(text);
    }

    @Override
    public TextField createTextField(String text) {
        return new TextFieldA(text);
    }

    @Override
    public CheckBox createCheckBox(String text) {
        return new CheckboxA(text);
    }

}
