package com.abhi.FP02_PlayingWithStreams.Excercise;

import java.util.Comparator;
import java.util.List;

public class UsingComparator {

    public static void main(String[] args) {

        List<String> courses = List.of("Spring","SpringBoot","AWS","API","Microservices","Docker");

        printNaturalOrder(courses);
        System.out.println("--------------");
        printReverseOrder(courses);
        System.out.println("---------------");
        printCustomComparator(courses);

    }

    public static void printNaturalOrder(List<String> list) {

        list.stream()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }

    public static void printReverseOrder(List<String> list) {

        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }

    public static void printCustomComparator(List<String> list) {

        list.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);

    }
}
