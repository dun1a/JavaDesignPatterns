package Assignment;

import java.util.Scanner;


public class RPSGame extends Game {

    Scanner scanner = new Scanner(System.in);

    private boolean gameOver = false;
    private int randomNUmber;
    private int winnerPlayer;

    @Override
    public void initializeGame(int numberOfPlayers) {
        randomNUmber = (int)(Math.random() * 100);
        System.out.println("\nSetting up a number guessing game for " + numberOfPlayers + " players.");
        System.out.println("Chosen number is between 0 and 100. Players will take turns to guess the number.");
    }

    @Override
    public boolean endOfGame() {
        return gameOver;
    }

    @Override
    public void playSingleTurn(int player) {

        System.out.println("\nPlayer " + (player+1) + ", enter your guess: ");
        int guess = scanner.nextInt();
        if(guess == randomNUmber) {
            gameOver = true;
            winnerPlayer = player;
        } else if(guess < randomNUmber) {
            System.out.println("Your guess is too low.");
        }else {
            System.out.println("Your guess is too high.");
        }
    }

    @Override
    public void displayWinner() {
        if(gameOver){
            System.out.println("\nWinner is Player " + (winnerPlayer+1) + "!");
        }
        System.out.println("Game over! The correct number was: " + randomNUmber);
    }

}
