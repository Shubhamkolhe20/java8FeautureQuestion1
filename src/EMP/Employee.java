package EMP;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private  String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(String firstName, String lastName, double salary, String department, String department1) {
        this.department = department1;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EMP.Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(String firstName, String lastName, double salary, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;


        this.department = department;
    }
}

