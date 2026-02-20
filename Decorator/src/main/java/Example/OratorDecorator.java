package Example;

public class OratorDecorator implements Orator{

    // reference to the object being decorated:
    private Orator orator;

    public OratorDecorator(Orator orator){
        this.orator = orator;
    }

    @Override
    public void say(String message){
        orator.say(message);
    }
}
