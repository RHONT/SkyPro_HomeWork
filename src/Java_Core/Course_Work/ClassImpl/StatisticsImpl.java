package Java_Core.Course_Work.ClassImpl;

import Java_Core.Course_Work.DAO.Statistics;
import Java_Core.Course_Work.Employee;
import Java_Core.Course_Work.EmployeeBook;
import Java_Core.Course_Work.Enum.Departments;
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
    public Employee minSalaryDepartment(Departments departments) {
        return getEmployeeSalaryCompare(departments.getId_dep(), MoreOrLess.LESS);
    }

    @Override
    public Employee maxSalary() {
        return getEmployeeSalaryCompare(-1, MoreOrLess.MORE);
    }

    @Override
    public Employee maxSalaryDepartment(Departments departments) {
        return getEmployeeSalaryCompare(departments.getId_dep(), MoreOrLess.MORE);
    }

    // Вспомогательный метод для использования в четырех выше стоящих методах
    // Департаменты опциональны
    // enum MoreOrLess, помогает направить условия в нужное русло
    private Employee getEmployeeSalaryCompare(int department, MoreOrLess moreOrLess) {
        Employee forFindingSalaryMan = new Employee();
        double currenValue = 0;
        boolean findFirstNotNull = false;
        for (int i = 0; i < book.length; i++) {
            if (!findFirstNotNull) {
                if (book[i] != null && checkDepatrment(book[i].getDepartmentId(), department)) {
                    currenValue = book[i].getSalary();
                    forFindingSalaryMan = book[i];
                    findFirstNotNull = true;
                }
            } else {
                if (book[i] != null && checkDepatrment(book[i].getDepartmentId(), department)) {
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
            return new Employee();
        }
        return forFindingSalaryMan;
    }

    // -1 передаем, если не хотим, чтобы метод работал с отделами
    // если не -1, значит будут производиться сравнения
    private boolean checkDepatrment(int compareDepart, int masterDepart) {
        return masterDepart == -1 || masterDepart == compareDepart;
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
    public double amountWagesDepartment(Departments departments) {
        double sum = 0;
        int count = 0;
        for (var element : book) {
            if (element != null && element.getDepartmentId() == departments.getId_dep()) {
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
    public double avgDepartment(Departments departments) {
        double sum = 0;
        int numberOfPeople = 0;
        for (var element : book) {
            if (element != null && element.getDepartmentId() == departments.getId_dep()) {
                sum += element.getSalary();
                numberOfPeople++;
            }
        }
        return sum / numberOfPeople;
    }

    @Override
    public void lessSalaryAll(double value) {
        defineMoreOrLess(MoreOrLess.LESS, value);
    }

    @Override
    public void moreSalaryAll(double value) {
        defineMoreOrLess(MoreOrLess.MORE, value);
    }

    private void defineMoreOrLess(MoreOrLess moreOrLess, double value) {
        for (int i = 0; i < book.length; i++) {
            if (book[i] != null) {
                if (moreOrLess == MoreOrLess.LESS) {
                    if (book[i].getSalary() < value) {
                        System.out.println("[ " + book[i].getId() + " " + book[i].getFio() + " " + book[i].getSalary() + " ]");
                    }
                } else {
                    if (book[i].getSalary() >= value) {
                        System.out.println("[ " + book[i].getId() + " " + book[i].getFio() + " " + book[i].getSalary() + " ]");
                    }
                }
            }

        }
    }
}
