package com.kawnayeen.java8._7_vs_8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kawnayeen on 1/23/17.
 */
class SumSquareOfElementsTest {
    List<Integer> values;
    SumSquareOfElements sumSquareOfElements;

    @BeforeEach
    void init(){
        values = Arrays.asList(1,2,3,4,5);
        sumSquareOfElements = new SumSquareOfElements();
    }

    @Test
    void testInJava7(){
        Assertions.assertNotNull(values);
        Assertions.assertNotNull(sumSquareOfElements);
        Assertions.assertEquals(55,sumSquareOfElements.inJava7(values));
    }

    @Test
    void testInJava8(){
        Assertions.assertNotNull(values);
        Assertions.assertNotNull(sumSquareOfElements);
        Assertions.assertEquals(55,sumSquareOfElements.inJava8(values));
    }
}
