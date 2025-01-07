import java.util.Objects;

public class Employee {
    private final String fullName;
    private int department;
    private int salary;
    private static int idCounter = 1;
    private final int id;

    public Employee(String fullName, int department, int salary) {
        id = idCounter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }
    public String getFullName() {
        return fullName;
    }
    public int getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return id + ". " + fullName + ", " + department + ", " + salary;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && id == employee.id && Objects.equals(fullName, employee.fullName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, id);
    }
}
