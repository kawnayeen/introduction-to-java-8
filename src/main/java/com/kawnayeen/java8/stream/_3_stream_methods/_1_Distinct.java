package com.kawnayeen.java8.stream._3_stream_methods;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kawnayeen on 1/29/17.
 */
public class _1_Distinct {
    public static void main(String[] args){
        List<Integer> values = Arrays.asList(1,2,3,4,3,2,1,7,6,7);
        values.stream().distinct().forEach(System.out::println);
    }
}
