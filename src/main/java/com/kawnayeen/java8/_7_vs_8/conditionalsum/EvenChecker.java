package com.kawnayeen.java8._7_vs_8.conditionalsum;

/**
 * Created by kawnayeen on 1/23/17.
 */
public class EvenChecker implements NumberTypeChecker {
    @Override
    public boolean isOfCorrectType(int number) {
        return number % 2 == 0;
    }
}
