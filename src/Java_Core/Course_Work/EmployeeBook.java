package Java_Core.Course_Work;

import Java_Core.Course_Work.ClassImpl.CRUDImpl;
import Java_Core.Course_Work.ClassImpl.StatisticsImpl;
import Java_Core.Course_Work.DAO.CRUD;
import Java_Core.Course_Work.DAO.Statistics;

public class EmployeeBook {
    private static final int SIZE = 10;
    private int sizeArr = 0;
    private Employee[] book = new Employee[SIZE];

    private Statistics statistics = new StatisticsImpl(this.book, this);
    private CRUD crud = new CRUDImpl(this.book, this);

    public void upSize() {
        this.sizeArr++;
    }

    public void downSize() {
        this.sizeArr--;
    }

    public Statistics statistics() {
        return statistics;
    }

    public CRUD crud() {
        return crud;
    }

    public int getSizeArr() {
        return this.sizeArr;
    }

    public void setSizeArr(int sizeArr) {
        this.sizeArr = sizeArr;
    }
}
