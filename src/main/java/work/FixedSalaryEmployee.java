package work;

public class FixedSalaryEmployee extends BaseEmployee {
    private double salary;

    public FixedSalaryEmployee(EmployeeInfo info) {
        super(info);
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;

    }
}
