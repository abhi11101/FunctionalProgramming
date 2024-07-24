package com.abhi.FP04_FunctionalProgrammingWithCustomClasses;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP04_CustomClass {

    public static void main(String[] args) {

       List<Course> coursesList = List.of(
                new Course("Spring","Framework",98,20000),
                new Course("SpringBoot","Framework",95,53600),
                new Course("AWS","Cloud",91,80000),
                new Course("Docker","Cloud",88,39700)
        );


       // all match
       Predicate<Course> coursePredicate = course -> course.getReviewScore() >80;

       System.out.println(coursesList.stream().allMatch(coursePredicate));

       // none match

        Predicate<Course> noneMatch = course -> course.getReviewScore() <80;
        System.out.println(coursesList.stream().noneMatch(noneMatch));

        // any match

        Predicate<Course> anyMatch = course -> course.getReviewScore() > 95;
        System.out.println(coursesList.stream().anyMatch(anyMatch));

        // Sorting

        Comparator<Course> compareStudents = Comparator.comparing(Course::getNoOfStudents);
        System.out.println(coursesList.stream().sorted(compareStudents).collect(Collectors.toList()));

        //descending order

        Comparator<Course> descendingCompareStudents = Comparator.comparing(Course::getNoOfStudents).reversed();
        System.out.println(coursesList.stream().sorted(descendingCompareStudents).collect(Collectors.toList()));

        //limit
        System.out.println(coursesList.stream().sorted(descendingCompareStudents).limit(3).collect(Collectors.toList()));

        //skip
        System.out.println(coursesList.stream().sorted(descendingCompareStudents).skip(2).collect(Collectors.toList()));

        //takeWhile
        System.out.println(coursesList.stream().takeWhile(course -> course.getReviewScore() >90).collect(Collectors.toList()));

        //sum
        System.out.println(coursesList.stream()
                .mapToInt(course -> course.getNoOfStudents())
                .sum());

        //grouping

        System.out.println(coursesList.stream().collect(Collectors.groupingBy(Course::getCategory)));
        System.out.println(coursesList.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.counting())));
    }
}
