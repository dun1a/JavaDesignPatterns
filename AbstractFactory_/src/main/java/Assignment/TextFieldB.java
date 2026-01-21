package Assignment;

public class TextFieldB extends TextField {

    String text;

    public TextFieldB(String text) {
        this.text = text;
    }

    @Override
    public void display() {

        if (text.equals("textfield")) {
            System.out.println("This is Button B");
        }else{
            System.out.println("Changing Button text");
        }

        String textfield = "****************\n"
                         + "*  " + text + "   *\n"
                         + "****************";

        System.out.println(textfield);
    }

    public void setText(String text){
        this.text = text;
    }

}
