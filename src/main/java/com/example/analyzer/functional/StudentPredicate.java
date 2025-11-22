package com.example.analyzer.functional;

import com.example.analyzer.model.Student;

@FunctionalInterface
public interface StudentPredicate {

    boolean test(Student student);

}
