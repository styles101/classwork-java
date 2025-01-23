/*
This program computes the bonus given to the employess using the following criteria:
more than 10 years -12%
>=6 and <=10 - 10%
less than 6 years - 8%
 */
//allows the program to take user input
import java.util.Scanner;

//main class

public class Bonus {
    //main method
    public static void main(String[] args) {
        //creates a scanner object that is used to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the salary
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        //Ask the user to enter their years of services

        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();

        // This part Calculates bonus percentage based on years of service
        double bonusPercentage;
        if (yearsOfService > 10) {
            bonusPercentage = 12;
        } else if (yearsOfService >= 6) {
            bonusPercentage = 10;
        } else {
            bonusPercentage = 8;
        }

        // This part computes the net bonus amount
        double bonusAmount = (bonusPercentage / 100) * salary;

        // This part prints the net bonus amount
        System.out.printf("Your net bonus amount is: %.2f%n", bonusAmount);
    }
}
