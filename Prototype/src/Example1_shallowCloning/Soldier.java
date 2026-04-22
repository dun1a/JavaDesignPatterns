package Example1_shallowCloning;


// implements the Prototype interface and represents a soldier with a weapon.
public class Soldier implements Prototype{

    private Weapon weapon;

    public Soldier(Weapon weapon){
        this.weapon = weapon;
    }
    @Override
    public Soldier clone() {
        // shallow copy: creates a new soldier but shares the same weapon reference
        return new Soldier(this.weapon);
    }

    @Override
    public String toString() {
        return "Soldier with " + weapon;
    }
}
