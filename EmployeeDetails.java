import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double empSalary;
    String empContactNumber;

    // Constructor to initialize employee details
    public Employee(int empId, String empName, double empSalary, String empContactNumber) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empContactNumber = empContactNumber;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + empSalary);
        System.out.println("Employee Contact Number: " + empContactNumber);
        System.out.println("-------------------------------");
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[5];  // Array to store 5 employees

        // Input details for 5 employees
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Enter Employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            System.out.print("Enter Employee Name: ");
            String empName = scanner.nextLine();

            System.out.print("Enter Employee Salary: ");
            double empSalary = scanner.nextDouble();
            scanner.nextLine();  // Consume newline character

            System.out.print("Enter Employee Contact Number: ");
            String empContactNumber = scanner.nextLine();

            // Create an Employee object and store it in the array
            employees[i] = new Employee(empId, empName, empSalary, empContactNumber);
        }

        // Display details for all employees
        System.out.println("\nEmployee Details:");
        for (Employee emp : employees) {
            emp.displayEmployeeDetails();
        }

        scanner.close();
    }
}
