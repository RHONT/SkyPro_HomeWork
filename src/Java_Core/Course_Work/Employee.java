package Java_Core.Course_Work;

import Java_Core.Course_Work.Enum.Departments;

import java.util.Objects;

public class Employee {
    private static int increment;
    private int id;
    private String fio;
    private double salary;
    private Departments department;

    public Employee() {
    }

    public Employee(String fio, double salary, Departments department) {
        this.id = increment++;
        this.fio = fio;
        this.salary = salary;
        this.department = department;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department.getId_dep();
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    public boolean isEmpty() {
        return this.salary == 0 || this.getFio() == null || this.department.getId_dep() == 0;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(employee.salary, salary) == 0 && department == employee.department && Objects.equals(fio, employee.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fio, salary, department);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
}
