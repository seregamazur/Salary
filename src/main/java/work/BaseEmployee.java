package work;

public abstract class BaseEmployee{
    EmployeeInfo info;
    public BaseEmployee(EmployeeInfo info) {
        this.info = info;
    }
    public abstract double getSalary();
    public abstract void setSalary(int salary);

}
