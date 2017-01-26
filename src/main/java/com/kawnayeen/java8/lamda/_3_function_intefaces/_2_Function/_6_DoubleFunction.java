package com.kawnayeen.java8.lamda._3_function_intefaces._2_Function;

import java.util.function.DoubleFunction;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _6_DoubleFunction {
    public static void main(String[] args) {
        DoubleFunction<Integer> roundIt = doubleValue -> new Integer((int) Math.round(doubleValue));

        double firstVal = 4.49;
        double secondVal = 4.51;

        System.out.println("Round of " + firstVal + " is : " + roundIt.apply(firstVal));
        System.out.println("Round of " + secondVal + " is : " + roundIt.apply(secondVal));
    }
}
