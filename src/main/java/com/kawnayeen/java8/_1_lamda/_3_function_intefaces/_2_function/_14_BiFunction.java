package com.kawnayeen.java8._1_lamda._3_function_intefaces._2_function;

import java.util.function.BiFunction;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _14_BiFunction {

    public static void main(String[] args) {
        BiFunction<String, Integer, String> getBio = (name, age) -> {
            return "Name : " + name + ", Age : " + age;
        };

        System.out.println(getBio.apply("Kawnayeen", 25));
    }
}
