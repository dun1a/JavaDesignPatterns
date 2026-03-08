package Assignment;

// concrete factory
// implements creation of concrete products in the chosen family
// factory for dot style
// creates dot style buttons, text fields and checkboxes
// each factory creates a family of related products (dot style UI components)

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
