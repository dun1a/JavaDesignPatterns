package Example;

// this class calculates the area of different shapes by implementing the ShapeVisitor interface
// this is a CONCRETE CLASS that implements the ShapeVisitor interface
public class AreaCalculatorVisitor implements ShapeVisitor{


    @Override
    public void visit(Line line) {
        System.out.println("Line has no area.");
    }

    @Override
    public void visit(Rectangle rectangle) {
        int area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Area of Rectangle: " + area);
    }

    @Override
    public void visit(Triangle triangle) {
        double area = Math.abs(0.5 * (triangle.getX1() * (triangle.getY2() - triangle.getY3()) + triangle.getX2() * (triangle.getY3() - triangle.getY1()) + triangle.getX3() * (triangle.getY1() - triangle.getY2())));
        System.out.println("Triangle area: " + area);
    }
}
