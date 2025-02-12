import java.util.Scanner;
//Employee class
class Employee {
    private String name;
    private double salary;

    //constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    //Method to display employee's details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }

    //Get for salary
    public double getSalary() {
        return salary;
    }
}

//SalaryCalculator class
class SalaryCalculator {

    //Method to calculate bonus
    public double calculateBonus(double salary) {
        //Calculation for the 10% bonus
        return salary * 0.10;
    }
}
public class MainApp {
    public static void main(String[] args){

        //creating an object of mainApp class
        Scanner scanner = new Scanner(System.in);
        //Taking user input

        System.out.println("Enter Employee name: ");
        String name = scanner.nextLine();
        System.out.println("Name: " + name);

        System.out.println("Enter employee salary: ");
        double salary= scanner.nextDouble();

        //Creating employee object
        Employee employee = new Employee(name, salary);

        //Creating SalaryCalculator object
        SalaryCalculator calculator = new SalaryCalculator();

        //Calculating bonus
        double bonus = calculator.calculateBonus(employee.getSalary());

        //Displaying employee details and Bonus
        employee.displayDetails();
        System.out.println("Bonus: " + bonus);

        scanner.close();

    }

}
