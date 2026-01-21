package Assignment;

public class Main {

    public static void main(String[] args) {

        UIFactory factory = new StarFactory();

        Button button = factory.createButton("BUTTON");
        button.display();
        button.setText("PRESS");
        button.display();

        CheckBox checkBox = factory.createCheckBox("X");
        checkBox.display();
        checkBox.setText("0");
        checkBox.display();

        TextField textField = factory.createTextField("textfield");
        textField.display();
        textField.setText("something");
        textField.display();


    }


}
