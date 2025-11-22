package com.example.analyzer.service;

import com.example.analyzer.functional.StudentPredicate;
import com.example.analyzer.model.Student;

import java.util.*;
import java.util.stream.Collectors;

// TODO : TEST UNITAIRES
public class StudentAnalyzer {

    private final List<Student> students;

    public StudentAnalyzer(List<Student> students) {
        this.students = students;
    }

    public List<Student> filter(StudentPredicate studentPredicate) {
        return students.stream()
                .filter(studentPredicate::test)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    public List<Student> sortByGpaDesc() {
        return students.stream()
                .sorted(Comparator.comparingDouble(Student::getGpa).reversed()
                        .thenComparing(Student::getName))
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    public List<Student> sortByGpaAsc() {
        return students.stream()
                .sorted(Comparator.comparingDouble(Student::getGpa)
                        .thenComparing(Student::getName))
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    public Map<String, List<Student>> groupByMajor() {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getMajor));
    }

    public Map<String, List<Student>> groupByEmail() {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getEmail));
    }

    public List<String> mapToEmails() {
        return students.stream()
                .map(Student::getEmail)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    public Optional<Student> findStudentById(String id) {
        return students.stream()
                .filter(student -> student.getId().equals(id))
                .peek(System.out::println)
                .findFirst();
    }

    public DoubleSummaryStatistics gpaStatistics() {
        return students.stream()
                .collect(Collectors.summarizingDouble(Student::getGpa));
    }

    public Map<String, Double> averageGpaByMajor() {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getMajor,
                        Collectors.averagingDouble(Student::getGpa)));
    }












}
