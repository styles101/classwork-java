public class Car {
    // Private final variable to store the license plate
    private final String licensePlate;
    // Private variable to store the rental status
    private boolean isRented;

    // Constructor to initialize the license plate and set the car as available
    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
        this.isRented = false; // By default, the car is not rented
    }

    // Public method to rent the car
    public void rentCar() {
        if (!isRented) {
            isRented = true;
            System.out.println("Car with license plate " + licensePlate + " has been rented.");
        } else {
            System.out.println("Car with license plate " + licensePlate + " is already rented.");
        }
    }

    // Public method to return the car
    public void returnCar() {
        if (isRented) {
            isRented = false;
            System.out.println("Car with license plate " + licensePlate + " has been returned.");
        } else {
            System.out.println("Car with license plate " + licensePlate + " is already available.");
        }
    }

    // Getter method to check if the car is rented
    public boolean isCarRented() {
        return isRented;
    }

    // Main method to demonstrate the usage of Car class
    public static void main(String[] args) {
        // Create a new car with a license plate
        Car car = new Car("KDK 238H");

        // Check if the car is rented
        System.out.println("Is car rented? " + car.isCarRented());

        // Rent the car
        car.rentCar();
        System.out.println("Is car rented? " + car.isCarRented());

        // Try to rent the car again
        car.rentCar();

        // Return the car
        car.returnCar();
        System.out.println("Is car rented? " + car.isCarRented());

        // Try to return the car again
        car.returnCar();
    }
}