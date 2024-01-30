package org.PragmaticCodeSchool.Section12;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceStream {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        System.out.println(performMultiply(integerList));
        System.out.println(performMin(integerList));
        System.out.println(performMax(integerList));
    }

    public static int performMultiply(List<Integer> integerList){
        return integerList.stream()
                .reduce(1, (a,b)->a*b);
    }

    public static int performMin(List<Integer> integerList){

        return integerList.stream()
                .reduce(Integer::min)
                .get();
    }

    public static int performMax(List<Integer> integerList){
        return integerList.stream()
                .reduce(Integer::max)
                .get();
    }
}
