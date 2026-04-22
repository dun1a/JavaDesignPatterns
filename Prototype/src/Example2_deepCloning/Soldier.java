package Example2_deepCloning;

import java.util.ArrayList;
import java.util.List;

// represents a soldier with a list of items and implements deep cloning using Java clone() method
public class Soldier implements Cloneable {

    private List<Item> items;

    // a soldier is created with an empty list of items
    public Soldier() {
        this.items = new ArrayList<>();
    }

    // adding items to the soldier's inventory
    public void addItem(Item item) {
        items.add(item);
    }

    //
    @Override
    public Soldier clone() {
            Soldier clonedSoldier = new Soldier(); // manually creates a new Soldier
            clonedSoldier.items = new ArrayList<>(); // also creates an empty list for the new soldier cloned

            // deep copy: creates a new list and clones each item in the original list
            for (Item item : this.items) { // loops through the original soldier's items
                clonedSoldier.items.add(item.clone()); // deep clone each item and adds it to the cloned soldier's list
            }
            return clonedSoldier;
    }

    @Override
    public String toString() {
        return "Soldier with items: " + items;
    }
}


