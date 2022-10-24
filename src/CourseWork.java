public class CourseWork {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee(10000, "Иван Иванов", 1);
        employees[1] = new Employee(15000, "Петр Сидоров", 2);
        employees[2] = new Employee(20000, "Иван Петров", 3);
        employees[3] = new Employee(30000, "Сергей Иванов", 4);
        employees[4] = new Employee(40000, "Александр Ковалев", 5);

        System.out.println("Сумма всех зарплат:" + calculateSumSalary());
        System.out.println("Сотрудник с максимальной зарплатой:" + getEmployeeWithMaxSalary());
        System.out.println("Сотрудник с минимальной зарплатой:" + getEmployeeWithMinSalary());
        System.out.println("Средняя зарплата сотрудников: " + employeeAverageSalary());
        System.out.println("ФИО:" + printFIO());
        System.out.println(printAllEmployees());

    }
    public static int calculateSumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee getEmployeeWithMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    public static Employee getEmployeeWithMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    public static int employeeAverageSalary() {
        int sum = 0;
        int amount = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
                amount++;
            }
        }
        return sum / amount;
    }
    public static char printFIO(){
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
        return 0;
    }
    public static int printAllEmployees(){
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
        return 0;
    }
    }
