package Assignment;

public class Triangle extends Shape {

    private String name = "triangle";
    public Triangle(ColorImp colorImp){
        super(colorImp); // from the shape class
    }

    @Override
    public void draw(){
        System.out.println("Drawing a " + name + ". ");
        super.draw(); // this is also from the shape class which gets the color from the implementation interface (Color)
     }
}
