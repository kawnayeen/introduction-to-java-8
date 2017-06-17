package com.kawnayeen.java8._3_misc_example.concurrency;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kawnayeen on 1/24/17.
 */
public class ParallelListPrinting {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        ParallelListPrinting parallelListPrinting = new ParallelListPrinting();
        parallelListPrinting.printList(values);
    }

    public void printList(List<Integer> values) {
        values.parallelStream().forEach(System.out::println);
    }
}
