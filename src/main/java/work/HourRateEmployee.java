package work;

public class HourRateEmployee extends BaseEmployee {
    public int getHoursRate() {
        return hoursRate;
    }

    public void setHoursRate(int hoursRate) {
        this.hoursRate = hoursRate;
    }

    private int hoursRate;
    private double salary;

    public HourRateEmployee(EmployeeInfo info,int hoursRate,double salary) {
        super(info);
        this.hoursRate = hoursRate;
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary * hoursRate;
    }

}
