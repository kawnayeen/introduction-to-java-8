package com.kawnayeen.java8._4_design_pattern._strategy;

import java.util.function.Predicate;

/**
 * Created by kawnayeen on 1/24/17.
 */
public class StrategyUtil {
    public static Predicate<Integer> isEven = e -> e % 2 == 0;
    public static Predicate<Integer> isOdd = e -> e % 2 == 1;
}
