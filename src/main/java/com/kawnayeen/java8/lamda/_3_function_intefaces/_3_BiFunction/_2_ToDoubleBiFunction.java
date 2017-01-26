package com.kawnayeen.java8.lamda._3_function_intefaces._3_BiFunction;

import java.util.function.ToDoubleBiFunction;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _2_ToDoubleBiFunction {
    public static void main(String[] args) {
        ToDoubleBiFunction<Double, Double> sum = Double::sum;

        System.out.println("2.5+4.09 = " + sum.applyAsDouble(2.51, 4.09));
    }
}
