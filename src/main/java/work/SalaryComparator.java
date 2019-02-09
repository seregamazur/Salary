package work;

import java.util.Comparator;
    class SalaryComparator implements Comparator<BaseEmployee> {

        @Override
        public int compare(BaseEmployee o1, BaseEmployee o2) {
            return o1.getSalary().compareTo(o2.getSalary());
        }
    }


