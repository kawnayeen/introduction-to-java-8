package com.kawnayeen.java8._3_misc_example;

import com.kawnayeen.java8._3_misc_example.matrix.SumTwoList;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.range;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Created by kawnayeen on 1/24/17.
 */
public class SumTwoListTest {

    @Test
    void testSumTwoListWithValidInput(){
        List<Integer> listOne = range(0,5).mapToObj(e->e+1).collect(toList());
        List<Integer> listTwo = range(5,10).mapToObj(e->e+1).collect(toList());
        SumTwoList sumTwoList = new SumTwoList();
        assertNotNull(sumTwoList);
        List<Integer> summationList = sumTwoList.sumTwoList(listOne,listTwo);
        assertNotNull(summationList);
        assertEquals(new Integer(7),summationList.get(0));
    }
}
