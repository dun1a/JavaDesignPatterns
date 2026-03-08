package Assignment;

// abstract product
// abstract class for buttons
// defines what the concrete button classes should implement (display and setText methods)

public abstract class Button {

    protected String text;
    public abstract void display();
    public abstract void setText(String text);

}
