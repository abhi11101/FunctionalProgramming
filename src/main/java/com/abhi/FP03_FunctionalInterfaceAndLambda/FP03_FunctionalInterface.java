package com.abhi.FP03_FunctionalInterfaceAndLambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03_FunctionalInterface {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isEven = number -> number % 2 == 0;
        Function<Integer,Integer> square = number -> number * number;

        Consumer<Integer> sysoutConsumer = System.out::println;

        numbers.stream()
                .filter(isEven)
                .map(square)
                .forEach(sysoutConsumer);

    }
}
