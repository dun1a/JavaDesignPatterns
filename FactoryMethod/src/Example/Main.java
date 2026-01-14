package Example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the room games!");
        System.out.print("Choose a game to play: (Horror or Relaxing): ");
        if(scanner.next().equals("Horror")){
            Game game = new HorrorGame();
            game.play();
        }else if(scanner.next().equals("Relaxing")){
            Game game = new RelaxedGame();
            game.play();
        }
        else{
            System.out.println("Invalid game choice.");
        }


    }
}
