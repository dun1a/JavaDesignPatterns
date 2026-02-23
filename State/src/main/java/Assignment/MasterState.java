package Assignment;

public class MasterState extends LevelState {
    public MasterState(GameCharacter gameCharacter) {
        super(gameCharacter);
        this.getGameCharacter().setState(this);
        System.out.println("\nEntering master level!");
    }

    @Override
    void action() {
        System.out.println("You have reached the master level! You have won the game!");
    }

}
