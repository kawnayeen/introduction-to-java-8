package com.kawnayeen.java8._4_design_pattern;

import com.kawnayeen.java8._4_design_pattern._strategy.CalculateSum;
import com.kawnayeen.java8._4_design_pattern._strategy.StrategyUtil;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by kawnayeen on 1/24/17.
 */
class TestStrategyPattern {

    @Test
    void testCalculateSum(){
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);
        assertEquals(12,CalculateSum.calculateSum(values, StrategyUtil.isEven));
        assertEquals(9,CalculateSum.calculateSum(values, StrategyUtil.isOdd));
        assertEquals(21,CalculateSum.calculateSum(values, StrategyUtil.isEven.or(StrategyUtil.isOdd)));
    }
}
