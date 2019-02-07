package work;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        FixedSalaryEmployee employee = new FixedSalaryEmployee(new EmployeeInfo(1,"Serhiy","Mazur"));
        employee.setSalary(5000);
        employee.getSalary();

    }
}
