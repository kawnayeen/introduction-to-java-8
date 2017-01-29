package com.kawnayeen.java8.stream._3_stream_methods._1_intermediate_operation;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kawnayeen on 1/29/17.
 */
public class _6_Limit {
    public static void main(String[] args){
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);
        values.stream().skip(2).limit(2).forEach(System.out::println);
    }
}
