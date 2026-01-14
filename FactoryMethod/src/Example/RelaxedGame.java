package Example;

public class RelaxedGame extends Game {
    @Override
    public Room createRoom() {
        return new LovelyRoom();
    }
}
