package Example;

// representing the Implementor interface
// declares the sendMessage() method, used to send messages
// has 3 implementations: EmailImp, SMSImp, InstantMessageImp
// each can send message using different medium
public interface MessageImp {

    void sendMessage(String message);
}
