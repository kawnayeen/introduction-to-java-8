package com.kawnayeen.java8.lamda._3_function_intefaces._2_Function;

import java.util.function.IntFunction;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _5_IntFunction {
    public static void main(String[] args){
        IntFunction<Integer> toInteger = intValue -> new Integer(intValue);

        System.out.println(toInteger.apply(5).getClass());
    }
}
