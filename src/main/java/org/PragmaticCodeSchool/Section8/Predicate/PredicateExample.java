package org.PragmaticCodeSchool.Section8.Predicate;

import java.util.function.Predicate;

public class PredicateExample {

    private static Predicate<Integer> p = (i) -> i%2==0;
    private static Predicate<Integer> p2 = i -> i%5==0;
    public static void main(String[] args) {

        System.out.println(p.test(6));

        predicateAnd();
        predicateOR();
        predicateNegate();
    }

    public static void predicateAnd(){

        System.out.println(p.and(p2).test(10));

    }
    public static void predicateOR(){
        System.out.println(p.or(p2).test(8));
    }

    public static void predicateNegate(){
        System.out.println(p.or(p2).negate().test(8)); // Negate reverse the results
    }
}
