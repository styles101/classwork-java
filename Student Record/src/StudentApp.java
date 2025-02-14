/*
NAME: Allan Kibet
ADM: CT101/G/19975/23
*/
// Class StudentRecord
class StudentRecord {

    private String studentID;
    private String name;
    private String course;

    // Constructors
    public StudentRecord(String studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

// Main class
public class StudentApp {
    public static void main(String[] args) {
        // Prompt the user for input
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        // StudentRecord object
        StudentRecord student = new StudentRecord(studentID, name, course);

        // Display the student's details
        System.out.println("\nStudent Details:");
        student.displayInfo();

        // Close the scanner
        scanner.close();
    }
}