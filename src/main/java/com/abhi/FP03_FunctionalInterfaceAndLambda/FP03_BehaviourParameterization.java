package com.abhi.FP03_FunctionalInterfaceAndLambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FP03_BehaviourParameterization {

    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9);

        Predicate<Integer> isEven = number -> number % 2 == 0;
        Consumer<Integer> printNumber = System.out::println;
        filterAndPrint(numbers, isEven, printNumber);
        System.out.println("-------------");
        filterAndPrint(numbers,x->x%2==0,System.out::println);

    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate, Consumer<Integer> printConsumer) {
        numbers.stream().filter(predicate).forEach(printConsumer);

    }

}
