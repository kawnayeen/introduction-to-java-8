package com.kawnayeen.java8._7_vs_8;

import com.kawnayeen.java8._7_vs_8.conditionalsum.AnyNumber;
import com.kawnayeen.java8._7_vs_8.conditionalsum.ConditionalSum;
import com.kawnayeen.java8._7_vs_8.conditionalsum.EvenChecker;
import com.kawnayeen.java8._7_vs_8.conditionalsum.OddChecker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Created by kawnayeen on 1/23/17.
 */
class ConditionalSumTest {
    List<Integer> values;
    ConditionalSum conditionalSum;

    @BeforeEach
    void init() {
        values = Arrays.asList(1, 2, 3, 4, 5, 6);
        conditionalSum = new ConditionalSum();
    }

    @Test
    void testSumOfEvenNumberInJava7() {
        assertNotNull(values);
        assertNotNull(conditionalSum);
        assertEquals(12, conditionalSum.inJava7(values, new EvenChecker()));
    }

    @Test
    void testSumOfEvenNumberInJava8() {
        assertNotNull(values);
        assertNotNull(conditionalSum);
        assertEquals(12, conditionalSum.inJava8(values, value -> value % 2 == 0));
    }

    @Test
    void testSumOfOddNumberInJava7(){
        assertNotNull(values);
        assertNotNull(conditionalSum);
        assertEquals(9, conditionalSum.inJava7(values, new OddChecker()));
    }

    @Test
    void testSumOfOddNumberInJava8() {
        assertNotNull(values);
        assertNotNull(conditionalSum);
        assertEquals(9, conditionalSum.inJava8(values, value -> value % 2 == 1));
    }

    @Test
    void testSumOfAllNumberInJava7(){
        assertNotNull(values);
        assertNotNull(conditionalSum);
        assertEquals(21, conditionalSum.inJava7(values, new AnyNumber()));
    }

    @Test
    void testSumOfAllNumberInJava8() {
        assertNotNull(values);
        assertNotNull(conditionalSum);
        assertEquals(21, conditionalSum.inJava8(values, value -> true));
    }
}
