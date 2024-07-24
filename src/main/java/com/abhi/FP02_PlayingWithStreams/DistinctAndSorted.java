package com.abhi.FP02_PlayingWithStreams;

import java.util.Arrays;
import java.util.List;

public class DistinctAndSorted {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4);
        printDistinct(numbers);
        System.out.println("--------------");
        printSorted(numbers);
    }

    public static void printDistinct(List<Integer> numbers){

        numbers.stream()
                .distinct()
                .forEach(System.out::println);

    }

    public static void printSorted(List<Integer> numbers){

        numbers.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
