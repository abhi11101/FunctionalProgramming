package com.abhi.IntroductionToFunctionalProgramming.Excercise;

import java.util.Arrays;
import java.util.List;

public class Excercise_1 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        printOdd(numbers);

    }

    public static void printOdd(List<Integer> list){
        list.stream()
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println);
    }
}
