public class ShapeFactory {
    // Use getShape method to get object of type shape 
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }		
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        // Future shapes like RECTANGLE or SQUARE will be added here
        return null;
    }
}
