package org.campus02.ue;

import java.util.Arrays;

public class ArraySortDemo {

    public static void main(String[] args) {
        int[] numbers = {2,5,1,8,9,3};
        Arrays.sort(numbers);
        // iter
        for (int number : numbers) {
            System.out.println(number);
        }

        char[] chars = {'c', 'a', 'z', 'u', 'b'};
        Arrays.sort(chars);
        System.out.println(chars);

        String[] names = {"max", "susi", "john"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        Student[] students = {
                new Student(3, "max", "mustermann"),
                new Student(1, "susi", "sorglos"),
                new Student(6, "susi", "mustermann")
        };

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
