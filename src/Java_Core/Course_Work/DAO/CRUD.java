package Java_Core.Course_Work.DAO;

import Java_Core.Course_Work.Employee;
import Java_Core.Course_Work.Enum.Departments;

public interface CRUD {
    void add(Employee employee);

    void indexPay(double percent);

    void indexPayDepartment(double percent, Departments departments);

    boolean remove(int id);

    boolean changeSalary(String fio, double newSalary);

    boolean changeDepartment(String fio, Departments departments);

    public Employee findById(int id);

}
