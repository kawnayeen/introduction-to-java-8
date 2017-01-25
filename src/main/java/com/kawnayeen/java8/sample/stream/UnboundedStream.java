package com.kawnayeen.java8.sample.stream;

import java.util.stream.IntStream;

/**
 * Created by kawnayeen on 1/25/17.
 * <p>
 * Given a number k, and a count n,
 * find the total of double of n even number starting with k,
 * where sqrt of each number is > 20
 */
public class UnboundedStream {

    public int compute(int k, int n) {
        return IntStream.iterate(k, e -> e + 1)
                .filter(e -> e % 2 == 0)
                .filter(e -> Math.sqrt(e) > 20)
                .map(e -> e * 2)
                .limit(n)
                .sum();
    }
}
