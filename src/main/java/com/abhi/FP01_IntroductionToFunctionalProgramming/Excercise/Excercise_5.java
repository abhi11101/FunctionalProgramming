package com.abhi.FP01_IntroductionToFunctionalProgramming.Excercise;

import java.util.Arrays;
import java.util.List;

public class Excercise_5 {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        printCubesOdd(integers);

    }

    public static void printCubesOdd(List<Integer> numbers) {

        numbers.stream()
                .filter(num -> num%2==1)
                .map(num -> num*num*num)
                .forEach(System.out::println);
    }
}
