package com.kawnayeen.java8._1_lamda._3_function_intefaces._4_supplier;

import java.util.Random;
import java.util.function.BooleanSupplier;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _3_BooleanSupplier {
    public static void main(String[] args) {
        BooleanSupplier randomLuck = () -> new Random().nextBoolean();
        System.out.println(randomLuck.getAsBoolean());
        System.out.println(randomLuck.getAsBoolean());
        System.out.println(randomLuck.getAsBoolean());
    }
}
