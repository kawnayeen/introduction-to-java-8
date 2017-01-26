package com.kawnayeen.java8.lamda._3_function_intefaces._3_predicate;

import java.util.function.LongPredicate;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _4_LongPredicate {

    public static void main(String[] args) {
        LongPredicate isReallyLong = value -> value > Integer.MAX_VALUE;
        System.out.println("Is 29 really long number? ans: " + isReallyLong.test(29));
        System.out.println("Is " + Long.MAX_VALUE + " really long number? ans: " + isReallyLong.test(Long.MAX_VALUE));
    }
}
