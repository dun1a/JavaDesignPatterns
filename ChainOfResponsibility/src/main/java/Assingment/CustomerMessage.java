package Assingment;

public class CustomerMessage {

    enum feedbackType{
        COMPENSATION,
        CONTACT,
        SUGGESTION
    };

    private feedbackType messageType;
    private String messageContent;
    private String senderEmail;

    public CustomerMessage(String messageType, String messageContent, String senderEmail) {
        this.messageContent = messageContent;
        this.senderEmail = senderEmail;
        this.messageType = feedbackType.valueOf(messageType);
    }

    public  String getMessageContent() {
        return messageContent;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public feedbackType getFeedbackType() {
        return messageType;
    }

}
