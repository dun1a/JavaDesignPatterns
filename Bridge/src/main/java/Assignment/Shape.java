package Assignment;

public abstract class Shape {

    private ColorImp colorImp;

    public Shape(ColorImp colorImp){
        this.colorImp = colorImp;
    }

    public ColorImp getColor(){
        return colorImp;
    }

    public String draw(){
        return colorImp.fill(); // this is what gets added after the shape has been drawn
    }
}
