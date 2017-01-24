package com.kawnayeen.java8.sample;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

        return IntStream.range(0, firstList.size())
                .mapToObj(i -> firstList.get(i) + secondList.get(i))
                .collect(Collectors.toList());
    }
}
