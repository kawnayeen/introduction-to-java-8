package com.kawnayeen.java8._2_stream._3_stream_methods._1_intermediate_operation;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kawnayeen on 1/29/17.
 */
public class _5_Skip {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);
        values.stream().skip(2).forEach(System.out::println);
    }
}
