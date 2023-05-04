package org.campus02.employee;

import java.util.Arrays;

public class EmployeeSortDemo {

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(5, "max", 3_000, "Development"),
                new Employee(2, "max", 3_000, "Research"),
                new Employee(4, "susi", 2_500, "Sales"),
                new Employee(1, "ferdi", 2_500, "Marketing")
        };

        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees, new NameAscComparator());
        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees, new SalaryDescComparator());
        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees, new DepartmentAscNameDescComparator());
        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees, new SalaryAscNameAscComparator());
        System.out.println(Arrays.toString(employees));
    }
}
