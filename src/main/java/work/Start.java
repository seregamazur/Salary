package work;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Start {
    public static void main(String[] args) {
        Comparator<BaseEmployee> comparatorBySalary = Comparator.comparing(BaseEmployee::getSalary);
        Comparator<BaseEmployee> comparatorByName = Comparator.comparing(BaseEmployee::getName).reversed();

        BaseEmployee employee = new FixedSalaryEmployee(new EmployeeInfo(1, "Serhiy", "Mazur"), 50);
        BaseEmployee employee1 = new HourRateEmployee(new EmployeeInfo(2, "Serho", "Mazur"), 10, 3);
        BaseEmployee employee2 = new HourRateEmployee(new EmployeeInfo(3, "Aleksa", "Mazur"), 10, 30);
        BaseEmployee employee4 = new HourRateEmployee(new EmployeeInfo(5, "Aaeksa", "Mazur"), 10, 30);
        BaseEmployee employee3 = new HourRateEmployee(new EmployeeInfo(4, "Bleksa", "Mazur"), 10, 30);
        SortedSet<BaseEmployee> employees = new TreeSet<>(comparatorBySalary.thenComparing(comparatorByName)).descendingSet();
        employees.add(employee1);
        employees.add(employee);
        employees.add(employee4);
        employees.add(employee2);
        employees.add(employee3);
        employees.forEach(System.out::println);

    }

}
