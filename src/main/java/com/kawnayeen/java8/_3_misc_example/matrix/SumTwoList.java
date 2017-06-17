package com.kawnayeen.java8._3_misc_example.matrix;

import com.kawnayeen.java8._3_misc_example._stream_util.StreamUtil;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by kawnayeen on 1/24/17.
 */
public class SumTwoList {

    /**
     * firstList & secondList need to be equal in length
     *
     * @param firstList
     * @param secondList
     * @return return the summation list
     */
    public List<Integer> sumTwoList(List<Integer> firstList, List<Integer> secondList) {
        if (firstList.size() != secondList.size())
            return null;

        return StreamUtil
                .zip(firstList.stream(), secondList.stream(), (a, b) -> a + b)
                .collect(toList());
    }
}
