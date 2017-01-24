package com.kawnayeen.java8._7_vs_8;

import java.util.List;

/**
 * Created by kawnayeen on 1/23/17.
 */
public class SumListElements {
    public int inJava7(List<Integer> values) {
        int total = 0;
        for (int value : values)
            total += value;
        return total;
    }

    public int inJava8(List<Integer> values) {
        return values.stream()
                .reduce(0, Integer::sum);
    }
}
