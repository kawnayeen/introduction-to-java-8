package com.kawnayeen.java8._7_vs_8;

import java.util.List;

/**
 * Created by kawnayeen on 1/23/17.
 */
public class PrintList {

    public void inJava7(List<Integer> values) {
        for (int value : values)
            System.out.println(value);
    }

    public void inJava8(List<Integer> values) {
        values.forEach(System.out::println);
    }
}
