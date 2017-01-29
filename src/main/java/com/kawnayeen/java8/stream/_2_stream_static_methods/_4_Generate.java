package com.kawnayeen.java8.stream._2_stream_static_methods;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

/**
 * Created by kawnayeen on 1/29/17.
 */
public class _4_Generate {
    public static void main(String[] args){
        IntSupplier intSupplier = new Random()::nextInt;
        IntStream.generate(intSupplier).limit(5).forEach(System.out::println);
    }
}
