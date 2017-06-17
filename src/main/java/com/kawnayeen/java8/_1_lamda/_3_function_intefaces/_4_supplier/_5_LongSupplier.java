package com.kawnayeen.java8._1_lamda._3_function_intefaces._4_supplier;

import java.util.Random;
import java.util.function.LongSupplier;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _5_LongSupplier {

    public static void main(String[] args) {
        LongSupplier randomLong = () -> new Random().nextLong();

        System.out.println(randomLong.getAsLong());
        System.out.println(randomLong.getAsLong());
    }
}
