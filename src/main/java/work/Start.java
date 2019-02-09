package work;

import java.util.SortedSet;
import java.util.TreeSet;

public class Start {
    public static void main(String[] args) {
        BaseEmployee employee = new FixedSalaryEmployee(new EmployeeInfo(1, "Serhiy", "Mazur"), 50);
        BaseEmployee employee1 = new HourRateEmployee(new EmployeeInfo(2, "Serho", "Mazur"), 10, 3);
        BaseEmployee employee2 = new HourRateEmployee(new EmployeeInfo(3, "Aleksa", "Mazur"), 10, 30);
        BaseEmployee employee3 = new HourRateEmployee(new EmployeeInfo(4, "Bleksa", "Mazur"), 10, 30);
        SortedSet<BaseEmployee> employees = new TreeSet<>(new SalaryComparator());
        employees.add(employee1);
        employees.add(employee);
        employees.add(employee2);
        employees.add(employee3);
        for (BaseEmployee e : employees
        ) {
            System.out.println(e.getInfo().getName() + " " + e.getSalary());

        }

    }

}
