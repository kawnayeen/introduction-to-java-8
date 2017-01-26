package com.kawnayeen.java8.lamda._3_function_intefaces._5_operator._2_binary;

import java.util.function.LongBinaryOperator;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _3_LongBinaryOperator {
    public static void main(String[] args) {
        LongBinaryOperator lowerOne = Long::min;
        System.out.println(lowerOne.applyAsLong(9L, -19L));
    }
}
