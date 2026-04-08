package Assignment;

public class Square extends Shape {

    public Square(ColorImp colorImp){
        super(colorImp);
    }

    @Override
    public String draw() {
        return "Drawing a square. " + super.draw();
    }
}
