package com.kawnayeen.java8.sample.pattern._strategy;

/**
 * Created by kawnayeen on 1/24/17.
 */
public class StrategyUtil {
    public static boolean isEven(int value){
        return value % 2 == 0;
    }

    public static boolean isOdd(int value){
        return value % 2 == 1;
    }

    public static boolean isAny(int value){
        return true;
    }
}
