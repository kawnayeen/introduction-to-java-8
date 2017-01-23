package com.kawnayeen.java8._7_vs_8;

import java.util.List;

/**
 * Created by kawnayeen on 1/23/17.
 * <p>
 * Return the double of first even number greater than 3
 */
public class SearchElement {
    public int inJava7(List<Integer> values) {
        for (int value : values) {
            if (value > 3 && value % 2 == 0)
                return value * 2;
        }
        return 0;
    }

    public int inJava8(List<Integer> values) {
        return values.stream()
                .filter(value -> value > 3)
                .filter(value -> value % 2 == 0)
                .map(value -> value * 2)
                .findFirst()
                .orElse(0);
    }
}
