package Example2_deepCloning;

public class Director {

    public void ConstructInfantry(SoldierBuilder builder) {

        builder.addGenericItem("Armor");
        builder.addWeapon("Rifle");
        builder.addGenericItem("Helmet");
    }
}
