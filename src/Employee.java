public class Employee {
    private String fullName;
    private int department;
    private float salary;
    private static int counter;
    private int id;

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public static int getCounter() {
        return counter;
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

    public Employee(String fio, int dept, float Salary) {
        fullName = fio;
        department = dept;
        salary = Salary;
        id = ++counter;
    }

    @Override
    public String toString() {
        return "id: " + id + " ФИО: " + fullName + " Отдел: " + department + " Зарплата: " + salary;
    }
}
