package com.kawnayeen.java8.lamda._3_function_intefaces._1_consumer;

import java.util.function.IntConsumer;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _2_IntConsumer {
    public static void main(String[] args) {
        IntConsumer intConsumer = intValue -> System.out.println(intValue + " -- what else I can do except printing");
        intConsumer.accept(5);
    }
}
