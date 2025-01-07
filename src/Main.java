public class Main {

    private final static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Андреев Андрей Андреевич", 1, 35000);
        employees[1] = new Employee("Борисов Борис Борисович", 2, 45000);
        employees[2] = new Employee("Васильев Василий Васильевич", 3, 55000);
        employees[3] = new Employee("Григорьев Григорий Григорьевич", 4, 65000);
        employees[4] = new Employee("Иванов Иван Иванович", 5, 75000);
        employees[5] = new Employee("Кириллов Кирилл Кириллович", 1, 85000);
        employees[6] = new Employee("Леонидов Леонид Леонидович", 2, 95000);
        employees[7] = new Employee("Михайлов Михаил Махайлович", 3, 105000);
        employees[8] = new Employee("Николаев Николай Николаевич", 4, 115000);
        employees[9] = new Employee("Олегов Олег Олегович", 5, 125000);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("Сумма затрат на ЗП в месяц - " + calculateSumOfSalaries() + " рублей.");
        System.out.println("Сотрудник с минимальной ЗП - " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной ЗП - " + findEmployeeWithMaxSalary());
        System.out.println("Средняя ЗП - " + calculateAverageOfSalaries() + " рублей.");
        printFullName();
    }
    private static int calculateSumOfSalaries() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
    private static Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employeeWithMinSalary == null || employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }
    private static Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employeeWithMaxSalary == null || employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }
    private static double calculateAverageOfSalaries() {
        return (double) calculateSumOfSalaries() / employees.length;
    }
    private static void printFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}