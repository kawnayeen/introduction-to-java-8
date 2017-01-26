package com.kawnayeen.java8.lamda._3_function_intefaces._2_function;

import java.util.function.ToIntBiFunction;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _16_ToIntBiFunction {

    public static void main(String[] args) {
        ToIntBiFunction<Integer, Integer> sum = Integer::sum;

        System.out.println("10+17 = " + sum.applyAsInt(10, 17));
    }
}
