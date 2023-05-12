package Java_Core.Course_Work.ClassImpl;

import Java_Core.Course_Work.DAO.CRUD;
import Java_Core.Course_Work.Employee;
import Java_Core.Course_Work.EmployeeBook;
import Java_Core.Course_Work.Enum.Departments;

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
        if (employee.isEmpty()) {
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
                double plusSalary = (book[i].getSalary() * (percent / 100)) + book[i].getSalary();
                book[i].setSalary(plusSalary);
            }

        }
    }

    @Override
    public void indexPayDepartment(double percent, Departments department) {
        for (int i = 0; i < book.length; i++) {
            if (book[i] != null && book[i].getDepartmentId() == department.getId_dep()) {
                double plusSalary = (book[i].getSalary() * (percent / 100)) + book[i].getSalary();
                book[i].setSalary(plusSalary);
            }

        }
    }

    @Override
    public boolean remove(int id) {
        if (employeeBook.getSizeArr() == 0) {
            return false;
        }

        boolean deleted = false;
        for (int i = 0; i < book.length; i++) {
            if (book[i] != null) {
                if (book[i].getId() == id) {
                    book[i] = null;
                    employeeBook.downSize();
                    deleted = true;
                    break;
                }
            }
        }
        return deleted;
    }

    @Override
    public boolean changeSalary(String fio, double newSalary) {
        Employee employee = findByFIO(fio);
        double oldSalary;
        if (!employee.isEmpty()) {
            oldSalary = employee.getSalary();
            employee.setSalary(newSalary);
        } else
            return false;

        return oldSalary != employee.getSalary();
    }

    @Override
    public boolean changeDepartment(String fio, Departments departments) {
        Employee employee = findByFIO(fio);
        Departments passDepartment;

        if (!employee.isEmpty()) {
            passDepartment = employee.getDepartment();
            employee.setDepartment(departments);
        } else return false;

        return passDepartment != employee.getDepartment();
    }

    @Override
    public Employee findById(int id) {
        for (int i = 0; i < book.length; i++) {
            if (book[i] != null) {
                if (book[i].getId() == id) {
                    return book[i];
                }
            }
        }
        return new Employee();
    }

    private Employee findByFIO(String fio) {
        for (int i = 0; i < book.length; i++) {
            if (book[i] != null) {
                if (book[i].getFio().equals(fio)) {
                    return book[i];
                }
            }

        }
        return new Employee();
    }


}
