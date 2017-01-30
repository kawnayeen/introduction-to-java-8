package com.kawnayeen.java8.stream._3_stream_methods._2_terminal_operation._1_matching_elements;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by kawnayeen on 1/30/17.
 */
public class _5_NoneMatch {
    public static void main(String[] args) {
        exampleOne();
        exampleTwo();
    }

    private static void exampleOne() {
        System.out.println("Checking no odd number");
        List<Integer> values = Arrays.asList(2, 4, 6, 12);
        System.out.println("List : " + values);
        Predicate<Integer> isOdd = value -> value % 2 == 1;
        boolean allEvenNumber = values.stream().noneMatch(isOdd);
        System.out.println("All Even Number? " + allEvenNumber + "\n");
    }

    private static void exampleTwo() {
        System.out.println("Checking no even number");
        List<Integer> values = Arrays.asList(1, 3, 6, 7, 9);
        System.out.println("List : " + values);
        Predicate<Integer> isEven = value -> value % 2 == 0;
        boolean allOddNumber = values.stream().noneMatch(isEven);
        System.out.println("All Odd Number? " + allOddNumber);
    }
}
