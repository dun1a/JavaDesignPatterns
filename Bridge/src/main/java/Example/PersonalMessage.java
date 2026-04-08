package Example;

public class PersonalMessage extends Message{

    public PersonalMessage(MessageImp messageImp){
        super(messageImp);
    }

    public void sendMessage(String message){
        System.out.println("Sending personal message: ");
        super.sendMessage(message); // takes the implementation of the sendMessage() method from the MessageImp (Implementor interface) class and sends the message
        // we can access the implementation of the sendMessage() method from the MessageImp eventhough we dont extend the MessageImp class itself because we have a reference in the Message class to the MessageImp class
    }
}
