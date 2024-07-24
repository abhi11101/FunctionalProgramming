package com.abhi.FP01_IntroductionToFunctionalProgramming.Excercise;

import java.util.List;

public class Excercise_2 {

    public static void main(String[] args) {

        List<String> courses = List.of("Spring","SpringBoot","AWS","API","Microservices","Docker");
        printCourse(courses);

    }

    public static void printCourse(List<String> courses){

        courses.stream()
                .forEach(System.out::println);
    }
}
