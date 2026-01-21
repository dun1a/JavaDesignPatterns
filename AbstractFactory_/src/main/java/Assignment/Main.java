package Assignment;

public class Main {

    public static void main(String[] args) {

        UIFactory factory = new StarFactory();

        CheckBox checkBox = factory.createCheckBox();

        TextField textField = factory.createTextField();


        Button button = factory.createButton();
        button.display();
        button.setText("PRESS");
        button.display();

        factory.createCheckBox();
        checkBox.display();
        checkBox.setText("0");
        checkBox.display();

        factory.createTextField();
        textField.display();
        textField.setText("something");
        textField.display();


    }


}
