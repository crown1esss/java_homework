package com.company;


import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return firstStudent.compareTo(secondStudent);
    }

}