package Example;

public interface ShapeVisitor {

    // this interface declares various overloaded versions of the visit()
    // each taking a parameter object of a different type of shape (Line, Rectangle, Triangle)
    void visit(Line line);
    void visit(Rectangle rectangle);
    void visit(Triangle triangle);

}
