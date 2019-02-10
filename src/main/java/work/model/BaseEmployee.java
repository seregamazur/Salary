package work.model;

import java.io.Serializable;

public abstract class BaseEmployee implements Serializable, Comparable<BaseEmployee> {

    public void setInfo(EmployeeInfo info) {
        this.info = info;
    }

    private EmployeeInfo info;

    protected BaseEmployee(EmployeeInfo info) {
        this.info = info;
    }

    public abstract double getSalary();

    public abstract void setSalary(double salary);

    private String getName() {
        return getInfo().getName();
    }

    public EmployeeInfo getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "ID:" + this.info.getID() + " " + "name:" +
                this.info.getName() + " " + "surname:" + this.info.getSurname() + " " + "salary:" +
                this.getSalary();
    }

    @Override
    public int compareTo(BaseEmployee employee) {
        if (Double.compare(this.getSalary(), employee.getSalary()) == 0) {
            return this.getName().compareTo(employee.getName());
        } else return Double.compare(this.getSalary(), employee.getSalary());
    }
}
