package com.kawnayeen.java8.lamda._3_function_intefaces._2_function;

import java.util.function.DoubleToLongFunction;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _11_DoubleToLongFunction {
    public static void main(String[] args) {
        DoubleToLongFunction doubleToLong = doubleVal -> new Long((int) doubleVal);

        System.out.println(doubleToLong.applyAsLong(2.9));
    }
}
