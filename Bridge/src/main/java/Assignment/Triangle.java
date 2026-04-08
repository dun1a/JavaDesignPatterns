package Assignment;

public class Triangle extends Shape {

    public Triangle(ColorImp colorImp){
        super(colorImp); // from the shape class
    }

    @Override
    public String draw(){
        return "Drawing a triangle. " + super.draw(); // this is also from the shape class which gets the color from the implementation interface (Color)
     }
}
