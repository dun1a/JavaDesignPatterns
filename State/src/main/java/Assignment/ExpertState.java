package Assignment;

public class ExpertState extends LevelState {
    public ExpertState(GameCharacter gameCharacter) {
        super(gameCharacter);
        this.getGameCharacter().setState(this);
        System.out.println("\nEntering expert level!");
    }

    @Override
    void action() {
        String[] options = {"Train", "Meditate", "Fight"};
        int choice = getGameCharacter().readUserInput(options);
        switch (choice) {
            case 1:
                getGameCharacter().train();
                if(getGameCharacter().getExperiencePoints() >= 50) {
                    System.out.println("User has gained 40 XP, you will level up to Master level!");
                    break;
                }
            case 2:
                getGameCharacter().meditate();

                break;
            case 3:
                getGameCharacter().fight();
                if(getGameCharacter().getExperiencePoints() >= 50) {
                    System.out.println("User has gained 50 XP, you will level up to Master level!");
                    this.getGameCharacter().setState(new MasterState(this.getGameCharacter()));
                    break;
                }

        }

    }
}
