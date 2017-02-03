package com.kawnayeen.java8._4_design_pattern;

import com.kawnayeen.java8._4_design_pattern._decorator.DecoratorUtil;
import com.kawnayeen.java8._4_design_pattern._decorator.StringProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by kawnayeen on 1/25/17.
 */
class TestDecoratorPatter {

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
