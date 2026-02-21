public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get an object of Circle and call its draw method.
        // The client code (Main) doesn't need to know how to build a Circle!
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        if (shape1 != null) {
            shape1.draw();
        } else {
            System.out.println("Error: Shape requested could not be identified.");
        }
    }
}
