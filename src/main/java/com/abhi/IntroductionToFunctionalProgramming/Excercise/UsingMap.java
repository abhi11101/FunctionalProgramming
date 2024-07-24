package com.abhi.IntroductionToFunctionalProgramming.Excercise;

import java.util.Arrays;
import java.util.List;

public class UsingMap {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        printSquaresOfEven(integers);
    }

    public static void printSquaresOfEven(List<Integer> numbers) {

        numbers.stream()
                .filter(num -> num%2==0)
                .map(num -> num*num)
                .forEach(System.out::println);

    }
}
