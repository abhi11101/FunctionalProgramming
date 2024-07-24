package com.abhi.FP02_PlayingWithStreams.Excercise;

import java.util.List;
import java.util.stream.Collectors;

public class Excercise_11 {

    public static void main(String[] args) {

        List<String> courses = List.of("Spring","SpringBoot","AWS","API","Microservices","Docker");
        List<Integer> courseLength = courseLength(courses);

        courseLength.forEach(System.out::println);
    }

    public static List<Integer> courseLength(List<String> courses) {

        return courses.stream()
                .map(course -> course.length())
                .collect(Collectors.toList());

    }
}
