package work;

import java.io.*;
import java.util.*;

public class Start {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File serial = new File("/GIT/softSalary/src/main/java/work/set.txt");
        ObjectOutputStream os  = new ObjectOutputStream(new FileOutputStream(serial));
        List<BaseEmployee> employees = addEmployees();
        EmployeesDatabase.getInstance().addAll(employees);
        EmployeesDatabase.getInstance().getEmployees().forEach(System.out::println);
        os.writeObject(EmployeesDatabase.getInstance().getEmployees());
        os.flush();
        os.close();
        ObjectInputStream is = new ObjectInputStream(new ObjectInputStream(new FileInputStream(serial)));
        Set<? extends BaseEmployee> emp  = (Set<? extends BaseEmployee>) is.readObject();
        emp.forEach(System.out::println);
        is.close();
    }

    private static List<BaseEmployee> addEmployees() {
        BaseEmployee employee = new FixedSalaryEmployee(new EmployeeInfo(1, "Serhiy", "Mazur"), 50);
        BaseEmployee employee1 = new HourRateEmployee(new EmployeeInfo(2, "Serho", "Mazur"), 10, 3);
        BaseEmployee employee2 = new HourRateEmployee(new EmployeeInfo(3, "Aleksa", "Mazur"), 10, 30);
        BaseEmployee employee4 = new HourRateEmployee(new EmployeeInfo(5, "Aaeksa", "Mazur"), 10, 30);
        BaseEmployee employee3 = new HourRateEmployee(new EmployeeInfo(4, "Bleksa", "Mazur"), 10, 30);
        List<BaseEmployee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee);
        employees.add(employee4);
        employees.add(employee2);
        employees.add(employee3);
        return employees;
    }


}
