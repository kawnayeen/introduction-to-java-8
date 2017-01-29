package com.kawnayeen.java8.stream._1_stream_srouce;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by kawnayeen on 1/27/17.
 */
public class _1_Collections {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);
        Consumer<Integer> consumer = value -> System.out.println(value);

        System.out.println("Sequential printing");
        values.stream().forEach(consumer);
        System.out.println();

        System.out.println("Parallel printing");
        values.parallelStream().forEach(consumer);
        System.out.println();
    }
}
