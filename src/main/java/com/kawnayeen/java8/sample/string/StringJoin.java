package com.kawnayeen.java8.sample.string;

import java.util.List;

import static java.util.stream.Collectors.joining;

/**
 * Created by kawnayeen on 1/24/17.
 *
 * Given a list of name, we will convert them to uppercase and print them
 * in comma separated fashion
 */
public class StringJoin {

    public void print(List<String> names){
        System.out.println(
                names.stream()
                        .map(String::toUpperCase)
                        .collect(joining(", "))
        );
    }
}
