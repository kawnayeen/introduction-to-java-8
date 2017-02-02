package com.kawnayeen.java8._1_lamda._3_function_intefaces._2_function;

import java.util.function.ToLongFunction;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _4_ToLongFunction {

    public static void main(String[] args) {
        ToLongFunction<String> strToLong = Long::new;

        String firstValue = "922337203685477580";
        String secondValue = "223372036854775807";

        System.out.println("First value: " + firstValue);
        System.out.println("Second value: " + secondValue);
        System.out.println("Sum : " + (strToLong.applyAsLong(firstValue) + strToLong.applyAsLong(secondValue)));
    }
}
