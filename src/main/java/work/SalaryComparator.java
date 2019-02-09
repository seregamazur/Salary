package work;

import java.util.Comparator;
    class SalaryComparator implements Comparator<BaseEmployee> {

        @Override
        public int compare(BaseEmployee o1, BaseEmployee o2) {
            if(Double.compare(o1.getSalary(), o2.getSalary()) != 0)
            return Double.compare(o1.getSalary(),o2.getSalary());
            else{
                return o1.getInfo().getName().compareTo(o2.getInfo().getName());
            }
        }

    }


