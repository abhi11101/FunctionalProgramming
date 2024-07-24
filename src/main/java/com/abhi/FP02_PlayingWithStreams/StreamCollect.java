package com.abhi.FP02_PlayingWithStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollect {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<Integer> squareList = squareList(numbers);

        squareList.forEach(System.out::println);

    }

    public static List<Integer> squareList(List<Integer> numbers) {

        return numbers.stream()
                .map(num-> num*num)
                .collect(Collectors.toList());

    }
}
