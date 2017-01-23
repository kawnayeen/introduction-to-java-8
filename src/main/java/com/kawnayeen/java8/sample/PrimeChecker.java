package com.kawnayeen.java8.sample;

import java.util.stream.IntStream;

/**
 * Created by kawnayeen on 1/23/17.
 */
public class PrimeChecker {
    public static boolean isPrime(int number) {
        return number > 1 &&
                IntStream.range(2, number)
                        .noneMatch(i -> number % i == 0);
    }
}
