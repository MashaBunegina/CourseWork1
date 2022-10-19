public class CourseWork {
    private static final Employee[] employees = new Employee[10];

    public CourseWork() {
    }

    public static void main(String[] args) {
        employees[0] = new Employee(10000, "Иван Иванов", 1);
        employees[1] = new Employee(15000, "Петр Сидоров", 2);
        employees[2] = new Employee(20000, "Иван Петров", 3);
        employees[3] = new Employee(30000, "Сергей Иванов", 4);
        employees[4] = new Employee(40000, "Александр Ковалев", 5);
        System.out.println("Сумма всех зарплат:" + calculateSumSalary());
        System.out.println("Сотрудник с максимальной зарплатой:" + getEmployeeWithMaxSalary());
        System.out.println("Сотрудник с минимальной зарплатой:" + getEmployeeWithMinSalary());
        System.out.println("Средняя зарплата сотрудников: " + EmployeeAverageSalary());
    }

    public static int calculateSumSalary() {
        int sum = 0;
        Employee[] var1 = employees;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Employee employee = var1[var3];
            if (employee != null) {
                sum += employee.getSalary();
            }
        }

        return sum;
    }

    public static Employee getEmployeeWithMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null;
        Employee[] var2 = employees;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Employee employee = var2[var4];
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
        Employee[] var2 = employees;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Employee employee = var2[var4];
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                targetEmployee = employee;
            }
        }

        return targetEmployee;
    }

    private static double EmployeeAverageSalary() {
        double average = 0.0;
        Employee[] var2 = employees;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Employee employee = var2[var4];
            if (employee != null) {
                average += (double)employee.getSalary();
                average /= (double)employees.length;
            }
        }

        return average;
    }
}
