package Example;

// is a concrete product of the factory method pattern, it implements the Room interface and provides its own implementation of the enter() method
public class LovelyRoom implements Room{

    @Override
    public void enter() {
        System.out.println("You have entered a lovely room filled with beautiful decorations and a cozy atmosphere.");
    }
}
