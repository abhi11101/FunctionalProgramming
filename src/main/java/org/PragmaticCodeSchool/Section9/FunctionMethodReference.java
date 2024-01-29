package org.PragmaticCodeSchool.Section9;

import java.util.function.Function;

public class FunctionMethodReference {

    private static Function<String,String> toUpperCaseLambda = s -> s.toUpperCase();
    private static Function<String,String> toUpperCaseMethodReference = String::toUpperCase;

    public static void main(String[] args) {

        System.out.println(toUpperCaseLambda.apply("naruto"));
        System.out.println(toUpperCaseMethodReference.apply("naruto"));

    }
}
