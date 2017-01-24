package com.kawnayeen.java8.sample.primenumber;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by kawnayeen on 1/23/17.
 */
public class PrimeGenerator {
    public List<Integer> generateFirstNPrime(int numberOfPrime) {
        List<Integer> temp = Stream.iterate(1, e -> e + 1)
                .filter(PrimeChecker::isPrime)
                .limit(numberOfPrime)
                .collect(Collectors.toList());
        return temp;
    }
}
