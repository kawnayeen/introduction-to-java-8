package com.kawnayeen.java8.lamda._3_function_intefaces._3_BiFunction;

import java.util.function.ToLongBiFunction;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _4_ToLongBiFunction {
    public static void main(String[] args) {
        ToLongBiFunction<Integer, Integer> sum = Long::sum;
        System.out.print(sum.applyAsLong(1999999999, 1999999999));
    }
}
