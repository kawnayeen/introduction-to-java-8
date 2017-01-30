package com.kawnayeen.java8.stream._3_stream_methods._2_terminal_operation._3_numerical_results;

import java.util.Arrays;

/**
 * Created by kawnayeen on 1/30/17.
 */
public class _5_Sum {
    public static void main(String[] args) {
        double[] doubles = new double[]{1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        System.out.println(
                "Sum = " +
                        Arrays.stream(doubles).sum()
        );
    }
}
