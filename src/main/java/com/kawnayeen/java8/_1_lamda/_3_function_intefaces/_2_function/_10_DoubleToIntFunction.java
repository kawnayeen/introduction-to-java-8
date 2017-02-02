package com.kawnayeen.java8._1_lamda._3_function_intefaces._2_function;

import java.util.function.DoubleToIntFunction;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _10_DoubleToIntFunction {
    public static void main(String[] args) {
        DoubleToIntFunction diode = doubleValue -> doubleValue >= 2.5 ? 1 : 0;

        System.out.println("diode (2.9) --> " + diode.applyAsInt(2.9));
        System.out.println("diode (1.9) --> " + diode.applyAsInt(1.9));
    }
}
