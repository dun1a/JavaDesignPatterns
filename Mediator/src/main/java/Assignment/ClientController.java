package Assignment;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ClientController {

    public ChoiceBox<ClientController> clientChoices;
    public TextField messageFiled;
    public TextArea showMessage;
    private String username;
    private Mediator mediator;

    public ClientController() {
    }

    public  void setUserName(String username) {
        this.username = username;
    }

    public String getUserName() {
        return username;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void receiveMessage(String message, ClientController sender) {
        System.out.println("[" + sender.getUserName() + " to " + this.getUserName() + "]: " + message);
        showMessage.appendText("[" + sender.getUserName() + "]: " + message + "\n");
    }

    public void sendMessage(String message, ClientController receiver) {
        mediator.sendMessage(message, this, receiver);
    }


    public void onCLickSendMessage() {
        sendMessage(messageFiled.getText(), clientChoices.getValue());
    }

    public void chooseClient() {
        clientChoices.getItems().clear();
        clientChoices.getItems().addAll(mediator.getClientsList());

    }
}
