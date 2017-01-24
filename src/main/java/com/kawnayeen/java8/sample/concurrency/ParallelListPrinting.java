package com.kawnayeen.java8.sample.concurrency;

import java.util.List;

/**
 * Created by kawnayeen on 1/24/17.
 */
public class ParallelListPrinting {
    public void printList(List<Integer> values) {
        values.parallelStream().forEach(System.out::println);
    }
}
