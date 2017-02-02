package com.kawnayeen.java8._2_stream._3_stream_methods._2_terminal_operation._3_numerical_results;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kawnayeen on 1/30/17.
 */
public class _1_Count {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println("List : " + values);
        long length = values.stream().count();
        System.out.println("Stream Length : " + length);
    }
}
