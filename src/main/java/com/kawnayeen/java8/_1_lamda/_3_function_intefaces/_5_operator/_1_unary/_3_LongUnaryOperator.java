package com.kawnayeen.java8._1_lamda._3_function_intefaces._5_operator._1_unary;

import java.util.function.LongUnaryOperator;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _3_LongUnaryOperator {
    public static void main(String[] args) {
        LongUnaryOperator decreaseByTwo = value -> value - 2;

        System.out.println(decreaseByTwo.applyAsLong(345L));
        System.out.println(decreaseByTwo.applyAsLong(-123L));
    }
}
