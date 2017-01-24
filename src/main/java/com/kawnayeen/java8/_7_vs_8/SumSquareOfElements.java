package com.kawnayeen.java8._7_vs_8;

import java.util.List;

/**
 * Created by kawnayeen on 1/23/17.
 * <p>
 * Given a list, this call will calculate the sum of square of each elements
 */
public class SumSquareOfElements {
    public int inJava7(List<Integer> values) {
        int total = 0;
        for (int value : values)
            total += value * value;
        return total;
    }

    public int inJava8(List<Integer> values) {
        return values.stream()
                .map(value -> value * value)
                .reduce(0, Integer::sum);
    }
}
