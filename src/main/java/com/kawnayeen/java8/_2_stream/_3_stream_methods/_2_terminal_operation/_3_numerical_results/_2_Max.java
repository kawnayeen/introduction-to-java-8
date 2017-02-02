package com.kawnayeen.java8._2_stream._3_stream_methods._2_terminal_operation._3_numerical_results;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by kawnayeen on 1/30/17.
 */
public class _2_Max {

    public static void main(String[] args) {
        findMaxValueFromDoubleList();
        findMaxValueFromStringList();
    }

    private static void findMaxValueFromDoubleList() {
        List<Double> values = Arrays.asList(1.5, 0.75, 2.96, 4.0, 5.79, 5.78);
        System.out.println("List : " + values);
        double maxValue = values.stream().max(Double::compareTo).orElse(0.0);
        System.out.println("Max value : " + maxValue);
        System.out.println();
    }

    private static void findMaxValueFromStringList() {
        List<String> values = Arrays.asList("Is it okay?", "I'm good", "All praise and thanks belongs to Allah");
        System.out.println("List : " + values);
        String strWithMaxLength = values.stream().max(Comparator.comparingInt(String::length)).orElse("");
        System.out.println("Our string : " + strWithMaxLength);
        System.out.println();
    }
}
