package Example2_deepCloning;

// another subclass of Item
// represents wearable gear
public class WearableItem extends Item implements Cloneable{


    public WearableItem(String name) {
        super(name);
    }

    @Override
    public WearableItem clone() {
        return (WearableItem) super.clone(); // shallow copy is sufficient for WearableItem

        }
}
