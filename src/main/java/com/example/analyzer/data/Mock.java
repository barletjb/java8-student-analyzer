package com.example.analyzer.data;

import com.example.analyzer.model.Student;

import java.util.Arrays;
import java.util.List;

public final class Mock {
    public static List<Student> students() {
        return Arrays.asList(
                new Student("S1", "Alice Dupont", 20, "Informatique", 3.5, "alice@example.com"),
                new Student("S2", "Bob Martin", 22, "Mécanique", 2.8, "bob@example.com"),
                new Student("S3", "Carla Ruiz", 19, "Informatique", 3.9, "carla@example.com"),
                new Student("S4", "David Moreau", 23, "Électronique", 3.2, "david@example.com"),
                new Student("S5", "Eva Lopez", 21, "Informatique", 3.1, "eva@example.com"),
                new Student("S6", "Frank Li", 20, "Mécanique", 2.5, "frank@example.com")
        );
    }
}
