package work;

import work.model.BaseEmployee;
import work.model.EmployeeInfo;
import work.model.FixedSalaryEmployee;
import work.model.HourRateEmployee;
import work.utils.Serializator;

import java.io.*;
import java.util.*;

public class Start implements Serializable {

    public static void main(String[] args)  {
        File serial = new File("src/main/java/work/set.data");
        Serializator.work(addEmployees(),serial);
    }

    private static List<BaseEmployee> addEmployees() {
        BaseEmployee employee = new FixedSalaryEmployee(new EmployeeInfo(1, "Serhiy", "Mazur"), 50);
        BaseEmployee employee1 = new HourRateEmployee(new EmployeeInfo(2, "Serho", "Mazur"), 10, 3);
        BaseEmployee employee2 = new HourRateEmployee(new EmployeeInfo(3, "Aleksa", "Mazur"), 10, 30);
        BaseEmployee employee4 = new HourRateEmployee(new EmployeeInfo(5, "Aaeksa", "Mazur"), 10, 30);
        BaseEmployee employee3 = new HourRateEmployee(new EmployeeInfo(4, "Bleksa", "Mazur"), 10, 30);
        BaseEmployee employee5 = new HourRateEmployee(new EmployeeInfo(10, "Cleksa", "Mazur"), 10, 30);
        List<BaseEmployee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee);
        employees.add(employee4);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee5);
        return employees;
    }


}
