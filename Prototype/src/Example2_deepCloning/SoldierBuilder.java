package Example2_deepCloning;

public class SoldierBuilder {

    private Soldier soldier;

    public SoldierBuilder() {
        reset();
    }

    public void reset() {
        soldier = new Soldier();
    }

    public void addWeapon(String name) {
        soldier.addItem(new Weapon(name));
    }

    public void addGenericItem(String name) {
        soldier.addItem(new WearableItem(name));
    }

    public Soldier getSoldier() {
        Soldier builtSoldier = soldier; // deep clone the soldier
        reset(); // reset the builder for the next soldier
        return builtSoldier;
    }
}
