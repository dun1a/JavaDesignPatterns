package Assignment;

import java.util.Scanner;

public class GameCharacter {

    private static Scanner scanner = new Scanner(System.in);
    private String name;
    private LevelState level;
    private int experiencePoints;
    private int healthPoints;

    public GameCharacter(String name){
        this.name = name;
        this.experiencePoints = 0;
        this.level = new NoviceState(this);
        this.healthPoints = 90;
    }

    public void play(){
        while (true) {
            if (level == null) {
                // should never happen
                System.out.println("Example.Machine out of order");
                return;
            }
            level.action();
            if(level instanceof MasterState){
                System.out.println("Congratulations! You've reached Master level!");
                break;
            }
        }

    }
    public void setState(LevelState level){
        this.level = level;
    }

    public void train(){
        experiencePoints += 3;
        System.out.println("Training... Current XP: " + experiencePoints);
    }

    public void meditate(){
        if(healthPoints < 100){
            healthPoints += 5;
            System.out.println("Current health: " + healthPoints);
        }
        if(healthPoints > 100){
            healthPoints = 100;
            System.out.println("Current health: " + healthPoints);

        }
    }

    public void fight(){
        System.out.println("Fighting...");
        healthPoints -= 20;
        System.out.println("Current health: " + healthPoints);
        experiencePoints += 5;
        System.out.println("Current XP: " + experiencePoints);
    }

    public int readUserInput(String[] options){
        System.out.println("\nSelect an action:");
        for(int i = 0; i < options.length; i++){
            System.out.println((i+1) + ". " + options[i]);
        }
        return scanner.nextInt();
    }

    public int getExperiencePoints(){
        return experiencePoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
