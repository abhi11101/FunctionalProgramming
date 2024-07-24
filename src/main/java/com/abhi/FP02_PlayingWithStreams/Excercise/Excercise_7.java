package com.abhi.FP02_PlayingWithStreams.Excercise;

import java.util.Arrays;
import java.util.List;

public class Excercise_7 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(sumSquare(numbers));

    }

    public static int sumSquare(List<Integer> numbers) {

        return numbers.stream()
                .map(num -> num*num)
                .reduce(0, (a,b) -> a+b);

    }
}
