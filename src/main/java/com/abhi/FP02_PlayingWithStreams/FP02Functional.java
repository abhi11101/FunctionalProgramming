package com.abhi.FP02_PlayingWithStreams;

import java.util.Arrays;
import java.util.List;

public class FP02Functional {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(sumList(numbers));
        System.out.println(sumListLambda(numbers));
    }

    public static int sumList(List<Integer> numbers) {

        return numbers.stream()
                .reduce(0,FP02Functional::sum);

    }

    public static int sum(int a, int b){
        System.out.println("a: "+ a + " b: "+ b);

        return a+b;
    }

    public static int sumListLambda(List<Integer> numbers) {


        return numbers.stream()
                .reduce(0, (x,y)->x+y);
    }
}
