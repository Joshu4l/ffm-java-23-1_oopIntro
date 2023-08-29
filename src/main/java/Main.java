
public class Main {

    public static void main(String[] args) {

        // Instantiate a car
        Car my1stCar = new Car("Fiat", "Multipla", "Yellow", 2002);

        // Invoke its methods
        my1stCar.startCar();
        my1stCar.accelerate(30);

        System.out.println(Car.allCars);

    }

}