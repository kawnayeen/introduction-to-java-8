package com.kawnayeen.java8.stream._3_stream_methods;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kawnayeen on 1/29/17.
 */
public class _3_Map {
    public static void main(String[] args){
        mapExample();
        mapToIntExample();
    }

    private static void mapExample(){
        List<String> strings = Arrays.asList("Is","It","Okay","Really");
        strings.stream().map(String::toLowerCase).forEach(System.out::println);
    }

    private static void mapToIntExample(){
        List<String> strings = Arrays.asList("Is","It","Okay","Really");
        int totalLength = strings.stream().mapToInt(String::length).sum();
        System.out.println("Total Length = "+totalLength);
    }
}
