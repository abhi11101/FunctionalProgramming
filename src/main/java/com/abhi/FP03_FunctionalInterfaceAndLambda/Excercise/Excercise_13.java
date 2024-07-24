package com.abhi.FP03_FunctionalInterfaceAndLambda.Excercise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Excercise_13 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Function<Integer,Integer> function = num-> num*num;
        List<Integer> squareList = squareList(numbers,function);

        squareList.forEach(System.out::println);

        System.out.println("--------------------");

        squareList = squareList(numbers, num->num*num);
        squareList.forEach(System.out::println);

    }

    private static List<Integer> squareList(List<Integer> numbers, Function<Integer,Integer> predicate){

        return numbers.stream()
                .map(predicate)
                .collect(Collectors.toList());
    }
}
