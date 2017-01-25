package com.kawnayeen.java8.lamda._2_references;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by kawnayeen on 1/25/17.
 */
public class _2_InstanceMethodReference {
    public static void main(String[] args) {
        Consumer<String> printIt = System.out::println;
        List<String> stringList = Arrays.asList("Kawnayeen", "Anan", "Boniyammen");

        for (String str : stringList)
            printIt.accept(str);
    }
}
