package com.kawnayeen.java8._2_stream._1_stream_srouce;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by kawnayeen on 1/29/17.
 */
public class _4_Randoms {
    private static Random random;

    public static void main(String[] args) {
        random = new Random();
        getIntStream();
        getIntStreamWithBound();
    }

    private static void getIntStream() {
        System.out.println("Generating int _2_stream with known size");
        IntStream intStream = random.ints(10);
        intStream.forEach(System.out::println);
        System.out.println();
    }

    private static void getIntStreamWithBound() {
        System.out.println("Generating int _2_stream with known size within bound");
        IntStream intStream = random.ints(10, 50, 100);
        intStream.forEach(System.out::println);
        System.out.println();
    }
}
