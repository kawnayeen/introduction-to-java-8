package com.kawnayeen.java8.sample.pattern;

import com.kawnayeen.java8.sample.pattern._decorator.DecoratorUtil;
import com.kawnayeen.java8.sample.pattern._decorator.StringProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by kawnayeen on 1/25/17.
 */
public class TestDecoratorPatter {

    @Test
    void testStringProcessor() {
        StringProcessor stringProcessor = new StringProcessor();
        stringProcessor.setFilter(DecoratorUtil.toUpperCase);
        String initialInput = "anan";
        Assertions.assertEquals("ANAN", stringProcessor.getProcessedString(initialInput));
        stringProcessor.setFilter(DecoratorUtil.toUpperCase,
                DecoratorUtil.addUnderScorePrefix);
        Assertions.assertEquals("_ANAN", stringProcessor.getProcessedString(initialInput));
    }
}
