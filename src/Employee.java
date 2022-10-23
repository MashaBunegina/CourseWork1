public class Employee {
    private int salary;
    private String fullName;
    private int department;
    private int id;
    private static int counter = 0;

    public Employee(int salary, String fullName, int department) {
        this.salary = salary;
        this.fullName = fullName;
        this.id = counter++;
        this.department = department;
    }
        private String name;
         private String surname;
         private String patronymic;
    public Employee(String fullName, String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;

    }
    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getId() {
        return this.id;
    }
    public int getDepartment() {
        return this.department;
    }

    public String toString() {
        return "Employee{ salary  " + this.salary + ", fullName  " + this.fullName + ", id = " + this.id + " department " + this.department + "}";}

    }

