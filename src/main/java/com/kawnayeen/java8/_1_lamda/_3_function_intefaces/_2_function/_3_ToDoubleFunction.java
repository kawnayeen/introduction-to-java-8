package com.kawnayeen.java8._1_lamda._3_function_intefaces._2_function;

import java.util.function.ToDoubleFunction;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _3_ToDoubleFunction {
    public static void main(String[] args) {
        ToDoubleFunction<Integer> findSquareRoot = intValue -> Math.sqrt(intValue);
        Integer myNumber = new Integer(64);
        System.out.println("Square root of '" + myNumber + "' is : " + findSquareRoot.applyAsDouble(myNumber));
    }
}
