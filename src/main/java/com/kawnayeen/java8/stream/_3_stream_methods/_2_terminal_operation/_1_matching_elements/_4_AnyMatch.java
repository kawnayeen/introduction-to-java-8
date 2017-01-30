package com.kawnayeen.java8.stream._3_stream_methods._2_terminal_operation._1_matching_elements;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by kawnayeen on 1/30/17.
 */
public class _4_AnyMatch {
    public static void main(String[] args) {
        exampleOne();
        exampleTwo();
    }

    private static void exampleOne() {
        System.out.println("Checking whether any number is odd");
        List<Integer> values = Arrays.asList(2, 4, 6, 12);
        System.out.println("List : " + values);
        Predicate<Integer> isOdd = value -> value % 2 == 1;
        boolean hasAnyOddNumber = values.stream().anyMatch(isOdd);
        System.out.println("Has Any number odd? " + hasAnyOddNumber + "\n");
    }

    private static void exampleTwo() {
        System.out.println("Checking whether any number is even");
        List<Integer> values = Arrays.asList(1, 3, 6, 7, 9);
        System.out.println("List : " + values);
        Predicate<Integer> isEven = value -> value % 2 == 0;
        boolean hasAnyEvenNumber = values.stream().anyMatch(isEven);
        System.out.println("Has Any number even? " + hasAnyEvenNumber);
    }
}
