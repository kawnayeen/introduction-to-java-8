package com.kawnayeen.java8._1_lamda._3_function_intefaces._4_supplier;

import java.util.Random;
import java.util.function.IntSupplier;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _2_IntSupplier {
    public static void main(String[] args) {
        IntSupplier randomInt = () -> new Random().nextInt();

        System.out.println("Random int : " + randomInt.getAsInt());
        System.out.println("Random int : " + randomInt.getAsInt());
        System.out.println("Random int : " + randomInt.getAsInt());
    }
}
