package com.kawnayeen.java8.lamda._3_function_intefaces._2_Function;

import java.util.function.IntToDoubleFunction;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _8_IntToDoubleFunction {
    private static final double PI = 3.1416;

    public static void main(String[] args) {
        IntToDoubleFunction findSinInDegree = degree -> Math.sin((degree * PI)/180);
        int firstValue = 45;
        int secondValue = 60;

        System.out.println("Sin("+firstValue+" degrees) = "+findSinInDegree.applyAsDouble(firstValue));
        System.out.println("Sin("+secondValue+" degrees) = "+findSinInDegree.applyAsDouble(secondValue));
    }
}
