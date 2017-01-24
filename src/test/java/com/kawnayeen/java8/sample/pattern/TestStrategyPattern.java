package com.kawnayeen.java8.sample.pattern;

import com.kawnayeen.java8.sample.pattern._strategy.CalculateSum;
import com.kawnayeen.java8.sample.pattern._strategy.StrategyUtil;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by kawnayeen on 1/24/17.
 */
public class TestStrategyPattern {

    @Test
    void testCalculateSum(){
        List<Integer> values = Arrays.asList(1,2,3,4,5,6);
        assertEquals(12,CalculateSum.calculateSum(values, StrategyUtil::isEven));
        assertEquals(9,CalculateSum.calculateSum(values, StrategyUtil::isOdd));
        assertEquals(12,CalculateSum.calculateSum(values, StrategyUtil::isAny));
    }
}
