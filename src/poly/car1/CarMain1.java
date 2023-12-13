package poly.car1;

public class CarMain1 {

    public static void main(String[] args) {
        K3Car k3Car = new K3Car();

        Driver driver = new Driver();
        driver.setCar(k3Car);
        driver.drive();

        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        // 새로운 차량을 추가해도 driver의 코드는 전혀 변경을 하지 않음
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
