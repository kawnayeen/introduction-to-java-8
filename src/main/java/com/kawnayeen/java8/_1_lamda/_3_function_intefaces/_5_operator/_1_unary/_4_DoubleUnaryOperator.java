package com.kawnayeen.java8._1_lamda._3_function_intefaces._5_operator._1_unary;

import java.text.DecimalFormat;
import java.util.function.DoubleUnaryOperator;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _4_DoubleUnaryOperator {

    public static void main(String[] args) {
        DoubleUnaryOperator roundIt = value -> Double.parseDouble(new DecimalFormat("#.###").format(value));

        double value = 2.54678;
        System.out.println("Actual value: " + value);
        System.out.println("After rounding: " + roundIt.applyAsDouble(value));
    }
}
