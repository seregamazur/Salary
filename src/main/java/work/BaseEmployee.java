package work;

import java.io.Serializable;

public abstract class BaseEmployee implements Serializable {
    public BaseEmployee(){}
    public void setInfo(EmployeeInfo info) {
        this.info = info;
    }

    private EmployeeInfo info;

    protected BaseEmployee(EmployeeInfo info) {
        this.info = info;
    }

    public abstract double getSalary();

    public abstract void setSalary(double salary);

    public String getName() {
        return getInfo().getName();
    }

    public EmployeeInfo getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "ID:" + this.info.getID() + " " + "name:" +
                this.info.getName() + " " + "surname:" + this.info.getSurname() + " " +"salary:" +
                this.getSalary();
    }
}
