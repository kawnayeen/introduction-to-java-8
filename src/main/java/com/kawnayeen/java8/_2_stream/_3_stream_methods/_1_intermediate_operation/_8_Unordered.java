package com.kawnayeen.java8._2_stream._3_stream_methods._1_intermediate_operation;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kawnayeen on 1/29/17.
 */
public class _8_Unordered {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 3, 2, 4, 5, 6, 1, 3, 2, 4, 5, 6, 9, 10, 11, 12, 13, 15);

        long startTime = System.nanoTime();
        values.stream().distinct().forEach(System.out::println);
        long finishTime = System.nanoTime();
        long executionTimeInOrderedStream = finishTime - startTime;
        System.out.println("Execution Time : " + executionTimeInOrderedStream);

        startTime = System.nanoTime();
        values.stream().unordered().distinct().forEach(System.out::println);
        finishTime = System.nanoTime();
        long executionTimeInUnOrderedStream = finishTime - startTime;
        System.out.println("Execution Time : " + executionTimeInUnOrderedStream);

        System.out.println("Performance gain: " +
                ((executionTimeInOrderedStream * 1.0) / executionTimeInUnOrderedStream)
                + " times");
    }
}
