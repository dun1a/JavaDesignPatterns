package Assignment;

public class ChangeColor implements ColorImp{

    String color;
    @Override
    public String fill(){
        return "Changing shape color to " + color + " color.";
    }

    public void setColor(String color){
        this.color = color;
    }


}
