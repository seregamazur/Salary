package work;

import java.util.Comparator;

public abstract class BaseEmployee {
    public void setInfo(EmployeeInfo info) {
        this.info = info;
    }

    private EmployeeInfo info;
    private Double salary;

    protected BaseEmployee(EmployeeInfo info) {
        this.info = info;
    }

    public abstract Double getSalary();

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public EmployeeInfo getInfo() {
        return info;
    }



}
