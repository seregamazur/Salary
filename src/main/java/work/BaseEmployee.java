package work;

import java.util.Comparator;

public abstract class BaseEmployee {
    public void setInfo(EmployeeInfo info) {
        this.info = info;
    }

    private EmployeeInfo info;
    private double salary;

    protected BaseEmployee(EmployeeInfo info) {
        this.info = info;
    }

    public abstract double getSalary();

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public EmployeeInfo getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "ID " + this.info.getID() + "name " +
                this.info.getName() + "surname " +this.info.getSurname()
                + "salary:" + this.salary;
    }
}
