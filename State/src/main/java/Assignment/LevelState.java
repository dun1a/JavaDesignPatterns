package Assignment;

public abstract class LevelState {

    private GameCharacter gameCharacter; // has reference/instance variable to the GameCharacter

    public LevelState(GameCharacter gamecharacter){
        this.gameCharacter = gamecharacter;
    }

    public GameCharacter getGameCharacter(){
        return gameCharacter;
    }

    abstract void action();

}
