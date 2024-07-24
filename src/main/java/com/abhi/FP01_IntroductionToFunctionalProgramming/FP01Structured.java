package com.abhi.FP01_IntroductionToFunctionalProgramming;

import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {

        printAll(List.of(12,6,2,8,1,8,3,35,75,3,7,4,67));

    }

    public static void printAll(List<Integer> list){
        list.forEach(System.out::println); //Method Reference
    }
}
