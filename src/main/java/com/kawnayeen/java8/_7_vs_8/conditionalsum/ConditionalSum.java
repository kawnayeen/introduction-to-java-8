package com.kawnayeen.java8._7_vs_8.conditionalsum;

import java.util.List;
import java.util.function.Predicate;

/**
 * Created by kawnayeen on 1/23/17.
 */
public class ConditionalSum {
    public int inJava7(List<Integer> values, NumberTypeChecker typeChecker) {
        int total = 0;
        for (int value : values) {
            if (typeChecker.isOfCorrectType(value))
                total += value;
        }
        return total;
    }

    public int inJava8(List<Integer> values, Predicate<Integer> selector) {
        return values.stream()
                .filter(value -> selector.test(value))
                .reduce(0, (carry, value) -> carry + value);
    }
}

