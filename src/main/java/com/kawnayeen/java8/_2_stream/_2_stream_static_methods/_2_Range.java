package com.kawnayeen.java8._2_stream._2_stream_static_methods;

import java.util.stream.IntStream;

/**
 * Created by kawnayeen on 1/29/17.
 */
public class _2_Range {
    public static void main(String[] args) {
        System.out.println("Printing ranged _2_stream with exclusive ending");
        IntStream.range(5, 10).forEach(System.out::println);
        System.out.println();

        System.out.println("Printing ranged _2_stream with inclusive ending");
        IntStream.rangeClosed(5, 10).forEach(System.out::println);
        System.out.println();
    }
}
