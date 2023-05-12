package Java_Core.Course_Work.DAO;

import Java_Core.Course_Work.Employee;
import Java_Core.Course_Work.Enum.Departments;

public interface Statistics {
    Employee minSalary();

    Employee minSalaryDepartment(Departments departments);

    Employee maxSalary();

    Employee maxSalaryDepartment(Departments departments);

    double amountWages();

    double amountWagesDepartment(Departments departments);

    double avg();

    double avgDepartment(Departments departments);

    void lessSalaryAll(double value);

    void moreSalaryAll(double value);

}
