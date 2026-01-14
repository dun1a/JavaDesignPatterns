package Example;

import java.util.Scanner;

public abstract class Game {

    // main game loop
    public void play(){
        Scanner scanner = new Scanner(System.in);
        Room room;
        do {
            // factory method here (createRoom())
            // Game class does not know which room will be created (it is determined in the subclass)
            room = createRoom();
            room.enter();
            System.out.println("Press enter to move to the next room. (Press 'q' to quit)");
        } while(!scanner.nextLine().equals("q"));
    }

    // any subclass of the parent class Game MUST implement createRoom();
    public abstract Room createRoom();

}
