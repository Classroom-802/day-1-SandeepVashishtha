package Medium;

public class Employee {
    private int employeeID;
    private String employeeName;
    private float employeeSalary;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        if (employeeID >= 1 && employeeID <= 1000000) {
            this.employeeID = employeeID;
        } else {
            throw new IllegalArgumentException("Invalid Employee ID");
        }
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        if (employeeName != null && employeeName.length() <= 50) {
            this.employeeName = employeeName;
        } else {
            throw new IllegalArgumentException("Invalid Employee Name");
        }
    }

    public float getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(float employeeSalary) {
        if (employeeSalary >= 1.0 && employeeSalary <= 10000000.0) {
            this.employeeSalary = employeeSalary;
        } else {
            throw new IllegalArgumentException("Invalid Employee Salary");
        }
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + getEmployeeID());
        System.out.println("Employee Name: " + getEmployeeName());
        System.out.println("Employee Salary: " + getEmployeeSalary());
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmployeeID(101);
        emp.setEmployeeName("John Doe");
        emp.setEmployeeSalary(75000.5f);
        emp.displayEmployeeDetails();
    }
}
