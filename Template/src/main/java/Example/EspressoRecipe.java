package Example;

public class EspressoRecipe extends CoffeeRecipe {

    // this class overrides the addIngredients method, pourInCup() method and serveCoffee()

    @Override
    public void addIngredients() {
        System.out.println("Espresso is prepared without additives");
    }

    @Override
    public void pourInCup() {
        System.out.println("Pouring espresso into a small cup");
    }

    @Override
    public void serveCoffee() {
        System.out.println("Serving espresso.");
    }

    private void serveWithChocolate(){
        System.out.println("Serving espresso with chocolate.");
    }
}
