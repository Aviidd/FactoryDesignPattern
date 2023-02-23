package Shape;

public class Main {
    public static void main(String[] args) {
        // this line creates the factory
        ShapeFactory shapeFactory = new ShapeFactory();

        //this line does the object creation
        Shape shape = shapeFactory.getShape("Rectangle");
        shape.draw(); //calling the shape method
    }
}
