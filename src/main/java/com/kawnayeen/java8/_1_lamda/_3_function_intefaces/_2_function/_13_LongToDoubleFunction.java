package com.kawnayeen.java8._1_lamda._3_function_intefaces._2_function;

import java.util.function.LongToDoubleFunction;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _13_LongToDoubleFunction {
    public static void main(String[] args) {
        LongToDoubleFunction logIt = longValue -> Math.log(longValue);
        System.out.println(logIt.applyAsDouble(1234567899999L));
    }
}
