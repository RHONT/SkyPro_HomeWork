package Java_Core.Course_Work.ClassImpl;

import Java_Core.Course_Work.DAO.Statistics;
import Java_Core.Course_Work.Employee;
import Java_Core.Course_Work.EmployeeBook;
import Java_Core.Course_Work.Enum.MoreOrLess;

public class StatisticsImpl implements Statistics {

    private Employee[] book;
    EmployeeBook employeeBook;

    public StatisticsImpl(Employee[] book, EmployeeBook employeeBook) {
        this.book = book;
        this.employeeBook = employeeBook;
    }

    @Override
    public Employee minSalary() {
        return getEmployeeSalaryCompare(-1, MoreOrLess.LESS);
    }

    @Override
    public Employee minSalaryDepartment(int department) {
        return getEmployeeSalaryCompare(department, MoreOrLess.LESS);
    }

    @Override
    public Employee maxSalary() {
        return getEmployeeSalaryCompare(-1, MoreOrLess.MORE);
    }

    @Override
    public Employee maxSalaryDepartment(int department) {
        return getEmployeeSalaryCompare(department, MoreOrLess.MORE);
    }

    public Employee getEmployeeSalaryCompare(int department, MoreOrLess moreOrLess) {
        Employee forFindingSalaryMan = new Employee();
        double currenValue = 0;
        boolean findFirstNotNull = false;
        for (int i = 0; i < book.length; i++) {
            if (!findFirstNotNull) {
                if (book[i] != null && checkDepatrment(book[i].getDepartment(), department)) {
                    currenValue = book[i].getSalary();
                    forFindingSalaryMan = book[i];
                    findFirstNotNull = true;
                }
            } else {
                if (book[i] != null && checkDepatrment(book[i].getDepartment(), department)) {
                    double currentSalary = book[i].getSalary();

                    if (moreOrLess == MoreOrLess.MORE) {
                        if (currenValue < currentSalary) {
                            currenValue = currentSalary;
                            forFindingSalaryMan = book[i];
                        }
                    } else {
                        if (currenValue > currentSalary) {
                            currenValue = currentSalary;
                            forFindingSalaryMan = book[i];
                        }
                    }

                }
            }
        }
        if (forFindingSalaryMan.isEmpty()) {
            System.out.println("Сотрудник не найден!");
        }
        return forFindingSalaryMan;
    }

    // -1 передаем, если не хотим, чтобы метод работал с отделами
    // если не -1, значит будут производиться сравнения
    private boolean checkDepatrment(int compareDepart, int masterDepart) {
        return masterDepart == -1 || masterDepart == compareDepart;
    }

    @Override
    public void printFIOAllEmployee() {
        for (var element : book) {
            if (element != null) {
                System.out.println(element.getFio());
            }
        }

    }

    @Override
    public void printInfoAllEmployee() {
        for (var element : book) {
            if (element != null) {
                System.out.println(element);
            }
        }
    }

    @Override
    public void printInfoDepartment(int department) {
        for (var element : book) {
            if (element != null && element.getDepartment() == department) {
                System.out.println("id = " + element.getId() + " ФИО: " + element.getFio() + " Зарплата: " + element.getSalary());
            }
        }
    }

    @Override
    public double amountWages() {
        double sum = 0;
        for (var element : book) {
            if (element != null) {
                sum += element.getSalary();
            }
        }
        return sum;
    }

    @Override
    public double amountWagesDepartment(int department) {
        double sum = 0;
        int count = 0;
        for (var element : book) {
            if (element != null && element.getDepartment() == department) {
                sum += element.getSalary();
                count++;
            }
        }
        return sum / count;

    }

    @Override
    public double avg() {
        return amountWages() / employeeBook.getSizeArr();
    }

    @Override
    public double avgDepartment(int department) {
        double sum = 0;
        for (var element : book) {
            if (element != null && element.getDepartment() == department) {
                sum += element.getSalary();
            }
        }
        return sum;
    }
}
