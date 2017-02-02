package com.kawnayeen.java8._1_lamda._3_function_intefaces._3_predicate;

import java.util.function.BiPredicate;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _5_BiPredicate {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isDivisible = (val1, val2) -> val1 % val2 == 0;

        System.out.println("Is 77 divisible by 10? Ans : " + isDivisible.test(77, 10));
        System.out.println("Is 77 divisible by 11? Ans : " + isDivisible.test(77, 11));
    }
}
