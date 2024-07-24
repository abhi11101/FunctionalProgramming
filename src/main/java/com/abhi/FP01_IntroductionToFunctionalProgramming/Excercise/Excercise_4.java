package com.abhi.FP01_IntroductionToFunctionalProgramming.Excercise;

import java.util.List;

public class Excercise_4 {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring","SpringBoot","AWS","API","Microservices","Docker");
        printSizeFour(courses);
    }

    public static void printSizeFour(List<String> list) {

        list.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);
    }
}
