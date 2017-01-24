package com.kawnayeen.java8.sample.pattern;

import com.kawnayeen.java8.sample.pattern._execute_around.Resource;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by kawnayeen on 1/24/17.
 */
public class TestExecuteAroundPattern {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream stdout;

    @BeforeEach
    void init() {
        stdout = System.out;
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testExecuteAroundPattern() {
        Resource.use(resource -> {
            resource.op1();
            resource.op2();
        });
        Assertions.assertEquals("Deallocating Resources", getForthLineFromOutputStream());
    }

    String getForthLineFromOutputStream(){
        return outputStream.toString().split("\n")[3];
    }

    @AfterEach
    void cleanUp() {
        System.setOut(stdout);
    }
}
