package Assignment;

public class Main {

    public static void main(String[] args) {

        ColorImp colorImp = new Purple();
        Shape shape = new Square(colorImp);
        System.out.println(shape.draw());

        colorImp = new Blue();
        shape = new Triangle(colorImp);
        System.out.println(shape.draw());

        colorImp = new ChangeColor();
        shape = new Triangle(colorImp);
        ((ChangeColor) colorImp).setColor("Green");
        System.out.println(shape.draw());
    }
}
