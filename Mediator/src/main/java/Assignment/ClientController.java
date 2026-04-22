package Assignment;

public class ClientController {

    private String name;

    public ClientController(String name) {
        this.name = name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void receiveMessage(String message, ClientController sender) {

    }

    public void setUserName(String username) {
        this.name = username;
    }
}
