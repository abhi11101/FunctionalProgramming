package com.abhi.FP03_FunctionalInterfaceAndLambda;

import java.util.function.Supplier;

public class FP03_Supplier {

    public static void main(String[] args) {

        Supplier<String> stringSupplier = () -> "Hello World";
        System.out.println(stringSupplier.get());

        Supplier<Integer> integerSupplier = () -> {

            int x = 24;
            return x*2;
        };
        System.out.println(integerSupplier.get());

    }
}
