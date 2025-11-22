package com.example.analyzer.service;

import com.example.analyzer.functional.StudentPredicate;
import com.example.analyzer.model.Student;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentAnalyzer {

    private List<Student> students;

    public StudentAnalyzer(List<Student> students) {
        this.students = students;
    }

    public List<Student> filter(StudentPredicate studentPredicate) {
        return students.stream()
                .filter(studentPredicate::test)
                .collect(Collectors.toList());
    }

    public List<Student> sortByGpaDesc() {
        return students.stream()
                .sorted(Comparator.comparingDouble(Student::getGpa).reversed()
                        .thenComparing(Student::getName))
                .collect(Collectors.toList());
    }

    public List<Student> sortByGpaAsc() {
        return students.stream()
                .sorted(Comparator.comparingDouble(Student::getGpa)
                        .thenComparing(Student::getName))
                .collect(Collectors.toList());
    }








}
