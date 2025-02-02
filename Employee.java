import java.util.*;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(2001, "IT", 50000);
        e1.setSalary(55000);
        System.out.println("Employee ID: " + e1.employeeID);
        System.out.println("Department: " + e1.department);
    }
}
