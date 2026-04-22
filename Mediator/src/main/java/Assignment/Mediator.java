package Assignment;

import java.util.HashMap;
import java.util.Map;

public class Mediator implements MessageMediator{

    private Map<String, ClientController> clients = new HashMap<>();

    @Override
    public void registerClient(Controller client) {
        clients.put(client.getName(), client);
    }

    @Override
    public void sendMessage(String message, ClientController sender, ClientController receiver) {
        ClientController recipient = clients.get(receiver);
        if (recipient != null) {
            recipient.receiveMessage(message, sender);
        } else {
            System.out.println("Client " + receiver + " not found.");
        }
    }

}
