package com.kawnayeen.java8._1_lamda._3_function_intefaces._5_operator._1_unary;

import java.util.function.IntUnaryOperator;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _2_IntUnaryOperator {
    public static void main(String[] args) {
        IntUnaryOperator doubleIt = intVal -> intVal * 2;

        System.out.println(doubleIt.applyAsInt(5));
        System.out.println(doubleIt.applyAsInt(17));
    }
}
