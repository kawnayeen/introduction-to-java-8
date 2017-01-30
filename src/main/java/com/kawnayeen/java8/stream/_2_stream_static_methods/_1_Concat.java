package com.kawnayeen.java8.stream._2_stream_static_methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by kawnayeen on 1/29/17.
 */
public class _1_Concat {
    public static void main(String[] args) {
        List<Integer> firstList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> secondList = Arrays.asList(9, 4, 7, 14);
        Stream<Integer> allIntegerStream = Stream.concat(firstList.stream(), secondList.stream());
        allIntegerStream.forEach(System.out::println);
    }
}
