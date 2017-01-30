package com.kawnayeen.java8.stream._3_stream_methods._2_terminal_operation._3_numerical_results;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by kawnayeen on 1/30/17.
 */
public class _3_Min {
    public static void main(String[] args) {
        findMinValueFromDoubleList();
        findMinValueFromStringList();
    }

    private static void findMinValueFromDoubleList() {
        List<Double> values = Arrays.asList(1.5, 0.75, 2.96, 4.0, 5.79, 5.78);
        System.out.println("List : " + values);
        double minValue = values.stream().min(Double::compareTo).orElse(0.0);
        System.out.println("Min value : " + minValue);
        System.out.println();
    }

    private static void findMinValueFromStringList() {
        List<String> values = Arrays.asList("Allah is Great", "All praise and thanks belongs to Allah");
        System.out.println("List : " + values);
        String strWithMinLength = values.stream().min(Comparator.comparingInt(String::length)).orElse("");
        System.out.println("Our string : " + strWithMinLength);
        System.out.println();
    }
}
