package Assignment;

public interface MessageMediator {

    // should keep a list of all clients
    // receives messages from clients and forwards them to the appropriate clients
    void sendMessage(String message, ClientController sender, ClientController receiver);
    void registerClient(ClientController client);

}
