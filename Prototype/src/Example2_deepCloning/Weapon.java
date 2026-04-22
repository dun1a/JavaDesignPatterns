package Example2_deepCloning;

// subclass of Item
public class Weapon extends Item implements Cloneable{

    private static int idCounter = 0;
    private int id;

    public Weapon(String name){
        super(name);
        this.id = idCounter++;
    }

    @Override
    public Weapon clone() {
        Weapon cloned = (Weapon) super.clone(); // shallow copy of the weapon
        cloned.id = idCounter++; // assign a new unique ID to the cloned weapon
        return cloned;
    }

    @Override
    public String toString() {
        return "Weapon{id=" + id + ", name=" + super.toString() + "}";
    }

}
