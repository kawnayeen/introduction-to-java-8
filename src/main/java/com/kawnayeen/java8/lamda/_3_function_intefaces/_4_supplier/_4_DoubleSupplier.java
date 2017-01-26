package com.kawnayeen.java8.lamda._3_function_intefaces._4_supplier;

import java.util.Random;
import java.util.function.DoubleSupplier;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _4_DoubleSupplier {
    public static void main(String[] args) {
        DoubleSupplier randomDouble = () -> new Random().nextDouble();

        System.out.println(randomDouble.getAsDouble());
        System.out.println(randomDouble.getAsDouble());
        System.out.println(randomDouble.getAsDouble());
    }
}
