package Assignment;

public abstract class Shape {

    private ColorImp colorImp;
    private String name;

    public Shape(ColorImp colorImp){
        this.colorImp = colorImp;
    }

    public ColorImp getColor(){
        return colorImp;
    }

    public void draw(){
        System.out.println(colorImp.fill());
       // return colorImp.fill(); // this is what gets added after the shape has been drawn
    }
}
