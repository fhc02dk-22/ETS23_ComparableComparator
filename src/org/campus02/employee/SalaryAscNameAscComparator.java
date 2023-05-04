package org.campus02.employee;

import java.util.Comparator;

public class SalaryAscNameAscComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee, Employee t1) {
        int result = Double.compare(employee.getSalary(), t1.getSalary());
        if (result == 0) {
            return employee.getName().compareTo(t1.getName());
        }
        return result;
    }
}
