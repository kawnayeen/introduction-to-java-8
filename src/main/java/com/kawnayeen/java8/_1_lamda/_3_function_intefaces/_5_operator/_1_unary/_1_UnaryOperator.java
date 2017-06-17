package com.kawnayeen.java8._1_lamda._3_function_intefaces._5_operator._1_unary;

import java.util.function.UnaryOperator;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _1_UnaryOperator {

    public static void main(String[] args) {
        UnaryOperator<String> lowerCase = str -> str.toLowerCase();
        System.out.println("'AnAn' to lowercase : " + lowerCase.apply("AnAn"));
    }
}
