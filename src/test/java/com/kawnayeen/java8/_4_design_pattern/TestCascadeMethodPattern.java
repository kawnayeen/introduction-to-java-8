package com.kawnayeen.java8._4_design_pattern;

import com.kawnayeen.java8._4_design_pattern._cascade_method.Mailer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by kawnayeen on 1/24/17.
 */
public class TestCascadeMethodPattern {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream stdout;

    @BeforeEach
    void init() {
        stdout = System.out;
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testExecuteAroundPattern() {

        Mailer.send(
                mailer -> {
                    mailer.from("kk@pgs.com")
                            .to("tj@pgs.com")
                            .subject("Hi")
                            .body("How are you?");
                });

        Assertions.assertEquals("From : kk@pgs.com", getSenderFromOutputStream());
        Assertions.assertEquals("To : tj@pgs.com", getToFromOutputStream());
    }

    String getSenderFromOutputStream() {
        return outputStream.toString().split("\n")[1];
    }

    String getToFromOutputStream() {
        return outputStream.toString().split("\n")[2];
    }

    String getSubjectFromOutputStream(){
        return outputStream.toString().split("\n")[3];
    }

    @AfterEach
    void cleanUp() {
        System.setOut(stdout);
    }
}
