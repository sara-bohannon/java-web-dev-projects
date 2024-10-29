package org.launchcode;

public class SmartPhone extends Computer {
    private boolean has5G;

    public SmartPhone(String brand, String model, boolean needsCharge, boolean has5G) {
        super(brand, model, needsCharge);
        this.has5G = has5G;
    }

    public void makeCall(String number) {
        System.out.println("Calling " + number + " from smartphone.");
    }

    // Getters and other methods can be added here
}