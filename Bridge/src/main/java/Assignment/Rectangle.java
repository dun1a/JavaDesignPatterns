package Assignment;

public class Rectangle extends Shape{

    private int length;
    private int width;

    private char widthMark = '-';
    private char lengthMark = '|';

    private String name = "rectangle";

    public Rectangle(ColorImp colorImp, int length, int width){
        super(colorImp);
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a " + name + ". ");
        System.out.println("This " + name + " has a length of " + length + " and a width of " + width + ". ");
        addVisual();
        super.draw(); // this is also from the shape class which gets the color from the implementation interface (Color)
    }

//    public void setColorImp(ColorImp colorImp){
//        super.getColor().fill();// this is from the shape class which gets the color from the implementation interface (Color)
//    }

    public void addVisual(){
        for (int i = 0; i < length; i++){
            System.out.println(lengthMark + " ");
        }
    }
}
