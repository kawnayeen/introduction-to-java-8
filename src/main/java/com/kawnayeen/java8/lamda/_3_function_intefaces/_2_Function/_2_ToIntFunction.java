package com.kawnayeen.java8.lamda._3_function_intefaces._2_Function;

import java.util.function.ToIntFunction;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _2_ToIntFunction {
    public static void main(String[] args) {
        exampleOne();
        exampleTwo();
    }

    private static void exampleOne() {
        ToIntFunction<String> findLength = str -> str.length();
        String myStr = "Kawnayeen";
        System.out.println("Length of String '" + myStr + "' is : " + findLength.applyAsInt(myStr));
    }

    private static void exampleTwo() {
        ToIntFunction<String> findLength = String::length;
        String myStr = "Kawnayeen";
        System.out.println("Length of String '" + myStr + "' is : " + findLength.applyAsInt(myStr));
    }
}
