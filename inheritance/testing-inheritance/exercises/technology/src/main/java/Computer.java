package technology;

public class Computer {
    private String brand;
    private String model;
    private boolean needsCharge;

    public Computer(String brand, String model, boolean needsCharge) {
        super();
        this.brand = brand;
        this.model = model;
        this.needsCharge = needsCharge;
    }

    public void powerOn() {
        System.out.println("Powering on the computer.");
    }

    public void powerOff() {
        System.out.println("Powering off the computer.");
    }

    // Getters and other methods can be added here
}