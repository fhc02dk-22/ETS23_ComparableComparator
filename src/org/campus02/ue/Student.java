package org.campus02.ue;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int matrNr;
    private String firstName;
    private String lastName;

    public Student(int matrNr, String firstName, String lastName) {
        this.matrNr = matrNr;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getMatrNr() {
        return matrNr;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return matrNr == student.matrNr;
    }

    @Override
    public int hashCode() {
        return Objects.hash(matrNr);
    }

    @Override
    public String toString() {
        return "Student{" +
                "matrNr=" + matrNr +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    /**
     * Studenten sollen absteigend nach matrNr sortiert werden
     * @param other
     * @return
     */
    @Override
    public int compareTo(Student other) {
        return Integer.compare(other.matrNr, this.matrNr);
    }
}
