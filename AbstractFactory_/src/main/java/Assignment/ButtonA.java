package Assignment;

public class ButtonA extends Button{

    String text;

    public ButtonA(){
        this.text = "BUTTON";
    }

    @Override
    public void display( ) {
        if (text.equals("BUTTON")) {
            System.out.println("This is Button A");
        }else{
            System.out.println("Changing Button text");
        }
        String button = "............\n"
                      + ". " + text + "   .\n"
                      + "............";
        System.out.println(button);
    }

    public void setText(String text){
        this.text = text;
    }

}
