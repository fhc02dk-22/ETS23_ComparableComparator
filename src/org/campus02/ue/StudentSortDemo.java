package org.campus02.ue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentSortDemo {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(3, "max", "mustermann"));
        students.add(new Student(1, "susi", "sorglos"));
        students.add(new Student(6, "susi", "mustermann"));

        // 1. Möglichkeit zu sortieren
        Collections.sort(students, new StudentLastFirstNameComparator());
        // 2. Möglichkeit
        //students.sort(new StudentLastFirstNameComparator());
        System.out.println(students);

        // sortieren nach Nachname absteigend
        // verwendung einer anonymen klasse
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student other) {
                return other.getLastName().compareTo(student.getLastName());
            }
        });
        System.out.println(students);

        // sortieren nach nachnamen aufsteigend
        // wir verwenden lamba expression
        students.sort(
                (student, other) -> student.getLastName().compareTo(other.getLastName()));


        // sortieren nach Vornamen aufsteigend
        // Method Reference
        students.sort(Comparator.comparing(Student::getFirstName));

        // sortieren nach Nachname aufsteigend
        // dann nach Vornamen aufsteigend
        students.sort(Comparator.comparing(Student::getLastName)
                .thenComparing(Student::getFirstName));

        // sortieren nach Nachname aufsteigend
        // sortieren nach Vorname absteigend
        students.sort(Comparator.comparing(Student::getLastName)
                .thenComparing(
                        (student, other) ->
                                other.getFirstName().compareTo(student.getFirstName())));


        students.sort(Comparator.comparing(Student::getFirstName));
    }
}
