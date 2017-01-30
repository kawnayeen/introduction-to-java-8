package com.kawnayeen.java8.stream._1_stream_srouce;

import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * Created by kawnayeen on 1/29/17.
 */
public class _5_Pattern {
    public static void main(String[] args) {
        String str = "O Allah! Forgive me. Forgive me. Forgive my sin";
        Stream<String> stringStream = Pattern.compile(" ").splitAsStream(str);
        stringStream.forEach(System.out::println);
    }
}
