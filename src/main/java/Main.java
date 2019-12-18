import oop.Car;
import oop.SportCar;
import oop.Van;
import oop.VanNotFoundException;


public class Main {
    public static void main(String[] args) throws Exception {
        Car car = new Car();
        try {
            car.go();
        } catch (Exception e) {
            if (e.getClass() == VanNotFoundException.class) {
                System.out.println("NO VANS");
            }
            if (e.getClass() == VanNotFoundException.class) {
                System.out.println("NO VANS");
            }
        }
    }
}
