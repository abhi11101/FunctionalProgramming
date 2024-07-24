package com.abhi.FP03_FunctionalInterfaceAndLambda;

import java.util.function.UnaryOperator;

public class FP03_UnaryOperator {

    public static void main(String[] args) {

        UnaryOperator<Integer> unaryOperator = x -> x * 2;
        System.out.println(unaryOperator.apply(5));

    }
}
