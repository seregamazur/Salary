package work;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EmployeesDatabase implements Serializable {
    private final static  transient Comparator<BaseEmployee> comparatorBySalary = Comparator.comparing(BaseEmployee::getSalary);
    private final static transient Comparator<BaseEmployee> comparatorByName = Comparator.comparing(BaseEmployee::getName).reversed();

    private static Set<BaseEmployee> employees = new TreeSet<>(comparatorBySalary.thenComparing(comparatorByName)).descendingSet();
    private static EmployeesDatabase database;
    public EmployeesDatabase(){}
    public static EmployeesDatabase getInstance() {
        if (database == null)
            return new EmployeesDatabase();
        return database;
    }

    public Set<BaseEmployee> getEmployees() {
        return employees;
    }

    public void add(BaseEmployee employee) {
        getEmployees().add(employee);
    }

    public void addAll(Collection<? extends BaseEmployee> collection) {
        employees.addAll(collection);
    }

}
