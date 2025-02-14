/*
NAME: Allan Kibet
ADM: CT101/G/19975/23
*/
// Base class to store vehicle details
class Vehicle {

    private String brand;
    private String model;
    private int year;

    // Constructor
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Subclass that inherits from Vehicle
class Car extends Vehicle {
    // Additional field for fuel type
    private String fuelType;

    // Constructor
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year); // Call the constructor of the parent class
        this.fuelType = fuelType;
    }

    // Override the displayDetails method to include fuel type
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the displayDetails method of the parent class
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Main class
public class Showroom {
    public static void main(String[] args) {
        // Prompt the user for input
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter Brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter Model: ");
        String model = scanner.nextLine();

        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Fuel Type: ");
        String fuelType = scanner.nextLine();

        // Instantiate a Car object with user-provided data
        Car car = new Car(brand, model, year, fuelType);

        // Display the car's details
        System.out.println("\nCar Details:");
        car.displayDetails();

        // Close the scanner
        scanner.close();
    }
}