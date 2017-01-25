package com.kawnayeen.java8.lamda._1_syntax;

/**
 * Created by kawnayeen on 1/25/17.
 */
public class _2_SingleParameter {
    private static SuperCoolStringUtility stringUtility = str -> str.toUpperCase();

    public static void main(String[] args) {
        String awkwardString = "i am awkward";
        System.out.println("Original String : " + awkwardString);
        System.out.println("Coolifying it --> " + stringUtility.coolify(awkwardString));
    }
}

interface SuperCoolStringUtility {
    String coolify(String string);
}
