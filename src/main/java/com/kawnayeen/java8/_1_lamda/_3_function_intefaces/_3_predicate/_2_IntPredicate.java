package com.kawnayeen.java8._1_lamda._3_function_intefaces._3_predicate;

import java.util.function.IntPredicate;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _2_IntPredicate {
    public static void main(String[] args) {
        IntPredicate isEven = value -> value % 2 == 0;
        System.out.println("Is '5' even? Ans : " + isEven.test(5));
        System.out.println("Is '10' even? Ans : " + isEven.test(10));
    }
}
