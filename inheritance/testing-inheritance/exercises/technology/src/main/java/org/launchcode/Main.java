package org.launchcode;

public class Main {
    public static void main(String[] args) {
        technology.Laptop myLaptop = new Laptop("Dell", "XPS 13", true, true);
        myLaptop.powerOn();
        myLaptop.openLid();

        SmartPhone myPhone = new SmartPhone("Apple", "iPhone 13", false, true);
        myPhone.powerOn();
        myPhone.makeCall("123-456-7890");
    }
}