package Example;

public class SMSImp implements MessageImp{

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS message: " + message);
    }
}
