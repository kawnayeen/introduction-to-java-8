package com.kawnayeen.java8._7_vs_8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Created by kawnayeen on 1/23/17.
 */
class SumListElementsTest {
    List<Integer> values;
    SumListElements sumListElements;

    @BeforeEach
    void init(){
        values = Arrays.asList(1,2,3,4,5,6);
        sumListElements = new SumListElements();
    }

    @Test
    void testJava7(){
        assertNotNull(sumListElements);
        assertNotNull(values);
        assertEquals(21,sumListElements.inJava7(values));
    }

    @Test
    void testJava8(){
        assertNotNull(sumListElements);
        assertNotNull(values);
        assertEquals(21,sumListElements.inJava8(values));
    }
}
