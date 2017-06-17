package com.kawnayeen.java8._1_lamda._3_function_intefaces._2_function;

import java.util.function.LongToIntFunction;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _12_LongToIntFunction {
    public static void main(String[] args) {
        LongToIntFunction longToInt = (longValue) -> (int) longValue;
        long longValue = 45682348765987L;
        System.out.println(longToInt.applyAsInt(longValue));
    }
}
