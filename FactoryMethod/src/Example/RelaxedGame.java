package Example;

// is a concrete creator subclass of the Game class,
// it implements the createRoom() method to create and return an instance of the LovelyRoom class
public class RelaxedGame extends Game {
    @Override
    public Room createRoom() {
        return new LovelyRoom();
    }
}
