package Java_Core.Course_Work.DAO;

import Java_Core.Course_Work.Employee;

public interface Statistics {
    Employee minSalary();

    Employee minSalaryDepartment(int department);

    Employee maxSalary();

    Employee maxSalaryDepartment(int department);


    void printFIOAllEmployee();

    void printInfoAllEmployee();

    void printInfoDepartment(int department);

    double amountWages();

    double amountWagesDepartment(int department);

    double avg();

    double avgDepartment(int department);

}
