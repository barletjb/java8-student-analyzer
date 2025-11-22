package com.example.analyzer.service;

import com.example.analyzer.data.Mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentAnalyzerTest {

    private StudentAnalyzer analyzer;

    @BeforeEach
    void setUp() {
        analyzer = new StudentAnalyzer(Mock.students());
    }

    @Test
    void filter() {
    }

    @Test
    void sortByGpaDesc() {
    }

    @Test
    void sortByGpaAsc() {
    }

    @Test
    void groupByMajor() {
    }

    @Test
    void groupByEmail() {
    }

    @Test
    void mapToEmails() {
    }

    @Test
    void findStudentById() {
    }

    @Test
    void gpaStatistics() {
    }

    @Test
    void averageGpaByMajor() {
    }
}