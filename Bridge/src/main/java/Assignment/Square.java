package Assignment;

public class Square extends Shape {

    private String name = "square";
    public Square(ColorImp colorImp){
        super(colorImp);
    }

    @Override
    public void draw(){
        System.out.println("Drawing a " + name + ". ");
        super.draw(); // this is also from the shape class which gets the color from the implementation interface (Color)
    }
}
