package Assignment;

public class Rectangle extends Shape{

    public Rectangle(ColorImp colorImp){
        super(colorImp);
    }

    @Override
    public String draw() {
        return "Drawing a rectangle. " + super.draw();
    }
}
