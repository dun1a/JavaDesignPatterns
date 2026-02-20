package Example;

public class Main {

    public static void main(String[] args) {

        // basic orator:
        Orator orator = new BasicOrator();
        orator.say("Hello World");

        orator = new CapitalizingDecorator(new BasicOrator());
        orator.say("Hello World");

        orator = new ReversingDecorator(new CapitalizingDecorator(new BasicOrator()));
        orator.say("Hello World");
    }
}
