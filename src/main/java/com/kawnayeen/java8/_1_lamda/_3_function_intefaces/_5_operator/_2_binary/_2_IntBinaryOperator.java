package com.kawnayeen.java8._1_lamda._3_function_intefaces._5_operator._2_binary;

import java.util.function.IntBinaryOperator;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _2_IntBinaryOperator {
    public static void main(String[] args) {
        IntBinaryOperator addThem = Integer::sum;
        System.out.println(addThem.applyAsInt(5, 4));
    }
}
