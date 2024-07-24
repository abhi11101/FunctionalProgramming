package com.abhi.FP01_IntroductionToFunctionalProgramming.Excercise;

import java.util.List;

public class Excercise_3 {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring","SpringBoot","AWS","API","Microservices","Docker");
        printSpringCourse(courses);
    }


    public static void printSpringCourse(List<String> courses) {

        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
    }
}
