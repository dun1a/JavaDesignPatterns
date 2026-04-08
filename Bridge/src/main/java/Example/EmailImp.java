package Example;

public class EmailImp implements MessageImp{

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email message: " + message);
    }
}
