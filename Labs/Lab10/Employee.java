package Labs.Lab10;

public class Employee extends Person{
    private int employeeID;
    private int salary;

    public Employee(String name, String phone, int employeeID, int salary) {
        super(name, phone);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + " " + employeeID + " " + salary;
    }
}