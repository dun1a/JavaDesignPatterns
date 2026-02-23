package Assignment;

public class IntermediateState extends LevelState {

    public IntermediateState(GameCharacter gameCharacter) {
        super(gameCharacter);
         this.getGameCharacter().setState(this);
        System.out.println("\nEntering intermediate state!");
    }

    @Override
    void action() {
        String[] options = {"Train", "Meditate"};
        int choice = getGameCharacter().readUserInput(options);
        switch (choice) {
            case 1:
                getGameCharacter().train();
                if(getGameCharacter().getExperiencePoints() >= 20) {
                    System.out.println("User has gained 20 XP, you will level up to Intermediate level!");
                    this.getGameCharacter().setState(new ExpertState(this.getGameCharacter()));
                    break;
                }

            case 2:
                getGameCharacter().meditate();
                break;
        }

    }
}
