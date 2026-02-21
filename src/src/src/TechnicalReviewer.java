public class TechnicalReviewer implements Observer {
    private String name;

    public TechnicalReviewer(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received update: " + message + " - Logic audit initiated.");
    }
}
