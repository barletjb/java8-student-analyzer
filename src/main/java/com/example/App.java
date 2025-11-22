package com.example;

import com.example.analyzer.data.Mock;
import com.example.analyzer.functional.StudentPredicate;
import com.example.analyzer.model.Student;
import com.example.analyzer.service.StudentAnalyzer;

import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Student> students = Mock.students();

        final String info = "Informatique";

        StudentAnalyzer analyzer = new StudentAnalyzer(students);

        System.out.println("==== Tous les étudiants ====");
        students.forEach(System.out::println);

        System.out.println("\n=== Filter : Informatique et GPA >= 3.2 ===");
        StudentPredicate inInfo = s -> info.equals(s.getMajor());
        StudentPredicate gpaHigh = s -> s.getGpa() >= 3.2;

        System.out.println("\n=== Filter : Informatique ===");
        analyzer.filter(inInfo);

        System.out.println("\n=== Filter : Students GPA High ===");
        analyzer.filter(gpaHigh);


        System.out.println("\n=== Tri par GAP Desc ===");
        analyzer.sortByGpaDesc();

        System.out.println("\n=== Tri par GAP Asc ===");
        analyzer.sortByGpaAsc();

        System.out.println("\n=== Groupement par major ===");
        Map< String, List <Student>> grouped1 = analyzer.groupByMajor();
        grouped1.forEach((key, value) -> System.out.println(key + ": " + value));


    }
}
