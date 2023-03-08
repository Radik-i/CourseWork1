public class Main {
    public static void main(String[] args) {
        Employee[] employ = new Employee[10];
        employ[0] = new Employee("Петушкова Марина Сергеевна", 1, 35700f);
        employ[1] = new Employee("Горелых Петр Васильевич", 2, 41850f);
        employ[2] = new Employee("Сушко Михаил Семенович", 3, 50900f);
        employ[3] = new Employee("Бегунов Максим Анатольевич", 3, 40500f);
        employ[4] = new Employee("Серебрякова Екатерина Андреевна", 4, 45820f);

        float totalSalary =  0;
        float minSalary = 999999999;
        float maxSalary = 0;
        int i = 0; //счетчик ненулевых значений массива сотрудников

        for (int e = 0; e < employ.length; e++) {

            if (employ[e] != null) {   // проверка на null-евые значения массива сотрудников
                System.out.println(employ[e]); // выведение всех данных по всем сотрудникам
                totalSalary = totalSalary + employ[e].getSalary();  // расчет суммарной зарплаты
                if (employ[e].getSalary() < minSalary) minSalary = employ[e].getSalary(); // расчет минимальной зарплаты
                if (employ[e].getSalary() > maxSalary)
                    maxSalary = employ[e].getSalary(); // расчет максимальной зарплаты
                i++;
            } else e++;
        }
        System.out.println();
        System.out.println("Сумма всех зарплат составляет " + totalSalary + " руб");
        System.out.println("Минимальная зарплата составляет " + minSalary + " руб");
        System.out.println("Максимальная зарплата составляет " + maxSalary + " руб");
        System.out.println("Средняя зарплата составляет " + totalSalary / i + " руб"); //расчет средней зарплаты сразу с выведением в консоль
        System.out.println();

        for (int e = 0; e < employ.length; e++) {
            if (employ[e] != null) {   // проверка на null-евые значения массива сотрудников
                System.out.println("ФИО сотрудика: " + employ[e].getFullName()); // выведение ФИО по всем сотрудникам
            } else e++;
        }
    }
}


