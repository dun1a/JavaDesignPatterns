package Example2_deepCloning;


public class Main {

    public static void main(String[] args) {

        final int GROUP_SIZE = 8;

        // creat soldier using the builder pattern
        Director director = new Director();
        SoldierBuilder builder = new SoldierBuilder();
        director.ConstructInfantry(builder);
        Soldier soldier1 = builder.getSoldier();

        System.out.println("Original Soldier: " + soldier1);

        // create a group of cloned soldiers
        for(int i = 0; i < GROUP_SIZE; i++) {
            Soldier clonedSoldier = soldier1.clone();
            System.out.println("Cloned Soldier " + (i + 1) + ": " + clonedSoldier);
        }

    }
}
