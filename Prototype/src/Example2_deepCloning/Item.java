package Example2_deepCloning;

// is an class that serves as the base for different types of items
public abstract class Item implements Cloneable{

    private String name;

    public Item(String name) {
        this.name = name;
    }

    // shallow copying
    public Item clone(){
        try{
            return (Item) super.clone(); // because of this:
            // primitive field are copied by value
            // object references -> copied as references, not duplicated
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public String toString() {
        return name;
    }

}
