package com.kawnayeen.java8.stream._3_stream_methods._2_terminal_operation._1_matching_elements;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by kawnayeen on 1/30/17.
 */
public class _3_AllMatch {
    public static void main(String[] args) {
        exampleOne();
        exampleTwo();
    }

    private static void exampleOne() {
        System.out.println("Checking whether all numbers are odd number");
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 7, 6, 5);
        System.out.println("List : " + values);
        Predicate<Integer> isOdd = value -> value % 2 == 1;
        boolean isAllNumbersAreOdd = values.stream().allMatch(isOdd);
        System.out.println("All numbers are odd? " + isAllNumbersAreOdd + "\n");
    }

    private static void exampleTwo() {
        System.out.println("Checking whether all numbers are even");
        List<Integer> values = Arrays.asList(2, 4, 6, 8, 10);
        System.out.println("List : " + values);
        Predicate<Integer> isEven = value -> value % 2 == 0;
        boolean isAllNumbersAreEven = values.stream().allMatch(isEven);
        System.out.println("All numbers are even? " + isAllNumbersAreEven);
    }
}
