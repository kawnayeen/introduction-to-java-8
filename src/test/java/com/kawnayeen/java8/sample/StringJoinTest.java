package com.kawnayeen.java8.sample;

import com.kawnayeen.java8.sample.string.StringJoin;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kawnayeen on 1/24/17.
 */
public class StringJoinTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream stdout;
    StringJoin stringJoin;
    List<String> strings;

    @BeforeEach
    void init() {
        stdout = System.out;
        System.setOut(new PrintStream(outputStream));
        strings = Arrays.asList("Me","Abbu","Ammu","Gulshan");
        stringJoin = new StringJoin();
    }

    @Test
    void testCommaSeparatedUppercaseJoining(){
        stringJoin.print(strings);
        Assertions.assertEquals("ME, ABBU, AMMU, GULSHAN\n",outputStream.toString());
    }

    @AfterEach
    void cleanUp() {
        System.setOut(stdout);
    }
}
