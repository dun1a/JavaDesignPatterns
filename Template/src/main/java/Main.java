import Assignment.RPSGame;
import Example.CoffeeRecipe;
import Example.EspressoRecipe;
import Example.LatteRecipe;

import java.sql.SQLOutput;

public class Main {

        public static void main(String[] args) {


//            System.out.println("Making espresso...");
//            CoffeeRecipe espressoMachine = new EspressoRecipe();
//            espressoMachine.makeCoffee();
//
//            System.out.println("\nMaking Latte...");
//            CoffeeRecipe latteMachine = new LatteRecipe();
//            latteMachine.makeCoffee();


            RPSGame game = new RPSGame();
            game.play(2);

        }
}
