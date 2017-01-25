package com.kawnayeen.java8.lamda._2_references;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created by kawnayeen on 1/25/17.
 */
public class _1_StaticMethodReference {
    public static void main(String[] args) {
        Function<String, Integer> stringToInteger = Integer::parseInt;
        List<String> stringList = Arrays.asList("1", "2", "3", "4");

        int totalSum = 0;
        for (String str : stringList) {
            totalSum += stringToInteger.apply(str);
        }

        System.out.println(totalSum);
    }
}
