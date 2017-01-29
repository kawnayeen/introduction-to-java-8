package com.kawnayeen.java8.stream._3_stream_methods;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
 * Created by kawnayeen on 1/29/17.
 */
public class _2_Filter {
    public static void main(String[] args) {
        filteringEvenNumber();
        filteringStringLessThan5CharLong();
    }

    private static void filteringEvenNumber() {
        System.out.println();
        IntPredicate isEven = value -> value % 2 == 0;
        int[] values = new int[]{1, 2, 3, 4, 5, 6};
        Arrays.stream(values).filter(isEven).forEach(System.out::println);
        System.out.println();
    }

    private static void filteringStringLessThan5CharLong(){
        System.out.println();
        Predicate<String> lessThan5Chars = value->value.length()<5;
        List<String> strings = Arrays.asList("Kawnayeen","Anan","Gulshan","Gulu");
        strings.stream().filter(lessThan5Chars).forEach(System.out::println);
        System.out.println();
    }
}
