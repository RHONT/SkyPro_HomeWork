package Java_Core.Course_Work;

import Java_Core.Course_Work.Enum.Departments;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.crud().add(new Employee("Иван Себайжко Петрович", 70_000, Departments.HRD));
        employeeBook.crud().add(new Employee("Лидия Куршетова Ибрагивовна", 55_000, Departments.HRD));
        employeeBook.crud().add(new Employee("Игнат Шелестко Васильевич", 89_000, Departments.PRODUCTION));
        employeeBook.crud().add(new Employee("Юрий Радонецкий Евгеньевич", 125_000, Departments.ACCOUNTING));
        employeeBook.crud().add(new Employee("Жардоно Бруно Петрович", 110_000, Departments.PRODUCTION));
        employeeBook.crud().add(new Employee("Генадий Святославович Кривогородских", 85_000, Departments.ANALYTICS));
        employeeBook.crud().add(new Employee("Рада Иванова Сергеевна", 250_000, Departments.SALES));
        employeeBook.crud().add(new Employee("Юрий Миган Офсетович", 185_000, Departments.SALES));
        employeeBook.crud().add(new Employee("Кара Мира Пуритовна", 58_000, Departments.SALES));
        employeeBook.crud().add(new Employee("Певец Радонец OverDose", 300_000, Departments.SALES));

        message("EASY LEVEL");
        message("Получить список всех сотрудников:");
        employeeBook.print().printInfoAllEmployee();
        delimiter();

        message("Посчитать сумму затрат на зарплаты:");
        message(employeeBook.statistics().amountWages());
        delimiter();

        message("Найти сотрудника с минимальной заплатой. ( 55_000 )");
        message(employeeBook.statistics().minSalary());
        delimiter();

        message("Найти сотрудника с максимальной заплатой. ( 300_000 )");
        message(employeeBook.statistics().maxSalary());
        delimiter();

        message("Подсчитать среднее значение зарплат.");
        System.out.printf("%.2f \n", (employeeBook.statistics().avg()));
        delimiter();

        message("Cписок Ф. И. О. всех сотрудников.");
        employeeBook.print().printFIOAllEmployee();
        delimiter();

        ////////////////////////////////////////////////////////////////

        message("NORMAL LEVEL");
        message("Проиндексировать зарплату " +
                "(вызвать изменение зарплат у всех сотрудников на величину аргумента в %).");

        employeeBook.crud().indexPay(10);
        employeeBook.print().printInfoAllEmployee();
        delimiter();

        message("Методы работы с отделами");
        message("Сотрудника с минимальной зарплатой.");
        message(employeeBook.statistics().minSalaryDepartment(Departments.SALES));
        delimiter();

        message("Сотрудника с максимальной зарплатой.");
        message(employeeBook.statistics().maxSalaryDepartment(Departments.SALES));
        delimiter();

        message("Среднюю зарплату по отделу");
        System.out.printf("%.2f \n", employeeBook.statistics().avgDepartment(Departments.SALES));
        delimiter();

        message("Сумму затрат на зарплату по отделу.");
        message(employeeBook.statistics().amountWagesDepartment(Departments.PRODUCTION));
        delimiter();

        message("Проиндексировать зарплату всех сотрудников отдела на процент");
        message("Напечатать всех сотрудников отдела (все данные, кроме отдела)");
        employeeBook.crud().indexPayDepartment(5, Departments.SALES);
        employeeBook.print().printInfoDepartment(Departments.SALES);
        delimiter();

        message("Получить в качестве параметра число и найти:");
        message("Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).");
        employeeBook.statistics().lessSalaryAll(100000);

        System.out.println();

        message("Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).");
        employeeBook.statistics().moreSalaryAll(100000);
        delimiter();

        //////////////////////////////////////////////////
        message("HARD LEVEL");

        message("Добавить нового сотрудника/удалить/изменить зарплату/отдел");

        employeeBook.crud().add(new Employee("Он Не Сможет", 10, Departments.NONE));
        message("очистим место");

        System.out.println("Удалился? Результат:");
        message(employeeBook.crud().remove(9));
        // вдруг NPE поймаем (не поймаем, результат выведется false, как неудачная операция)
        message(employeeBook.crud().remove(9));

        message("Повторим попытку");

        employeeBook.crud().add(new Employee("Место Нашлось Мне!", 10, Departments.NONE));
        employeeBook.print().printInfoAllEmployee();

        message("Назначим заработную плату и отдел");

        employeeBook.crud().changeSalary("Место Нашлось Мне!", 94000);
        employeeBook.crud().changeDepartment("Место Нашлось Мне!", Departments.PRODUCTION);

        message("Проверяем");
        message(employeeBook.crud().findById(11));

        delimiter();

        message("Получить Ф. И. О. всех сотрудников по отделам (напечатать список отделов и их сотрудников).");
        employeeBook.print().printFioAllDepartment();
        delimiter();
    }

    public static void delimiter() {
        System.out.println("--".repeat(30) + "\n");
    }

    public static void message(Object object) {
        System.out.println(object.toString() + "\n");
    }

}
