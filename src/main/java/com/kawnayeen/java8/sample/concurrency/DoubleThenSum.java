package com.kawnayeen.java8.sample.concurrency;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kawnayeen on 1/24/17.
 */
public class DoubleThenSum {

    public int doubleIt(int number) {
        System.out.println(number + " : " + Thread.currentThread());
        return number * 2;
    }

    public int doubleThenSum(List<Integer> values) {
        return values.parallelStream().map((number) -> doubleIt(number)).reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        DoubleThenSum doubleThenSum = new DoubleThenSum();
        System.out.println(doubleThenSum.doubleThenSum(values));
    }
}
