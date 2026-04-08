package Example;

public class Main {

    public  static void main(String[] args) {

        MessageImp imp = new EmailImp();
        Message message = new PersonalMessage(imp);
        message.sendMessage("Special offer for you! All items -20% only today!");

        imp = new SMSImp();
        message = new BusinessMessage(imp);
        message.sendMessage("Stock value increases by 21% this quarter.");

    }
}
