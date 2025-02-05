import java.util.Scanner;

//Student class
class Student {

    //Attributes
    private String name;
    private double marks;

    //constructor to initialize the attributes
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

        //Method to display student's details
        public void displayDetails() {
            System.out.println("Student Name: " + name);
            System.out.println("Marks: " + marks);
        }
        //Get marks
    public double getMarks() {
        return marks;
    }
}

//GradeCalculator class
class GradeCalculator {
    //Method to calculate grades
    public String calculateGrade(Double marks) {
        if (marks >= 90) {
            return "A";
        }else if (marks >=75) {
            return "B";
        }else if (marks >=50) {
            return "C";
        }else {
            return "D";
        }
    }
}
//MainApp class
public class MainApp {

    //Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Take the user input
        System.out.println("Enter Student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Students marks: ");
        double marks = scanner.nextDouble();

        //Creating student object
        Student student = new Student(name, marks);

        //Creating GradeCalculator object
        GradeCalculator calculator = new GradeCalculator();

        //Calculating grade
        String grade = calculator.calculateGrade(student.getMarks());

        //Display student details and grade
        student.displayDetails();
        System.out.println("Grade: " + grade);

        scanner.close();

    }
}
