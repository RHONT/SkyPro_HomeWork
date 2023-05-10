package Java_Core.Course_Work.ClassImpl;

import Java_Core.Course_Work.DAO.CRUD;
import Java_Core.Course_Work.Employee;
import Java_Core.Course_Work.EmployeeBook;

public class CRUDImpl implements CRUD {
    private Employee[] book;
    private EmployeeBook employeeBook;

    public CRUDImpl(Employee[] book, EmployeeBook employeeBook) {
        this.book = book;
        this.employeeBook = employeeBook;
    }

    @Override
    public void add(Employee employee) {
        if (employeeBook.getSizeArr() == 10) {
            System.out.println("Невозможно добавить сотрудника! Книга заполнена!");
            return;
        }
        if (employee.getSalary() == 0 || employee.getDepartment() == 0) {
            System.out.println("Невозможно добавить \"пустого\" сотрудника");
        }
        for (int i = 0; i < book.length; i++) {
            if (book[i] == null) {
                book[i] = employee;
                employeeBook.upSize();
                break;
            }

        }
    }

    @Override
    public void indexPay(double percent) {
        for (int i = 0; i < book.length; i++) {
            if (book[i] != null) {
                double plusSalary = (book[i].getSalary() * percent) + book[i].getSalary();
                book[i].setSalary(plusSalary);
            }

        }
    }

    @Override
    public void indexPayDepartment(double percent, int department) {
        for (int i = 0; i < book.length; i++) {
            if (book[i] != null && book[i].getDepartment() == department) {
                double plusSalary = (book[i].getSalary() * percent) + book[i].getSalary();
                book[i].setSalary(plusSalary);
            }

        }
    }
}
