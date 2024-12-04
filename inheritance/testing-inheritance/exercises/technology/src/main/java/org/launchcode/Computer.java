package org.launchcode;

public class Computer {
    private String brand;
    private String model;
    private boolean needsCharge;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Computer(String brand, String model, boolean needsCharge) {
        super();
        this.brand = brand;
        this.model = model;
        this.needsCharge = needsCharge;

    }
}

