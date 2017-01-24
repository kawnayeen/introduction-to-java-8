package com.kawnayeen.java8.sample;

import com.kawnayeen.java8.sample.primenumber.PrimeChecker;
import com.kawnayeen.java8.sample.primenumber.PrimeGenerator;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by kawnayeen on 1/23/17.
 */
public class PrimeCheckerTest {
    @Test
    void testIsPrime(){
        assertTrue(PrimeChecker.isPrime(3));
        assertTrue(PrimeChecker.isPrime(7));
        assertTrue(PrimeChecker.isPrime(11));
    }

    @Test
    void testIsNotPrime(){
        assertFalse(PrimeChecker.isPrime(4));
        assertFalse(PrimeChecker.isPrime(49));
        assertFalse(PrimeChecker.isPrime(15));
    }

    @Test
    void testGenerateFirst5PrimeNumber(){
        PrimeGenerator primeGenerator = new PrimeGenerator();
        List<Integer> first5Prime = primeGenerator.generateFirstNPrime(5);
        assertNotNull(first5Prime);
        assertEquals(5,first5Prime.size());
        first5Prime.forEach(System.out::println);
    }
}
