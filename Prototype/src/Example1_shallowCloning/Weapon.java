package Example1_shallowCloning;


// also implements the Prototype interface and represents a weapon with a type
public class Weapon implements Prototype {

    private String type;

    public Weapon(String type){
        this.type = type;
    }

    @Override
    public Weapon clone() {
        return new Weapon(this.type);
    }

    @Override
    public String toString() {
        return "Weapon type: " + type;
    }
}
