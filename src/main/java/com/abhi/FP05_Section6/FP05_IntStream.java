package com.abhi.FP05_Section6;

import java.util.stream.IntStream;

public class FP05_IntStream {

    public static void main(String[] args) {

        IntStream.range(1,10).peek(System.out::println).sum();
        System.out.println("--------------");
        int a = IntStream.iterate(1, i -> i + 3).limit(10).peek(System.out::println).sum();
        System.out.println("sum is " + a);
    }
}
