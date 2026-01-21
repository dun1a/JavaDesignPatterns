package Assignment;

public class ButtonB extends Button{

    String text;

    public ButtonB(){
        this.text = "BUTTON";
    }

    @Override
    public void display() {
        if (text.equals("BUTTON")) {
            System.out.println("This is Button B");
        }else{
            System.out.println("Changing Button text");
        }

        String button = "************\n"
                + "*  " + text + "  *\n"
                + "************";
        System.out.println(button);
    }
    public void setText(String text){
        this.text = text;
    }

}
