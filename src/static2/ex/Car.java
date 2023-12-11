package static2.ex;

public class Car {
    private static int totalCars = 0;
    private String name;

    public Car(String name) {
        System.out.println("name = " + name);
        this.name = name;
        totalCars++;
    }

    public static void showTotalCars() {
        System.out.println("totalCars = " + totalCars);
    }
}
