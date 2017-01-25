package com.kawnayeen.java8.sample.stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by kawnayeen on 1/25/17.
 */
public class UnboundedStreamTest {
    @Test
    void testCompute(){
        UnboundedStream unboundedStream = new UnboundedStream();
        Assertions.assertEquals(46104,unboundedStream.compute(121,51));
    }
}
