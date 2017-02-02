package com.kawnayeen.java8._2_stream._1_stream_srouce;

import java.util.Arrays;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * Created by kawnayeen on 1/27/17.
 */
public class _2_Array {
    public static void main(String[] args) {
        intStreamExample();
        doubleStreamExample();
        longStreamExample();
    }

    private static void intStreamExample() {
        System.out.println("IntStream Example: ");
        int[] intValues = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        IntConsumer intConsumer = System.out::println;
        IntStream intStream = Arrays.stream(intValues);
        intStream.forEach(intConsumer);
        System.out.println();
    }

    private static void doubleStreamExample() {
        System.out.println("DoubleStream Example: ");
        double[] doubleValues = new double[]{1.5, 2.75, 4, 5.25, 6.5};
        DoubleConsumer doubleConsumer = System.out::println;
        DoubleStream doubleStream = Arrays.stream(doubleValues);
        doubleStream.forEach(doubleConsumer);
        System.out.println();
    }

    private static void longStreamExample() {
        System.out.println("LongStream Example: ");
        long[] longValues = new long[]{1134L, 3456L, 4765L, 99999999999L};
        LongConsumer longConsumer = System.out::println;
        LongStream longStream = Arrays.stream(longValues);
        longStream.forEach(longConsumer);
        System.out.println();
    }
}
