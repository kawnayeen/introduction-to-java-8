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
class SearchElementTest {
    List<Integer> values;
    SearchElement searchElement;

    @BeforeEach
    void init() {
        values = Arrays.asList(1, 2, 3, 6, 5, 4, 7);
        searchElement = new SearchElement();
    }

    @Test
    void testInJava7() {
        assertNotNull(values);
        assertNotNull(searchElement);
        assertEquals(12, searchElement.inJava7(values));
    }

    @Test
    void testInJava8() {
        assertNotNull(values);
        assertNotNull(searchElement);
        assertEquals(12, searchElement.inJava8(values));
    }
}
