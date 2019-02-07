package work;

public abstract class BaseEmployee {
    private EmployeeInfo info;
    private double salary;

    protected BaseEmployee(EmployeeInfo info) {
        this.info = info;
    }

    public abstract double getSalary();

    public  void setSalary(double salary){
        this.salary = salary;
    }
    public BaseEmployee compareSalary(BaseEmployee baseEmployee2){
        if (this.salary > baseEmployee2.salary) return this; else return baseEmployee2;
    }

}
