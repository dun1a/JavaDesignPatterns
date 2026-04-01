package Example;

public class Main {

    public static void main(String[] args) {

        BurgerBuilder builder = new CheeseBurgerBuilder();
        Director director = new Director(builder);
        director.constructSimpleBurger();
        Burger burger = builder.getBurger();
        System.out.println(burger);
    }
}
