package com.kawnayeen.java8.stream._3_stream_methods._2_terminal_operation._3_numerical_results;

import java.util.Arrays;

/**
 * Created by kawnayeen on 1/30/17.
 */
public class _4_Average {
    public static void main(String[] args) {
        int[] intValues = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        double averageValue = Arrays.stream(intValues).average().orElse(0.0);
        System.out.println("Their average : " + averageValue);
    }
}
