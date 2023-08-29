
public class Main {

    public static void main(String[] args) {

        // Instantiate a first car
        Car my1stCar = new Car("Fiat", "Multipla", "Yellow", 2002);
        // Invoke its methods
        my1stCar.startCar();
        my1stCar.accelerate(30);

        System.out.println("\n");

        // Instantiate a second car
        Car my2ndCar = new Car("BMW", "M4", "Grey", 2019);
        // Invoke its methods
        my2ndCar.startCar();
        my2ndCar.accelerate(40);

        // Show all cars that are existing so far:
        System.out.println("\nExisting car objects so far:\n" + Car.allCars);

    }

}