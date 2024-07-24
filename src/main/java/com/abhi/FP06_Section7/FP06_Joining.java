package com.abhi.FP06_Section7;

import java.util.List;
import java.util.stream.Collectors;

public class FP06_Joining {


    public static void main(String[] args) {

        List<String> courses = List.of("Spring","SpringBoot","AWS","API","Microservices","Docker");

        String str = courses.stream().collect(Collectors.joining(","));
        System.out.println(str);


    }
}
