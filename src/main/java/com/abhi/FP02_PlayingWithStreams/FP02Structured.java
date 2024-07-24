package com.abhi.FP02_PlayingWithStreams;

import java.util.Arrays;
import java.util.List;

public class FP02Structured {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        System.out.println(sumList(numbers));

    }

    public static int sumList(List<Integer> numbers) {

        int sum = 0;
        for (int num : numbers){
            sum+=num;
        }

        return sum;
    }
}
