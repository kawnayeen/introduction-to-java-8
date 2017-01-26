package com.kawnayeen.java8.lamda._3_function_intefaces._2_function;

import java.util.function.IntToLongFunction;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _9_IntToLongFunction {

    public static void main(String[] args) {
        IntToLongFunction getSignum = intValue -> Long.signum(intValue);

        System.out.println(getSignum.applyAsLong(4));
        System.out.println(getSignum.applyAsLong(-2));
    }
}
