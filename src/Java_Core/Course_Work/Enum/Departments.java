package Java_Core.Course_Work.Enum;

public enum Departments {
    HRD(1), ACCOUNTING(2), PRODUCTION(3), SALES(4), ANALYTICS(5);

    private int id_dep;

    Departments(int id_dep) {
        this.id_dep = id_dep;
    }

    public int getId_dep() {
        return id_dep;
    }
}
