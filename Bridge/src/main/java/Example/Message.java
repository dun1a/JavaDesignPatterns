package Example;

// representing an Abstraction class
// implemented as an abstract class
// has 2 implementations: BusinessMessage, PersonalMessage representing different types of messages (both are abstractions and don't contain real implementations)
public abstract class Message {

    // has a reference to the implementor object
    private MessageImp messageImp; // this lets us delegate the implementation of the methods to the desired implementation interface
    // makes it possible to change implementation of the message system without changing the abstraction

    public Message(MessageImp messageImp){
        this.messageImp = messageImp;
    }

    public MessageImp getMessageImp(){
        return messageImp;
    }

    // has methods that a message needs
    public void sendMessage(String message){
        messageImp.sendMessage(message);
    }


}
