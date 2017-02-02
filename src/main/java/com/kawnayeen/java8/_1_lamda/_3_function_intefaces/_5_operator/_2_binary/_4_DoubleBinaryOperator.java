package com.kawnayeen.java8._1_lamda._3_function_intefaces._5_operator._2_binary;

import java.util.function.DoubleBinaryOperator;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _4_DoubleBinaryOperator {
    public static void main(String[] args) {
        DoubleBinaryOperator whoIsGreater = Double::max;
        System.out.println(whoIsGreater.applyAsDouble(17.5, 17.499));
    }
}
