package com.kawnayeen.java8.lamda._3_function_intefaces._3_BiFunction;

import java.util.function.BiFunction;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _1_BiFunction {

    public static void main(String[] args) {
        BiFunction<String, Integer, String> getBio = (name, age) -> {
            return "Name : " + name + ", Age : " + age;
        };

        System.out.println(getBio.apply("Kawnayeen", 25));
    }
}
