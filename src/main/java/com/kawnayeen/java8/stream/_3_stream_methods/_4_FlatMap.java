package com.kawnayeen.java8.stream._3_stream_methods;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * Created by kawnayeen on 1/29/17.
 */
public class _4_FlatMap {
    public static void main(String[] args){
        List<String> strings = Arrays.asList(
                "Hi kawnayeen!!!",
                "Fear Allah",
                "All thanks belong to Allah");
        Function<String, Stream<String>> streamOfWords = str -> Pattern.compile(" ").splitAsStream(str);
        strings.stream().flatMap(streamOfWords).forEach(System.out::println);
    }
}
