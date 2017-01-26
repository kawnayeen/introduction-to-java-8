package com.kawnayeen.java8.lamda._3_function_intefaces._1_consumer;

import java.util.function.BiConsumer;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _5_BiConsumer {
    public static void main(String[] args) {
        BiConsumer<String, Integer> shortBio = (name, age) -> {
            System.out.print("Name: " + name + "\nAge: " + age);
        };

        shortBio.accept("Kawnayeen",new Integer(25));
    }
}
