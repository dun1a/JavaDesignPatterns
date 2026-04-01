package Example;


// is responsible for using the BurgerBuilder interface to build a burger
// it is not aware of the specific type of burger operations
// it only provides methods to build a burger of any type, either a single or double format
public class Director {

    private BurgerBuilder builder;

    public Director(BurgerBuilder builder) {
        this.builder = builder;
    }

    public void constructSimpleBurger() {
        builder.addBun();
        builder.addPatty();
        builder.addCheese();
        builder.addSauce();
        builder.addVegetables();
        builder.addBun();
    }

    public void constructDoubleBurger() {
        builder.addBun();
        builder.addPatty();
        builder.addCheese();
        builder.addBun();
        builder.addPatty();
        builder.addCheese();
        builder.addSauce();
        builder.addVegetables();
        builder.addBun();
    }
}
