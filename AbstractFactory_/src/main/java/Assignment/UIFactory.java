package Assignment;

// abstract factory
// defines interface operations to create abstract products (buttons, text fields and checkboxes) without specifying their concrete classes
// factory interface (abstract class rn)
public abstract class UIFactory {

    // abstract factory methods for creating abstract products (buttons, text fields and checkboxes)
    String text;
    public abstract Button createButton(String text);
    public abstract TextField createTextField(String Text);
    public abstract CheckBox createCheckBox(String Text);



}
