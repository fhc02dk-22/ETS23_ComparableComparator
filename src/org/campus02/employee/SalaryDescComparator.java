package org.campus02.employee;

import java.util.Comparator;

public class SalaryDescComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee, Employee t1) {
        return Double.compare(t1.getSalary(), employee.getSalary());
    }
}
