package com.kawnayeen.java8.sample;

import com.kawnayeen.java8.sample.concurrency.ParallelListPrinting;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Created by kawnayeen on 1/24/17.
 */
class ParallelPrintingTest {
    @Test
    void testParallelPrinting() {
        List<Integer> values = Stream
                .iterate(1, e -> e + 1)
                .limit(10)
                .collect(toList());

        ParallelListPrinting parallelPrint = new ParallelListPrinting();
        System.out.println("Print supposed to be happen in parallel");
        parallelPrint.printList(values);
        System.out.println("Parallel printing ended");
    }
}
