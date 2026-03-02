package Example;

public abstract class CoffeeRecipe {

    // Template method
    // this class defines the steps it takes to make a coffee
    // the steps are implemented in the base class, but the addIngredients() step is abstract and can be implemented by subclasses as needed
    public final void makeCoffee() {
        boilWater();
        addCoffee();
        pourInCup();
        addIngredients(); // abstract method to be implemented by subclasses as needed
        serveCoffee();
    }

    // default implementation of boiling water
    public void boilWater(){
        System.out.println("Boiling water");
    }

    // Default implementation of adding coffee to water
    public void addCoffee(){
        System.out.println("Adding coffee to water");
    }

    // Defaukt implementation of pouring coffee to cup
    public void pourInCup(){
        System.out.println("Pouring prepared coffee into cup");
    }

    // Abstract method for adding ingredients (milk, sugar...), to be implemented by subclasses as needed
    public abstract void addIngredients();

    // Default implementation for serving coffee
    public void serveCoffee(){
        System.out.println("Serving coffee");
    }

}
