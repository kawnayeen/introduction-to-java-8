package com.kawnayeen.java8.sample.pattern;

import com.kawnayeen.java8.sample.pattern._cascade_method.ResourceCascade;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by kawnayeen on 1/24/17.
 */
public class TestCascadeAroundPattern {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream stdout;

    @BeforeEach
    void init() {
        stdout = System.out;
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testExecuteAroundPattern() {
        ResourceCascade.use(resource -> {
            resource.op1().op2();
        });
        Assertions.assertEquals("Deallocating Resource Cascade", getForthLineFromOutputStream());
    }

    String getForthLineFromOutputStream() {
        return outputStream.toString().split("\n")[3];
    }

    @AfterEach
    void cleanUp() {
        System.setOut(stdout);
    }
}
