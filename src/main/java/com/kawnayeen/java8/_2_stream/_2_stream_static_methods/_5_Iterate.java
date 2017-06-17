package com.kawnayeen.java8._2_stream._2_stream_static_methods;

import java.util.function.DoubleUnaryOperator;
import java.util.stream.DoubleStream;

/**
 * Created by kawnayeen on 1/29/17.
 */
public class _5_Iterate {
    public static void main(String[] args) {
        Double seed = 1.0;
        DoubleUnaryOperator doubleUnaryOperator = value -> value + 0.75;
        DoubleStream.iterate(seed, doubleUnaryOperator).limit(5).forEach(System.out::println);
    }
}
