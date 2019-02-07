package work;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Start {
    public static void main(String[] args) {
        BaseEmployee employee = new FixedSalaryEmployee(new EmployeeInfo(1, "Serhiy", "Mazur"), 5000);
        BaseEmployee employee1 = new HourRateEmployee(new EmployeeInfo(2, "Serho", "Mazur"), 10, 300);
        TreeSet<BaseEmployee> employees = new TreeSet<>((Comparator<BaseEmployee>) BaseEmployee::compareSalary);
        employees.add(employee1);
        employees.add(employee);
        TreeSet<BaseEmployee> intsReverse = (TreeSet<BaseEmployee>)employees.descendingSet();
        System.out.println(employees);

    }

}
