package com.example.analyzer.model;

import java.util.Objects;

public class Student {

    private final String id ;
    private final String name;
    private final int age;
    private final String major;
    private final double gpa;
    private final String email;

    public Student(String id, String name, int age, String major, double gpa, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.major = major;
        this.gpa = gpa;
        this.email = email;
    }

    public String getId() { return id;}


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                ", gpa=" + gpa +
                ", email='" + email + '\'' +
                '}';
    }


}
