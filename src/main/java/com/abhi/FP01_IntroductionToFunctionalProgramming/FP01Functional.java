package com.abhi.FP01_IntroductionToFunctionalProgramming;

import java.util.Arrays;
import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        printAll(integers);
        System.out.println();
        printEven(integers);
    }

    public static void printAll(List<Integer> list){

//        list.stream().forEach(FP01Functional::print);
        list.stream().forEach(System.out::print);

    }

//    public static void print(int number){
//        System.out.println(number);
//    }

    public static void printEven(List<Integer> list){

        list.stream()
                .filter(FP01Functional::isEven)
                .forEach(System.out::print);

    }

    public static boolean isEven(int number){
        return number%2==0;
    }
}
