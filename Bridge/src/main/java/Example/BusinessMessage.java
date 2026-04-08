package Example;

// is an implementation of Abstraction class (Message)
// represents a specific type of message (business message)
// is still an abstraction and doesn't contain the actual implementation of the send() method
public class BusinessMessage extends Message {

    public BusinessMessage(MessageImp messageImp){
        super(messageImp);
    }

    public void sendMessage(String message){
        System.out.println("Sending business message: ");
        super.sendMessage(message); // takes the implementation of the sendMessage() method from the MessageImp (Implementor interface) class and sends the message
    }

}
