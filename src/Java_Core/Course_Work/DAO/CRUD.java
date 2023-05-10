package Java_Core.Course_Work.DAO;

import Java_Core.Course_Work.Employee;

public interface CRUD {
    void add(Employee employee);

    void indexPay(double percent);

    void indexPayDepartment(double percent, int department);
}
