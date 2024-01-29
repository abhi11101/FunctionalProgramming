package org.PragmaticCodeSchool.Section8;

import java.util.function.Function;

public class FunctionExample {

    private static Function<String,String> function = name -> name.toUpperCase().concat(" FirsT ");
    private static Function<String,String> addSomeString = name -> name.toLowerCase().concat(" default");

    public static void main(String[] args) {

        System.out.println("Result is " + function.apply("java8"));
        System.out.println("Result for andThen: " + function.andThen(addSomeString).apply("goku"));
        System.out.println("Result for compose: " + function.compose(addSomeString).apply("naruto")); // First addsomestring will execute
    }
}
