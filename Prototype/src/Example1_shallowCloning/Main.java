package Example1_shallowCloning;

public class Main {

    public static void main(String[] args) {
        // Create a weapon and a soldier

        Weapon weapon = new Weapon("Rifle");
        Soldier soldier1 = new Soldier(weapon);

        // Clone the soldier;
        Soldier soldier2 = soldier1.clone();

        // Display the original and cloned soldiers
        System.out.println("Original Soldier: " + soldier1);
        System.out.println("Cloned Soldier: " + soldier2);

    }
}
