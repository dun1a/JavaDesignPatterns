package Example;

// is the Builder interface
// has methods to create a burger
// also has a method to deliver the burger -> returns a Burger object
public interface BurgerBuilder {

    void addBun();
    void addPatty();
    void addCheese();
    void addSauce();
    void addVegetables();
    Burger getBurger();
}
