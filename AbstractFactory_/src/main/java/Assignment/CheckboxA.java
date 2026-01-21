package Assignment;

public class CheckboxA extends CheckBox {

    String text;

    public CheckboxA(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        if (text.equals("X")) {
            System.out.println("This is Checkbox A");
        }else{
            System.out.println("Changing Checkbox text");
        }

        String checkbox = ".....\n"
                        + "| " + text + " |\n"
                        + ".....";
        System.out.println(checkbox);
    }

    public void setText(String text) {
        this.text = text;
    }
}
