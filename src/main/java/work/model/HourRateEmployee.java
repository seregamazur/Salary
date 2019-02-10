package work.model;

import work.model.BaseEmployee;
import work.model.EmployeeInfo;

import java.io.Serializable;

public class HourRateEmployee extends BaseEmployee implements Serializable {
    public int getHoursRate() {
        return hoursRate;
    }

    public void setHoursRate(int hoursRate) {
        this.hoursRate = hoursRate;
    }

    private int hoursRate;
    private double salary;

    public HourRateEmployee(EmployeeInfo info, int hoursRate, double salary) {
        super(info);
        this.hoursRate = hoursRate;
        this.salary = salary * this.hoursRate;
    }

    @Override
    public double getSalary() {
        return salary * hoursRate;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }


}
