package com.kawnayeen.java8._2_stream._3_stream_methods._1_intermediate_operation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by kawnayeen on 1/29/17.
 */
public class _7_Sorted {

    public static void main(String[] args) {
        sortIntegerList();
        sortStringInNaturalOrder();
        sortStringWithCustomComparator();
    }

    private static void sortIntegerList() {
        System.out.println();
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 9, 7, 6);
        values.stream().sorted().forEach(System.out::println);
        System.out.println();
    }

    private static void sortStringInNaturalOrder() {
        System.out.println();
        List<String> values = Arrays.asList("Who", "Am", "I");
        values.stream().sorted().forEach(System.out::println);
        System.out.println();
    }

    private static void sortStringWithCustomComparator() {
        System.out.println();
        List<String> values = Arrays.asList("who", "am", "I");
        values.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);
        System.out.println();
    }
}

