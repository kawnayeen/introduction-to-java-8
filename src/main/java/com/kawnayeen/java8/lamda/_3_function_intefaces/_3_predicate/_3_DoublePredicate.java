package com.kawnayeen.java8.lamda._3_function_intefaces._3_predicate;

import java.util.function.DoublePredicate;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _3_DoublePredicate {
    public static void main(String[] args) {
        DoublePredicate isHonours = value -> value >= 3.75;

        System.out.println("Is 3.35 Honours grade? Ans: " + isHonours.test(3.35));
    }
}
