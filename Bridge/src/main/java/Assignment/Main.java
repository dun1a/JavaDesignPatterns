package Assignment;

public class Main {

    public static void main(String[] args) {

        ColorImp colorImp = new Purple();
        Shape shape = new Square(colorImp);
        shape.draw();

        colorImp = new Blue();
        shape = new Triangle(colorImp);
        shape.draw();

//        colorImp = new ChangeColor();
//        ((ChangeColor) colorImp).setColor("red");
//        shape.draw();

        colorImp = new Purple();
        shape = new Rectangle(colorImp, 12, 5);
        shape.draw();
    }
}
