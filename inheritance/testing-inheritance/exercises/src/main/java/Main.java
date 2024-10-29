public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 10.0);
        System.out.println(garfield.noise());
        System.out.println(garfield.isSatisfied());
        System.out.println(garfield.purr());
    }
}
