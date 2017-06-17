package com.kawnayeen.java8._3_misc_example.misc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by kawnayeen on 1/25/17.
 */
public class MiscExample01Test {
    @Test
    void testCompute(){
        MiscExample01 unboundedStream = new MiscExample01();
        Assertions.assertEquals(46104,unboundedStream.compute(121,51));
    }
}
