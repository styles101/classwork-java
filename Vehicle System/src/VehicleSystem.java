/*
NAME: Allan Kibet
ADM: CT101/G/19975/23

*/
//Class Vehicle
class Vehicle {
    String brand;
    int speed;

    //constructors
    Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    //Method to increase speed
    void accelerate(int increase) {
        speed += increase;
    }

    //Method to decrease speed but not below zero
    void brake(int decrease) {
        speed = Math.max(speed - decrease, 0);
    }

    //Method to display details
    void showDetails() {
        System.out.println("Vehicle brand: " + brand + ", Speed: "+ speed);
    }
}

//Subclass car inheriting from vehicle
class  Car extends Vehicle {

    //Attribute for car
    int fuelLevel;

    //constructor
    Car(String brand, int speed, int fuelLevel) {
        super(brand, speed);
        this.fuelLevel = fuelLevel;
    }

    //Method to refuel the car
    void refuel(int amount) {
        fuelLevel = Math.min(fuelLevel + amount, 100);
    }

    //Overriding showDetails method to display car-specific details
    @Override
    void showDetails(){
        System.out.println("Car brand: " + brand + ", Speed: " + speed + ", Fuel Level: " + fuelLevel + "%");

    }
}

//Subclass Bike Inheriting from Vehicle
class Bike extends Vehicle {

    //attribute for bike
    boolean helmetOn;

    //Constructor to initialize brand, speed, and helmet status
    Bike(String brand, int speed, boolean helmetOn) {
        super(brand, speed);
        this.helmetOn = helmetOn;
    }

    //Method to wear a helmet
    void wearHelmet() {
        helmetOn = true;
    }

    //Overriding showDetails method to display bike-specific details

    @Override
    void showDetails() {
        System.out.println("Bike brand: " + brand + ", Speed: " + speed + ", Helmet on: " + helmetOn);
    }
}

//Main class
public class VehicleSystem {
    public static void main(String[] args) {

        // Car object
        Car car = new Car("Toyota", 60, 50);
        // Perform actions on the car
        car.accelerate(20); // Increase speed by 20
        car.brake(30); // Decrease speed by 30
        car.refuel(30); // Refuel by 30, up to a max of 100
        car.showDetails(); // Display car details

        // Instantiate a Bike object
        Bike bike = new Bike("Yamaha", 40, false);
        // Perform actions on the bike
        bike.accelerate(15); // Increase speed by 15
        bike.brake(10); // Decrease speed by 10
        bike.wearHelmet(); // Wear a helmet
        bike.showDetails(); // Display bike details
    }
}
