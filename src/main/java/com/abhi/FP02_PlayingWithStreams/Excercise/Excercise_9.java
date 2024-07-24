package com.abhi.FP02_PlayingWithStreams.Excercise;

import java.util.Arrays;
import java.util.List;

public class Excercise_9 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(sumOdd(numbers));

    }

    public static int sumOdd(List<Integer> numbers) {

        return numbers.stream()
                .filter(num -> num%2==1)
                .reduce(0, (a,b) -> a+b);

    }
}
