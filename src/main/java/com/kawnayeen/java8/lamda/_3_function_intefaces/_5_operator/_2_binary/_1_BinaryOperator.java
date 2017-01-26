package com.kawnayeen.java8.lamda._3_function_intefaces._5_operator._2_binary;

import java.util.function.BinaryOperator;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _1_BinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<String> concatString = String::concat;
        String firstName = "Nafis";
        String lastName = "Razin";
        System.out.println(concatString.apply(firstName, lastName));
    }
}
