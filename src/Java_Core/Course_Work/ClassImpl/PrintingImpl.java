package Java_Core.Course_Work.ClassImpl;

import Java_Core.Course_Work.DAO.Printing;
import Java_Core.Course_Work.Employee;
import Java_Core.Course_Work.EmployeeBook;
import Java_Core.Course_Work.Enum.Departments;

public class PrintingImpl implements Printing {
    private Employee[] book;
    EmployeeBook employeeBook;

    public PrintingImpl(Employee[] book, EmployeeBook employeeBook) {
        this.book = book;
        this.employeeBook = employeeBook;
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
    public void printInfoDepartment(Departments department) {
        for (var element : book) {
            if (element != null && element.getDepartmentId() == department.getId_dep()) {
                System.out.println("id = " + element.getId() + " ФИО: " + element.getFio() + " Зарплата: " + element.getSalary());
            }
        }
    }

    @Override
    public void printFioAllDepartment() {
        for (int i = 0; i < 6; i++) {
            test(Departments.values()[i]);

        }
    }

    private void test(Departments departments) {
        boolean printDepartment = false;
        for (int i = 0; i < book.length; i++) {
            if (!printDepartment) {
                if (book[i] != null && book[i].getDepartment() == departments) {
                    System.out.println(book[i].getDepartment());
                    System.out.println("----" + book[i].getFio());
                    printDepartment = true;
                }
            } else {
                if (book[i] != null && book[i].getDepartment() == departments) {
                    System.out.println("----" + book[i].getFio());
                }

            }
        }
    }
}
