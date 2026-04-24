package Assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mediator implements MessageMediator{

    private Map<String, ClientController> clients = new HashMap<>();
    private List<ClientController> clientsList = new ArrayList<>();

    @Override
    public void registerClient(ClientController client) {
        clients.put(client.getUserName(), client);
        clientsList.add(client);
    }

    @Override
    public void sendMessage(String message, ClientController sender, ClientController receiver) {
        if (receiver != null) {
            receiver.receiveMessage(message, sender);
        } else {
            System.out.println("Client " + receiver + " not found.");
        }
    }

    public Map<String, ClientController>getClients() {
        return clients;
    }

    public  List<ClientController> getClientsList() {
        return clientsList;
    }


}
