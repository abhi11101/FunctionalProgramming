package org.PragmaticCodeSchool.Section14;

import java.util.stream.IntStream;

public class AggreagateStream {

    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1,10).sum();
        System.out.println(sum);
        int max =  IntStream.rangeClosed(1,100).max().getAsInt();
        System.out.println(max);


    }
}
