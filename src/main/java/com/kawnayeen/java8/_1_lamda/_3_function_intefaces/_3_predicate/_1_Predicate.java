package com.kawnayeen.java8._1_lamda._3_function_intefaces._3_predicate;

import java.util.function.Predicate;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _1_Predicate {
    public static void main(String[] args) {
        Predicate<String> isInteger = str -> {
            try {
                Integer integer = Integer.parseInt(str);
                return true;
            } catch (Exception e) {
                return false;
            }
        };

        System.out.println("Is 'abcd' integer? Ans : " + isInteger.test("abcd"));
        System.out.println("Is '12' integer? Ans : " + isInteger.test("12"));
    }
}
