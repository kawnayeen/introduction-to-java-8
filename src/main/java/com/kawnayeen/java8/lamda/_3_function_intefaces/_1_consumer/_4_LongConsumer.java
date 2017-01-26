package com.kawnayeen.java8.lamda._3_function_intefaces._1_consumer;

import java.util.function.LongConsumer;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _4_LongConsumer {
    public static void main(String[] args){
        LongConsumer longConsumer = longVale -> System.out.println(longVale);
        longConsumer.accept(1234567891);
    }
}
