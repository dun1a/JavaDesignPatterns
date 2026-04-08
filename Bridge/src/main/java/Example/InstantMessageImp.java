package Example;

public class InstantMessageImp implements MessageImp{


    @Override
    public void sendMessage(String message) {
        System.out.println("Sending an instant message: " + message);
    }
}
