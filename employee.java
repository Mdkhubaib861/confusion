import java.util.Scanner;

public class Employee {
    int empId;
    String empName;
    double empSalary;
    String empContactNumber;

    public Employee(int empId, String empName, double empSalary, String empContactNumber) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empContactNumber = empContactNumber;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + empSalary);
        System.out.println("Employee Contact Number: " + empContactNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        double empSalary = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Employee Contact Number: ");
        String empContactNumber = scanner.nextLine();

        Employee employee = new Employee(empId, empName, empSalary, empContactNumber);
        employee.displayEmployeeDetails();

        scanner.close();
    }
}
