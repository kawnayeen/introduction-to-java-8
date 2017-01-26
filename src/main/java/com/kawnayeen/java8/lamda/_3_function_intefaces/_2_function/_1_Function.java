package com.kawnayeen.java8.lamda._3_function_intefaces._2_function;

import java.util.function.Function;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _1_Function {
    public static void main(String[] args) {
        Function<String, Integer> findLength = str -> str.length();
        String myStr = "Kawnayeen";
        System.out.println("Length of String '" + myStr + "' is : " + findLength.apply(myStr));
    }
}
