package technology;

public class Laptop {
    private boolean hasTouchScreen;

    public Laptop(String brand, String model, boolean needsCharge, boolean hasTouchScreen) {
        super(brand, model, needsCharge);
        this.hasTouchScreen = hasTouchScreen;
    }

    public void openLid() {
        System.out.println("Opening laptop lid.");
    }

    // Getters and other methods can be added here
}