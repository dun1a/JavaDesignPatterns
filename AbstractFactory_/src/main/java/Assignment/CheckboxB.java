package Assignment;

public class CheckboxB extends CheckBox{

    String text;

    public CheckboxB() {
        this.text = "X";
    }

    @Override
    public void display() {
        if (text.equals("X")) {
            System.out.println("This is Button B");
        }else{
            System.out.println("Changing Button text");
        }

        String checkbox = "*****\n"
                + "* " + text + " *\n"
                + "*****";

        System.out.println(checkbox);
    }

    public void setText(String text){
        this.text = text;
    }
}
