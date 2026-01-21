package Assignment;

public abstract class UIFactory {

    String text;
    public abstract Button createButton(String text);
    public abstract TextField createTextField(String Text);
    public abstract CheckBox createCheckBox(String Text);



}
