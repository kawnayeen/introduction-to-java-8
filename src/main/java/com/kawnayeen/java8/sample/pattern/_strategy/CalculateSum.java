package com.kawnayeen.java8.sample.pattern._strategy;

import java.util.List;
import java.util.function.Predicate;

/**
 * Created by kawnayeen on 1/24/17.
 */
public class CalculateSum {
    public static int calculateSum(List<Integer> values, Predicate<Integer> strategy) {
        return values.stream()
                .filter(e -> strategy.test(e))
                .reduce(0, Integer::sum);
    }
}
