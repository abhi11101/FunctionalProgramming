package com.abhi.FP03_FunctionalInterfaceAndLambda;

import java.util.function.BiPredicate;

public class FP03_BiPredicate {

    public static void main(String[] args) {

        BiPredicate<Integer,String> biPredicate = (num,str)-> str.length()>num;
        System.out.println(biPredicate.test(2,"hello"));

    }
}
