package com.kawnayeen.java8._7_vs_8;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Created by kawnayeen on 1/23/17.
 */
class PrintListTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    List<Integer> values;
    PrintList printList;

    @BeforeEach
    void init() {
        values = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.setOut(new PrintStream(outputStream));
        printList = new PrintList();
    }

    @Test
    void testJava7() {
        assertNotNull(values);
        assertNotNull(printList);
        printList.inJava7(values);
        assertNotNull(outputStream.toString());
        assertEquals("1\n2\n3\n4\n5\n6\n", outputStream.toString());
    }

    @Test
    void testJava8() {
        assertNotNull(values);
        assertNotNull(printList);
        printList.inJava8(values);
        assertNotNull(outputStream.toString());
        assertEquals("1\n2\n3\n4\n5\n6\n", outputStream.toString());
    }

    @AfterEach
    void cleanUp() {
        System.setOut(null);
    }
}
