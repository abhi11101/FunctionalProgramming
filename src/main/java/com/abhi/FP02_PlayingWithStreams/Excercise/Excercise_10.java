package com.abhi.FP02_PlayingWithStreams.Excercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Excercise_10 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenList = evenList(numbers);

        evenList.forEach(System.out::println);
    }

    public static List<Integer> evenList(List<Integer> list) {

        return list.stream()
                .filter(num -> num%2==0)
                .collect(Collectors.toList());

    }
}
