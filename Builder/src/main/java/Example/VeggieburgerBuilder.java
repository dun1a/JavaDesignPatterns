package Example;

// concrete builder class, implementing the BurgerBuilder interface
// has necessary methods to build a burger of the corresponding type
public class VeggieburgerBuilder implements BurgerBuilder {

    private Burger burger;

    public VeggieburgerBuilder(){
        this.burger = new Burger();
    }

    @Override
    public void addBun() {
        burger.addIngredient(new Ingredient("Layer of whole wheat bun"));
    }

    @Override
    public void addPatty() {
        burger.addIngredient(new Ingredient("Veggie patty"));

    }

    @Override
    public void addCheese() {
        burger.addIngredient(new Ingredient("Vegan cheese"));
    }

    @Override
    public void addSauce() {
        burger.addIngredient(new Ingredient("Vegan mayo"));
    }

    @Override
    public void addVegetables() {
        burger.addIngredient(new Ingredient("Lettuce"));
        burger.addIngredient(new Ingredient("Tomato"));
        burger.addIngredient(new Ingredient("Onion"));
    }

    @Override
    public Burger getBurger() {
        return burger;
    }
}
