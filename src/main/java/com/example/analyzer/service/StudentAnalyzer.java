package com.example.analyzer.service;

import com.example.analyzer.functional.StudentPredicate;
import com.example.analyzer.model.Student;

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
}
