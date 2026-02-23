package Assignment;

public class NoviceState  extends LevelState {

    public NoviceState(GameCharacter character){
        super(character);
        this.getGameCharacter().setState(this);
        System.out.println("\nStarting Novice level.");
    }

    @Override
    public void action() {
        String[] options = {"Train"};
        int choice = getGameCharacter().readUserInput(options);
        switch(choice){
            case 1:
                getGameCharacter().train();
                if(getGameCharacter().getExperiencePoints() >= 10){
                    System.out.println("User has gained 10 XP, you will be leveled up to Intermediate level!");
                    this.getGameCharacter().setState(new IntermediateState(this.getGameCharacter()));
                    break;
                }
        }
    }
}
