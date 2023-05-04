package org.campus02.employee;

import java.util.Comparator;

public class DepartmentAscNameDescComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee, Employee t1) {
        int result = employee.getDepartment().compareTo(t1.getDepartment());
        if (result == 0) {
            return t1.getName().compareTo(employee.getName());
        }
        return result;
    }
}
