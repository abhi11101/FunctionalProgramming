package com.abhi.FP01_IntroductionToFunctionalProgramming;

import java.util.Arrays;
import java.util.List;

public class UsingLambda {

    public static void main(String[] args) {

        List<Integer> numbers  = Arrays.asList(1,2,3,4,5,6,7,8,9);
        printList(numbers);

    }

    public static void printList(List<Integer> list){

        list.stream()
                .filter(number -> number%2==0)
                .forEach(System.out::println);
    }
}
