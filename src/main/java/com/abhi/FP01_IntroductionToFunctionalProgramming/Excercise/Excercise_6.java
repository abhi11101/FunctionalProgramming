package com.abhi.FP01_IntroductionToFunctionalProgramming.Excercise;

import java.util.List;

public class Excercise_6 {

    public static void main(String[] args) {

        List<String> courses = List.of("Spring","SpringBoot","AWS","API","Microservices","Docker");
        printChars(courses);

    }

    public static void printChars(List<String> courses){

        courses.stream()
                .map(course -> course.length())
                .forEach(System.out::println);

    }
}
