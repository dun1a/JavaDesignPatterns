package Assignment;

public class TextFieldA extends TextField{

    String text;


    public TextFieldA() {
        this.text = "TEXTFIELD";
    }

    @Override
    public void display() {
        if (text.equals("BUTTON")) {
            System.out.println("This is Checkbox A");
        }else{
            System.out.println("Changing TextField text");
        }


        String textfield = ".............\n"
                         + ". " + text + " .\n"
                         + ".............";
        System.out.println(textfield);
    }

    public void setText(String text){
        this.text = text;
    }
}
