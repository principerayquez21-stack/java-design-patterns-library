public class Main {
    public static void main(String[] args) {
        // --- FACTORY PATTERN SECTION ---
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        if (shape1 != null) shape1.draw();

        System.out.println("------------------------------------");

        // --- OBSERVER PATTERN SECTION ---
        Subject projectManager = new Subject();

        // Create observers with a "Code Quality" focus
        TechnicalReviewer leadAnalyst = new TechnicalReviewer("Lead Code Analyst");
        TechnicalReviewer qaBot = new TechnicalReviewer("Automated QA Bot");

        // Attach them to the subject
        projectManager.attach(leadAnalyst);
        projectManager.attach(qaBot);

        // Notify all reviewers of a status change
        System.out.println("Main: Deploying code update...");
        projectManager.notifyAllObservers("New Build v1.0.2");
    }
}
