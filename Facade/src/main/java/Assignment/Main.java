package Assignment;

public class Main {

    public static void main(String[] args){
        FacadeInterface facade = new Facade();

        System.out.println("Testing with Chuck Norris API...");
        try{
            String joke = facade.getAttributeValueFromJson("https://api.chucknorris.io/jokes/random", "value");
            System.out.println(joke);
        } catch (IllegalArgumentException | java.io.IOException e) {
            e.printStackTrace();
        }

        System.out.println("Testing with another API...");
        try{
            String joke = facade.getAttributeValueFromJson("https://api.fxratesapi.com/latest", "date");
            System.out.println(joke);
        } catch (IllegalArgumentException | java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
