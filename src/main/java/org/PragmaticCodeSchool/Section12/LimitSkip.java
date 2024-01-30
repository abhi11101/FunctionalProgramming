package org.PragmaticCodeSchool.Section12;

import java.util.Arrays;
import java.util.List;

public class LimitSkip {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(9,3,7,2,7,11,6);
        System.out.println(performLimitMax(integerList));
        System.out.println(performSkipMax(integerList));
    }

    public static int performLimitMax(List<Integer> integerList){

        return integerList.stream()
                .limit(3)
                .reduce((a,b)->a>b ? a :b)
                .get();
    }

    public static int performSkipMax(List<Integer> integerList){

        return integerList.stream()
                .skip(3)
                .reduce((a,b)->a>b ? a :b)
                .get();
    }
}
