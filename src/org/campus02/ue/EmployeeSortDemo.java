package org.campus02.ue;

import java.util.Arrays;

public class EmployeeSortDemo {

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(5, "max", 3_000, "Development"),
                new Employee(2, "max", 2_000, "Research"),
                new Employee(4, "susi", 4_000, "Sales"),
                new Employee(1, "marie", 3_500, "Marketing"),
        };

        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));
    }
}
