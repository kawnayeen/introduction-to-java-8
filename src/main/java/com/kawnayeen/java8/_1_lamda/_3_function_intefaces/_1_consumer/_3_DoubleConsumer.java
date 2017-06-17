package com.kawnayeen.java8._1_lamda._3_function_intefaces._1_consumer;

import java.util.function.DoubleConsumer;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _3_DoubleConsumer {
    public static void main(String[] args) {
        DoubleConsumer doubleConsumer = doubleVal -> System.out.println(doubleVal);
        doubleConsumer.accept(5.5);
    }
}
