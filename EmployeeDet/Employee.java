

// File: Employee.java
public class Employee extends Person {
    private String empId;
    private double salary;

    public Employee(String name, String dobStr, String format, String empId, double salary) throws Exception {
        super(name, dobStr, format);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayName();
        displayAge();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: ₹" + salary);
    }

    public static void main(String[] args) {
        try {
            Employee emp = new Employee("Anushka", "2001-12-15", "yyyy-MM-dd", "EMP102", 60000);
            emp.displayEmployeeDetails();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}