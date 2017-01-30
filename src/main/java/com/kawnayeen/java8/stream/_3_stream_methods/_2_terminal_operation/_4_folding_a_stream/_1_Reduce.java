package com.kawnayeen.java8.stream._3_stream_methods._2_terminal_operation._4_folding_a_stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

/**
 * Created by kawnayeen on 1/30/17.
 */
public class _1_Reduce {
    public static void main(String[] args) {
        reduceWithBinaryOperator();
        reduceWithBinaryOperatorTwo();
        reduceWithBinaryOperatorAndSeed();
        ultimateReduction();
    }

    private static void reduceWithBinaryOperator() {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println("List : " + values);
        BinaryOperator<Integer> processNextElement = (total, nextVal) -> total + nextVal;
        int sum = values.stream().reduce(processNextElement).orElse(0);
        System.out.println("Sum : " + sum + "\n");
    }

    private static void reduceWithBinaryOperatorTwo() {
        List<String> values = Arrays.asList("My ", "Name ", "Is ", "Kawnayeen");
        System.out.println("List : " + values);
        BinaryOperator<String> concat = (total, nextStr) -> total.concat(nextStr);
        System.out.println("Concat : " +
                values.stream().reduce(concat).orElse("") +
                "\n"
        );
    }

    private static void reduceWithBinaryOperatorAndSeed() {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println("List : " + values);
        BinaryOperator<Integer> processNextElement = (total, nextVal) -> total + nextVal;
        int seed = 0;
        int sum = values.stream().reduce(seed, processNextElement);
        System.out.println("Sum : " + sum + "\n");
    }

    private static void ultimateReduction() {
        List<String> values = Arrays.asList("alif", "habib", "mim", "jannat", "gulshan", "azib", "mumi");
        System.out.println("List : " + values);
        Integer seed = 0;
        BiFunction<Integer, String, Integer> combinedLength = (partialLength, str) -> partialLength + str.length();
        BinaryOperator<Integer> mergeLength = (length1, length2) -> length1 + length2;
        int totalStrLength = values.stream().reduce(seed, combinedLength, mergeLength);
        System.out.println("Total String Length : " + totalStrLength);
    }
}
