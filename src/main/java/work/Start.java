package work;

import java.io.*;
import java.util.*;

public class Start implements Serializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new Start().start();
    }

    private void start() throws IOException, ClassNotFoundException {
        //creating new file where we would save out set
        File serial = new File("src/main/java/work/set.data");
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(serial));
        List<BaseEmployee> employees = addEmployees();
        //creating set
        NavigableSet<Object> database = new TreeSet<>().descendingSet();
        database.addAll(employees);
        os.writeObject(database);
        os.flush();
        os.close();
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(serial));
        Set<? extends BaseEmployee> emp = (Set<? extends BaseEmployee>) is.readObject();
        is.close();
        //sout first five employees
        emp.stream().limit(5).forEach(System.out::println);
        //sout last 3 employees
        emp.stream().skip(emp.size()-3).forEach(e -> System.out.println((e).getInfo().getID()));
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

    public Start() {
    }


}
