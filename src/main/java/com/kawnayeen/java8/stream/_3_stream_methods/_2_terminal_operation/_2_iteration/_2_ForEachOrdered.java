package com.kawnayeen.java8.stream._3_stream_methods._2_terminal_operation._2_iteration;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kawnayeen on 1/30/17.
 */
public class _2_ForEachOrdered {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        values.parallelStream().forEachOrdered(System.out::println);
    }
}
