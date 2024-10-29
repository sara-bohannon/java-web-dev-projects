public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 10.0);
        garfield.eat();
        System.out.println(garfield.isTired());
    }
    HouseCat spike = new HouseCat("Spike", 10.0);
}