package com.kawnayeen.java8._4_design_pattern._decorator;

import java.util.function.Function;

/**
 * Created by kawnayeen on 1/25/17.
 */
public class DecoratorUtil {
    public static Function<String, String> toUpperCase = e -> e.toUpperCase();
    public static Function<String, String> addUnderScorePrefix = e -> "_" + e;
}
