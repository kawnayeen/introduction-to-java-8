package com.kawnayeen.java8.stream._2_stream_static_methods;

import java.util.stream.Stream;

/**
 * Created by kawnayeen on 1/29/17.
 */
public class _3_Of {
    public static void main(String[] args) {
        Stream.of("my", "name", "is", "kawnayeen").forEach(System.out::println);
    }
}
