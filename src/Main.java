public class Main {
    public static void main(String[] args){

        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Петушкова Марина Сергеевна", 1, 35700f);
        employees[1] = new Employee("Горелых Петр Васильевич", 2, 41850f);
        employees[2] = new Employee("Сушко Михаил Семенович", 3, 50900f);
        employees[3] = new Employee("Бегунов Максим Анатольевич", 3, 40500f);
        employees[4] = new Employee("Серебрякова Екатерина Андреевна", 4, 45820f);

        allData(employees);
        totalAndAverage(employees);
        min(employees);
        max(employees);
        fullName(employees);
    }
    public static void allData(Employee[] employees) {
        for (int e = 0; e < employees.length; e++) {
            if (employees[e] != null) {   // проверка на null-евые значения массива сотрудников
                System.out.println(employees[e]); // выведение всех данных по всем сотрудникам
            } else e++;
        }
        System.out.println();
    }
    public static void totalAndAverage(Employee[] employees) {
        int i = 0;
        float totalSalary = 0;
        for (int e = 0; e < employees.length; e++) {
            if (employees[e] != null) {   // проверка на null-евые значения массива сотрудников
                totalSalary = totalSalary + employees[e].getSalary(); // суммирование всех зарплат
                i++;
            } else e++;
        }
        System.out.println("Сумма всех зарплат составляет " + totalSalary + " руб");
        System.out.println();
        System.out.println("Средняя зарплата составляет " + totalSalary / i + " руб"); //расчет средней зарплаты сразу с выведением в консоль
        System.out.println();
    }
    public static void min(Employee[] employees) {
        float minSalary = Integer.MAX_VALUE;
        for (int e = 0; e < employees.length; e++) {
            if (employees[e] != null) {   // проверка на null-евые значения массива сотрудников
                if (employees[e].getSalary() < minSalary)
                    minSalary = employees[e].getSalary(); // расчет минимальной зарплаты
            } else e++;
        }
        System.out.println("Минимальная зарплата составляет " + minSalary + " руб");
        System.out.println();
    }
    public static void max(Employee[] employees) {
        float maxSalary = 0;
        for (int e = 0; e < employees.length; e++) {
            if (employees[e] != null) {   // проверка на null-евые значения массива сотрудников
                if (employees[e].getSalary() > maxSalary)
                    maxSalary = employees[e].getSalary(); // расчет максимальной зарплаты
            } else e++;
        }
        System.out.println("Максимальная зарплата составляет " + maxSalary + " руб");
        System.out.println();
    }
    public static void fullName(Employee[] employees) {
        for (int e = 0; e < employees.length; e++) {
            if (employees[e] != null) {   // проверка на null-евые значения массива сотрудников
                System.out.println("ФИО сотрудика: " + employees[e].getFullName()); // выведение ФИО по всем сотрудникам
            } else e++;
        }
    }
}