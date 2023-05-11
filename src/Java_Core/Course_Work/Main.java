package Java_Core.Course_Work;

import Java_Core.Course_Work.Enum.Departments;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.crud().add(new Employee("Иван Себайжко Петрович", 67_000, Departments.HRD));
        employeeBook.crud().add(new Employee("Лидия Куршетова Ибрагивовна", 55_000, Departments.ANALYTICS));
        employeeBook.crud().add(new Employee("Игнат Шелестко Васильевич", 89_000, Departments.PRODUCTION));
        employeeBook.crud().add(new Employee("Юрий Радонецкий Евгеньевич", 85_000, Departments.PRODUCTION));

        System.out.println(employeeBook.statistics().minSalary());
        System.out.println(employeeBook.statistics().maxSalary());
        System.out.println(employeeBook.statistics().maxSalaryDepartment(3));
        employeeBook.statistics().printFIOAllEmployee();
        System.out.println(employeeBook.statistics().avg());
        employeeBook.statistics().printInfoDepartment(3);
    }
}
